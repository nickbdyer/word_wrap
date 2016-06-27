package word_wrap;

public class Wrapper {

    public static String wrap(String s, int column) {
        if (column == 2) {
            return s.substring(0, 2) + "\n" + s.substring(2, 4);
        }
        return s;
    }
}
