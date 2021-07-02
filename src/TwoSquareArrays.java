import java.util.Arrays;

public class TwoSquareArrays {
    public static int[] collectArray(int[][] left, int[][] right) {
        int[] array = new int[(int) Math.pow(left.length, 2)];
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < left[i].length; j++) {
                array[i * left.length + j] = (left[i][j] > right[i][j]) ? left[i][j] : right[i][j];
            }
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(collectArray(new int[][]{{75, 1}, {35, 100}}, new int[][]{{33, 10}, {125, 99}})));
    }
}
