import java.util.Arrays;

public class RightDiagonal {
    public static int[] diagonal(int[][] data) {
        int[] array = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            array[i] = data[i][data.length - i - 1];
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(diagonal(new int[][]{{1, 3, 5}, {10, 15, 20}, {100, 200, 300}})));
    }
}
