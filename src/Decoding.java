public class Decoding {
    public static int[] decode(int[] ints, int number) {
        int[] array = new int[ints.length];
        for (int i = 0; i < ints.length; i++) {
            array[i] = ints[i] % number;
        }
        return array;
    }
}
