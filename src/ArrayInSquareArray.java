public class ArrayInSquareArray {
    public static int[][] convertArray(int[] array) {
        int sizeOfSquareArray;
        if (array.length == 1) {
            sizeOfSquareArray = 1;
        } else if (array.length <= 4) {
            sizeOfSquareArray = 2;
        } else if (array.length % ((int) Math.sqrt(array.length)) == 0) {
            sizeOfSquareArray = (int) Math.sqrt(array.length);
        } else {
            sizeOfSquareArray = (int) Math.sqrt(array.length) + 1;
        }
        int[][] newArray = new int[sizeOfSquareArray][sizeOfSquareArray];
        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < newArray[i].length; j++) {
                if ((i * sizeOfSquareArray + j) <= (array.length - 1)) {
                    newArray[i][j] = array[i * sizeOfSquareArray + j];
                } else {
                    newArray[i][j] = 0;
                }
            }
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[][] newArray = convertArray(new int[]{1, 2, 3, 4, 10, 15, 89, 0, 125, 789});
        for (int[] a: newArray) {
            for (int b: a) {
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
}
