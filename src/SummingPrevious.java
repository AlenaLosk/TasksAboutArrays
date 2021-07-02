import java.util.Arrays;

public class SummingPrevious {
    public static int[] calculate(int a, int b, int n) {
        int[] array = new int[n];
        array[0]= a;
        array[1]= b;
        int sum = array[0] + array[1];
        for (int i = 2; i < n; i++) {
            array[i] = sum;
            sum = sum + array[i];
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(calculate(1, 2, 4)));
    }
}
