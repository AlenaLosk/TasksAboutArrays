import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeRows {
    public static int[] merge(int[][] data) {
        int totalLength = 0;
        for (int[] a: data) {
            totalLength = totalLength + a.length;
        }
        int[] array = new int[totalLength];
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                array[count] = data[i][j];
                count++;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(merge(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}})));
    }
}
