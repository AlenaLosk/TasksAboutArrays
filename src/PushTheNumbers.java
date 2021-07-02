import java.util.Arrays;

public class PushTheNumbers {
    public static void push(int[][] array, int row, int column) {
        int temp = array[row][column];
        array[row][column] = 0;

        if (column != 0) {
            int temp1 = 0;
            int temp2 = temp;
            for (int i = column - 1; i >= 0; i--) {
                temp1 = array[row][i];
                array[row][i] = temp2;
                temp2 = temp1;
            }
        }
        if (column != array.length - 1) {
            int temp1 = 0;
            int temp2 = temp;
            for (int i = column + 1; i < array.length; i++) {
                temp1 = array[row][i];
                array[row][i] = temp2;
                temp2 = temp1;
            }
        }
        if (row != 0) {
            int temp1 = 0;
            int temp2 = temp;
            for (int i = row - 1; i >= 0; i--) {
                temp1 = array[i][column];
                array[i][column] = temp2;
                temp2 = temp1;
            }
        }
        if (row != array.length - 1) {
            int temp1 = 0;
            int temp2 = temp;
            for (int i = row + 1; i < array.length; i++) {
                temp1 = array[i][column];
                array[i][column] = temp2;
                temp2 = temp1;
            }
        }
    }

    public static void main(String[] args) {
        int[][] array = new int[][]{
                {62, 12, 86, 96, 2},
                {78, 98, 10, 45, 86},
                {82, 59, 47, 88, 79},
                {99, 10, 91, 73, 88},
                {32, 48, 8, 87, 55}};
        push(array, 2, 2);
        System.out.println(Arrays.deepToString(array));
    }
}
