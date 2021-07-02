public class Abbreviation {
    public static String collect(String s) {
        String[] temp = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < temp.length; i++) {
            sb.append(temp[i].toUpperCase().charAt(0));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(collect("North Atlantic Treaty Organization"));
        System.out.println(collect("Chief Executive Officer"));
        System.out.println(collect("United Nations organization"));
    }
}
