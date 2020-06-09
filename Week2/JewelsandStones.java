import java.util.HashMap;
import java.util.HashSet;

public class JewelsandStones {

    public int numJewelsInStones(String J, String S) {
        HashSet<Character> jewels = new HashSet<>();
        for (char c : J.toCharArray()) {
            jewels.add(c);
        }

        int totalJewels = 0;

        for (char c : S.toCharArray()) {
            if (jewels.contains(c)) {
                totalJewels ++;
            }
        }

        return totalJewels;
    }

}
