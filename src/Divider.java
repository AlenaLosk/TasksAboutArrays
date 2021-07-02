public class Divider {
    public static boolean check(int num, int[] ints) {
        for (int e: ints) {
            if (num % e != 0) {
                return false;
            }
        }
        return true;
    }
}

