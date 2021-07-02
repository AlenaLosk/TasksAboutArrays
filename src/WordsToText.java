public class WordsToText {
    public static String convert(String[] words) {
//        String result = "";
//        for (int i = 0; i < words.length - 1; i++) {
//            result = result + words[i] + " ";
//        }
//        return result + words[words.length - 1];
        return String.join(" ", words);
    }
}
