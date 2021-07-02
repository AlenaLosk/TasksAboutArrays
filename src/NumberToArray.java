import java.util.Arrays;

public class NumberToArray {

    public static int getCountsOfDigits(int number) { // подсчет числа символов
        return String.valueOf(number).length();
    }

    public static int[] resolve(int number) {
        int[] array = new int[getCountsOfDigits(number)];
        for (int i = 0; i < array.length; i++) {
            array[array.length - i - 1] = Character.getNumericValue(String.valueOf(number).charAt(i));
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(resolve(16925)));
    }
}
