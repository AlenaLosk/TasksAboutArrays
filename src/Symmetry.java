public class Symmetry {
    public static boolean check(int i) {
        String s = String.valueOf(i);
        for (int x = 0; x < s.length(); x++) {
            if (s.charAt(x) != s.charAt(s.length() - 1 - x)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(check(1112111));
        System.out.println(check(123456321));
    }
}
