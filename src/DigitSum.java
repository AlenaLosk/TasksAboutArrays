public class DigitSum {
    public static int sum(int num) {
        int sum = 0;
        char[] digits = String.valueOf(num).toCharArray();
        for (int i = 0; i < digits.length; i++) {
            sum += Character.getNumericValue(digits[i]);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(1));
        System.out.println(sum(12));
        System.out.println(sum(123));
        System.out.println(sum(1234));
        System.out.println(sum(12345));
    }
}
