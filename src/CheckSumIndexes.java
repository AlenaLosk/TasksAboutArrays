import java.util.Arrays;

public class CheckSumIndexes {
    public static int[] collectNewArray(int[][] data, int sum) {
        int[] array = new int[(int) Math.pow(data.length, 2)];
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (i + j != sum) {
                    array[count++] = data[i][j];
                }
            }
        }
        return Arrays.copyOf(array, count);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(collectNewArray(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}}, 3)));
    }
}
