import java.util.*;

public class SortCharactersByFrequency {
    public String frequencySort(String s) {
        HashMap<Character, Integer> counts = new HashMap<>();
        for (Character c : s.toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Map.Entry<Character, Integer>> countQ = new PriorityQueue<>(
                (a, b) -> Integer.compare(b.getValue(), a.getValue())
        );
        countQ.addAll(counts.entrySet());
        StringBuilder sb = new StringBuilder();
        while (!countQ.isEmpty()) {
            Map.Entry<Character, Integer> mostFrequentCharacter = countQ.poll();
            char c = mostFrequentCharacter.getKey();
            int count = mostFrequentCharacter.getValue();
            for (int i = 0; i < count; i++) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}