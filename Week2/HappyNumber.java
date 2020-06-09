import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class HappyNumber {

    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }

    public static boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();
        int sumOfSquaresOfDigits = sumOfSquaresOfDigits(n);
        while (!seen.contains(sumOfSquaresOfDigits)) {
            System.out.println(sumOfSquaresOfDigits);
            if (sumOfSquaresOfDigits == 1) {
                return true;
            }
            else {
                seen.add(sumOfSquaresOfDigits);
                sumOfSquaresOfDigits = sumOfSquaresOfDigits(sumOfSquaresOfDigits);
            }
        }
        return false;

    }

    public static int sumOfSquaresOfDigits(int n) {
        ArrayList<Integer> digits = new ArrayList<>();
        while (n > 0) {
            int digit = n % 10;
            digits.add(digit);
            n /= 10;
        }
        //square
        for (int i = 0; i < digits.size(); i++) {
            digits.set(i, digits.get(i) * digits.get(i));
        }
        System.out.println(digits);
        int sum = digits.stream().mapToInt(digit -> digit).sum();
        return sum;
    }
}