import java.util.Arrays;

public class RightShift {
    public static int[] shift(int[] nums, int count) {
        for (int i = 0; i < count; i++) {
            shift(nums);
        }
        return nums;
    }

    // метод делает сдвиг с шагом 1
    private static void shift(int[] nums) {
        int temp = nums[nums.length - 1];
        for (int i = 0; i < nums.length - 1; i++) {
            nums[nums.length - i - 1] = nums[nums.length - i - 2];
        }
        nums[0] = temp;
    }

//    private static int[] shift2(int[] nums) {
//        int[] newArray = new int[nums.length];
//        newArray[0] = nums[nums.length - 1];
//        for (int i = 0; i < nums.length - 1; i++) {
//            newArray[i + 1] = nums[i];
//        }
//        nums = newArray;
//        return nums;
//    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(shift(new int[]{1, 2, 3, 4, 5}, 3)));
    }
}
