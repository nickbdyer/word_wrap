package word_wrap;

public class Wrapper {

    public static String wrap(String s, int column) {
        if (column < s.length()) {
            return s.substring(0, column) + "\n" + s.substring(column, s.length());
        }
        if (column > 3 && column < s.length()) {
            return s.substring(0, column) + "\n" + s.substring(column, s.length());
        }
        return s;
    }
}
