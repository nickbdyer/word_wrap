package word_wrap;

public class Wrapper {

    public static String wrap(String s, int column) {
        if (s.length() <= column) {
            return s;
        }
        return s.substring(0, column) + "\n" + wrap(s.substring(column, s.length()), column);
    }
}
