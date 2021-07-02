public class ArrayWithoutEvenElements {
    public static int[] changeData(int[] data) {
        int counter = 0;
        for (int e : data) {
            if (e % 2 != 0) {
                counter++;
            }
        }
        int[] newArray = new int[counter];
        int i = 0;
        for (int j = 0; j < data.length; j++) {
            if (data[j] % 2 != 0) {
                newArray[i++] = data[j];
            }
        }
        return newArray;
    }
}
