public class Fibonacci {
    public static boolean checkArray(int[] data) {
        for (int i = 2; i < data.length; i++) {
            if (data[i] != data[i - 1] + data[i - 2]) {
                return false;
            }
        }
        return true;
    }
}
