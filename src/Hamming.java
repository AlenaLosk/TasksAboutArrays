public class Hamming {
    public static int checkStrings(String left, String right) {
        int result = 0;
        for (int i = 0; i < left.length(); i++) {
            if (left.charAt(i) != right.charAt(i)) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(checkStrings("2173896", "2233796"));
        System.out.println(checkStrings("abcde", "bcdef"));
        System.out.println(checkStrings("abcde", "abcde"));
    }
}
