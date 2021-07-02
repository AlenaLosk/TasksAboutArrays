import java.util.Arrays;

public class EditorElementsArray {
    public static int[][] changeData(int[][] array, int el) {
        int[][] newArray = Arrays.copyOf(array, array.length);
        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < newArray[i].length; j++) {
                if (newArray[i][j] > el) {
                    newArray[i][j] = newArray[i][j] - el;
                } else {
                    newArray[i][j] = 0;
                }
            }
        }
        return newArray;
    }
}
