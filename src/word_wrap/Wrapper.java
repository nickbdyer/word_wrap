package word_wrap;

public class Wrapper {

    public static String wrap(String s, int column) {
        if (s.length() <= column) {
            return s;
        }
        int space = s.substring(0, column + 1).lastIndexOf(' ');
        if (space != -1) {
            return s.substring(0, space) + "\n" + wrap(s.substring(space + 1, s.length()), column);
        }
        return s.substring(0, column) + "\n" + wrap(s.substring(column, s.length()), column);
    }
}
