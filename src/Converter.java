public class Converter {
    public static int[][] convertInSquareArray(int[][] array) {
        int sizeOfBaseArray = 0;
        for (int[] a: array) {
            sizeOfBaseArray = sizeOfBaseArray + a.length;
        }
        int[] simpleArray = new int[sizeOfBaseArray];
        int x = 0;
        for (int[] a: array) {
            for (int b: a) {
                simpleArray[x++] = b;
            }
        }
        int sizeOfSquareArray;
        if (simpleArray.length == 1) {
            sizeOfSquareArray = 1;
        } else if (simpleArray.length <= 4) {
            sizeOfSquareArray = 2;
        } else if (simpleArray.length % ((int) Math.sqrt(simpleArray.length)) == 0) {
            sizeOfSquareArray = (int) Math.sqrt(simpleArray.length);
        } else {
            sizeOfSquareArray = (int) Math.sqrt(simpleArray.length) + 1;
        }
        int[][] newArray = new int[sizeOfSquareArray][sizeOfSquareArray];
        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < newArray[i].length; j++) {
                if ((i * sizeOfSquareArray + j) <= (simpleArray.length - 1)) {
                    newArray[i][j] = simpleArray[i * sizeOfSquareArray + j];
                } else {
                    newArray[i][j] = 0;
                }
            }
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[][] newArray = convertInSquareArray(new int[][]{{1, 2, 3, 4}, {10, 15}, {89}, {0, 125, 789}});
        for (int[] a: newArray) {
            for (int b: a) {
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
}
