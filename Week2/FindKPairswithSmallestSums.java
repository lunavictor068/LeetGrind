import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class FindKPairswithSmallestSums {

    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<List<Integer>> pairPQ = new PriorityQueue<>(Comparator.comparing((List<Integer> a) -> a.get(0) + a.get(1)));
        for (int i : nums1) {
            for (int j : nums2) {
                List<Integer> pair = new ArrayList<>();
                pair.add(i);
                pair.add(j);
                pairPQ.add(pair);
            }
        }
        List<List<Integer>> kSmallestPairs = new ArrayList<>();
        for (int i = 0; i < k && !pairPQ.isEmpty(); i++) {
            kSmallestPairs.add(pairPQ.poll());
        }
        return kSmallestPairs;
    }

}