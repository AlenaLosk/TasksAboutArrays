public class RandomDream {
    public static String random(String[] prizes, int num) {
        while (num > prizes.length) {
            num = num % prizes.length;
        }
        return num == 0 ? prizes[prizes.length - 1]: prizes[num - 1];
    }

    public static void main(String[] args) {
        System.out.println(random(new String[]{"car", "ticket", "flat", "house"}, 1));
        System.out.println(random(new String[]{"car", "ticket", "flat", "house"}, 2));
        System.out.println(random(new String[]{"car", "ticket", "flat", "house"}, 3));
        System.out.println(random(new String[]{"car", "ticket", "flat", "house"}, 4));
        System.out.println(random(new String[]{"car", "ticket", "flat", "house"}, 5));
        System.out.println(random(new String[]{"car", "ticket", "flat", "house"}, 6));
        System.out.println(random(new String[]{"car", "ticket", "flat", "house"}, 7));
        System.out.println(random(new String[]{"car", "ticket", "flat", "house"}, 8));
        System.out.println(random(new String[]{"car", "ticket", "flat", "house"}, 9));
        System.out.println(random(new String[]{"car", "ticket", "flat", "house"}, 10));
        System.out.println(random(new String[]{"car", "ticket", "flat", "house"}, 11));
        System.out.println(random(new String[]{"car", "ticket", "flat", "house"}, 12));
    }
}
