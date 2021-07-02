public class MaxLengthSeria {
    public static int find(int[] array) {
        if (array.length == 0) {
            return 0;
        } else if (array.length == 1) {
            return 1;
        }
        int count = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] >= array[i - 1]) {
                count++;
            } else {
                count = 1;
            }
        }
        return count;
    }
}
