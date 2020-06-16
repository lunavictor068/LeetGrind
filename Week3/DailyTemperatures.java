public class DailyTemperatures {
    public int[] dailyTemperatures(int[] T) {
        int[] daysToWait = new int[T.length];

        for (int i = 0; i < T.length; i++) {
            int days = 0;
            for (int j = i + 1; j < T.length; j++) {
                if (T[j] > T[i]) {
                    days = j - i;
                    break;
                }
            }
            daysToWait[i] = days;
        }
        return daysToWait;
    }
}
