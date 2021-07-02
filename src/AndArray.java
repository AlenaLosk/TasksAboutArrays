import java.util.Arrays;

public class AndArray {
    public static int[] and(int[] left, int[] right) {
        int[] list = (left.length >= right.length) ? new int[left.length] : new int[right.length];
        int size = 0;
        if (left.length == 0 || right.length == 0) {
            return new int[0]; //корректно для {1, 2, 3} vs {}; {} vs {1, 2, 3} - не нужно проходить код ниже
        }
        for (int i : left) {
            for (int j : right) {
                if (i == j) {
                    list[size++] = i;
                }
            }
        }
        return Arrays.copyOf(list, size);
    }
}
