import java.util.Arrays;

public class OrArray {
    public static int[] or(int[] left, int[] right) {
        if (left.length == 0) {
            return right.clone();
        }
        if (right.length == 0) {
            return left.clone();
        }
        int[] list = new int[left.length + right.length];
        int size = 0;
        for (int i : left) {
            for (int j : right) {
                if (i != j) {
                    if (isNonIncludeInArray(list, i)) {
                        list[size++] = i;
                    }
                    if (isNonIncludeInArray(list, j)) {
                        list[size++] = j;
                    }
                }
            }
        }
        return Arrays.copyOf(list, size);
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
        System.out.println(Arrays.toString(or(new int[] {1, 2, 5, 9}, new int[] {1, 7, 5, 10})));
    }
}
