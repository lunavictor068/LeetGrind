import java.util.HashMap;

public class IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {
        return toNumberString(s).equals(toNumberString(t));

    }

    public static String toNumberString(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        HashMap<Character, Integer> letterToCount = new HashMap<>();
        char[] sChars = s.toCharArray();
        int letterCount = 0;
        for (int i = 0; i < sChars.length; i++) {
            char c = sChars[i];
            if (letterToCount.containsKey(c)) {
                stringBuilder.append(letterToCount.get(c));
            }
            else {
                letterToCount.put(c, letterCount);
                stringBuilder.append(letterCount);
                letterCount++;
            }
        }
        return stringBuilder.toString();
    }

}
