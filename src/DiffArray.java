import java.util.*;

public class DiffArray {
    public static int[] diff(int[] left, int[] right) {
//        1й вариант с коллекцией List
//        List<Integer> list = new ArrayList<>(left.length);
//        if (left.length == 0 || right.length == 0) {
//            return left;
//        } else {
//            for (int i = 0; i < left.length; i++) {
//                for (int j = 0; j < right.length; j++) {
//                    if (left[i] != right[j]) {
//                        list.add(left[i]);
//                    }
//                }
//            }
//            int[] result = new int[list.size()];
//            for (int i = 0; i < list.size(); i++) {
//                result[i] = list.get(i);
//            }
//            return result;
//       }
//       2й вариант
        int[] list = new int[left.length];
        int size = 0;
        if (left.length == 0 || right.length == 0) {
            return left.clone(); //корректно для {1, 2, 3} vs {}; {} vs {1, 2, 3} - не нужно проходить код ниже
        }
        loop:
        for (int i : left) {
            for (int j : right) {
                if (i == j) {
                    continue loop;
                }
            }
            list[size++] = i;
        }
        return Arrays.copyOf(list, size);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(diff(new int[]{}, new int[]{2, 3})));
    }
}
