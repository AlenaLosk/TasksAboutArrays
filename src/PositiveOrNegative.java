public class PositiveOrNegative {
    public static boolean check(int[] data) {
        int counterPlus = 0;
        int counterMinus = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] > 0) {
                counterPlus++;
            } else {
                counterMinus++;
            }
        }
        return counterMinus % 2 != 0 && counterPlus % 2 != 0;
    }
}
