import java.util.Arrays;

public class SymmetricDiff {
    public static int[] diff(int[] left, int[] right) {
        if (left.length == 0) {
            return right.clone();
        }
        if (right.length == 0) {
            return left.clone();
        }
        int[] list = new int[left.length + right.length];
        int size = 0;
        for (int j = 0; j < right.length; j++) {
            for (int i = 0; i < left.length; i++) {
                if (left[i] != right[j]) {
                    if (isNonIncludeInArray(right, left[i]) && isNonIncludeInArray(list, left[i])) {
                        list[size++] = left[i];
                    }
                    if (isNonIncludeInArray(left, right[j]) && isNonIncludeInArray(list, right[j])) {
                        list[size++] = right[j];
                    }
                }
            }
        }
        int[] array = Arrays.copyOf(list, size);
        Arrays.sort(array);
        return array;
    }

    public static boolean isNonIncludeInArray(int[] array, int number) {
        if (array.length == 0) {
            return true;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(diff(new int[]{1, 2}, new int[]{3, 4})));
    }
}
