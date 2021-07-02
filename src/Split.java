import java.util.Arrays;

public class Split {
    public static char[][] split(char[] str, char c) {
        char[][] result = new char[str.length / 2][];
        char[] temp = new char[str.length];
        int counter1 = 0;
        int counter2 = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i] != c) {
                temp[counter2++] = str[i];
                if (i == (str.length - 1)) {
                    result[counter1++] = Arrays.copyOf(temp, counter2);
                }
            } else {
                result[counter1++] = Arrays.copyOf(temp, counter2);
                counter2 = 0;
            }
        }
        return Arrays.copyOf(result, counter1);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(split(new char[] {'c', 'b', ' ', 'n', 'c', 'm', ' ', 'o', 'i', 'u', 'n', ' ', 'c'}, ' ')));
    }
}
