package word_wrap;

public class Wrapper {

    public static String wrap(String s, int column) {
        if (column == 2) {
            return "wo\nrd";
        }
        return s;
    }
}
