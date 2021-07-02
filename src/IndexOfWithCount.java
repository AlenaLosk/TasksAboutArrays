public class IndexOfWithCount {
    public static int indexOf(char[] string, char c, int number) {
        for (int i = 0; i < string.length; i++) {
            if (string[i] == c) {
                if (number == 1) {
                    return i;
                } else {
                    number--;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(indexOf(new char[] {'a', 'b', 'd', 'a', 'd', 'a'}, 'a', 2));
    }
}
