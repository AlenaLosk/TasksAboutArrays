public class SubtractMinMax {
    public static int calculate(int[] ints) {
        int max = ints[0];
        int min = ints[0];
        for (int i = 0; i < ints.length - 1; i++) {
            max = Math.max(max, ints[i + 1]);
            min = Math.min(min, ints[i + 1]);
        }
        return max - min;
    }
}
