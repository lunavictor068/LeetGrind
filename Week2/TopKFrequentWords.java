import java.util.*;
import java.util.function.Function;

public class TopKFrequentWords {

    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> wordCounts = new HashMap<>();
        for (String s : words) {
            wordCounts.put(s, wordCounts.getOrDefault(s, 0) + 1);
        }

        PriorityQueue<Map.Entry<String, Integer>> topFrequentWords = new PriorityQueue<>(
                Comparator.comparing((Function<Map.Entry<String, Integer>, Integer>) Map.Entry::getValue).reversed()
                        .thenComparing(Map.Entry::getKey)
        );
        topFrequentWords.addAll(wordCounts.entrySet());
        List<String> topKFrequentWords = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            topKFrequentWords.add(topFrequentWords.poll().getKey());
        }
        return topKFrequentWords;
    }
}