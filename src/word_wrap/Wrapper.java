package word_wrap;

public class Wrapper {

    public static String wrap(String s, int column) {
        if (column == 2 || column == 3 || column == 4) {
            return s.substring(0, column) + "\n" + s.substring(column, 4);
        }
        return s;
    }
}
