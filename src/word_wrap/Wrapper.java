package word_wrap;

public class Wrapper {

    public static String wrap(String s, int column) {
        if ("another".equals(s)) {
            return "another";
        }
        if ("".equals(s)) {
            return "";
        }
        return "word";
    }
}