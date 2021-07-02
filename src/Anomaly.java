import java.util.Arrays;

public class Anomaly {
    public static int[][] found(int[] data, int up, int down) {
        int[][] result = new int[data.length][];
        int[] temp = new int[data.length];
        int counter1 = 0;
        int counter2 = 0;
        for (int i = 0; i < result.length; i++) {
            if (data[i] <= down || data[i] >= up) {
                temp[counter1++] = i;
                if (i == result.length - 1) {
                    result[counter2++] = Arrays.copyOf(temp, counter1);
                }
            }
            if (counter1 > 0 && (data[i] > down && data[i] < up)) {
                result[counter2++] = Arrays.copyOf(temp, counter1);
                counter1 = 0;
            }
        }
        result = Arrays.copyOf(result, counter2);
        if (result.length == 1 && result[0].length == 1) {
            result = new int[][] {{result[0][0], result[0][0]}};
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(found(new int[] {5, 16, 17, 15, 10, 1, 2}, 17, 0)));
    }
}
