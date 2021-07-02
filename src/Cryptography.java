public class Cryptography {
    public static String code(String s) {
        String result = "";
        if (s.equals("")) {
            result = "empty";
        } else if (s.length() >= 1 && s.length() < 5) {
            result = s;
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (i < s.length() - 4) {
                    sb.append("#");
                } else {
                    sb.append(s.charAt(i));
                }
            }
            result = sb.toString();
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(code("4556364607935616"));
        System.out.println(code("123"));
        System.out.println(code(""));
    }
}
