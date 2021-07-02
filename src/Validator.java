import java.sql.SQLOutput;

public class Validator {
    public static boolean checkArray(int[] data, int value) {
        float counter = 0.0f;
        for (int e: data) {
            if (e == value) {
                counter += 1;
            }
            if (counter >= ((float) data.length)/ 2) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkArray(new int[]{1, 105, 5, 5}, 5));
    }
}
