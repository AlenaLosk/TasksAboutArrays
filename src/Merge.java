import java.util.Arrays;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        if (left.length == 0 && right.length == 0) {
            return left.clone();
        }
        if (left.length == 0) {
            return right.clone();
        }
        if (right.length == 0) {
            return left.clone();
        }
        int[] rsl = new int[left.length + right.length];
        int count = 0;
        int i = 0;
        int j = 0;
        while (i < left.length) {
            while (j < right.length) {
                if (left[i] > right[j]) {
                    rsl[count++] = right[j++];
                    if (j == right.length) {
                        while (i < left.length) {
                            rsl[count++] = left[i++];
                        }
                    }
                } else if (left[i] < right[j]) {
                    rsl[count++] = left[i++];
                    if (i == left.length) {
                        while (j < right.length) {
                            rsl[count++] = right[j++];
                        }
                    }
                } else {
                    rsl[count++] = right[j];
                    if (j < right.length - 1) {
                        j++;
                    } else {
                        while (i < left.length) {
                            rsl[count++] = left[i++];
                        }
                        return rsl;
                    }
                    rsl[count++] = left[i];
                    if (i < left.length - 1) {
                        i++;
                    } else {
                        while (j < right.length) {
                            rsl[count++] = right[j++];
                        }
                        return rsl;
                    }
                }
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(merge(new int[]{1, 2, 3}, new int[]{3, 4})));
    }
}
