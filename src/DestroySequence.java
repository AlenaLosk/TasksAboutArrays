public class DestroySequence {
    public static char[] destroy(char[] seq) {
        char[] newArray = seq.clone();
        for (int i = 0; i < newArray.length; i++) {
            if (i >= 0 && i < 5) {
                newArray[i] = '0';
            } else if (i >= (newArray.length - 5) && i < newArray.length) {
                newArray[i] = '1';
            }
        }
        return newArray;
    }
}
