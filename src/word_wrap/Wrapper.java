package word_wrap;

public class Wrapper {

    public static String wrap(String s, int column) {
        if (column <= 4 && column > 1) {
            return s.substring(0, column) + "\n" + s.substring(column, 4);
        }
        return s;
    }
}
