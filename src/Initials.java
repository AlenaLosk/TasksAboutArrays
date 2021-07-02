public class Initials {
    public static String convert(String[] fio) {
        return new StringBuilder().append(fio[0]).append(" ").append(fio[1].charAt(0)).append(".").append(fio[2].charAt(0)).append(".").toString();
    }

    public static void main(String[] args) {
        System.out.println(convert(new String[]{"Петрова", "Галина", "Башировна"}));
    }
}
