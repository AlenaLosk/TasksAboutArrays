public class NoConsecutive {
    public static int find(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            if (Math.abs(data[i + 1] - data[i]) != 1) {
                return data[i + 1];
            }
        }
        return -1;
    }
}
