package word_wrap;

public class Wrapper {

    public static String wrap(String s, int column) {
        if (s.length() <= column) {
            return s;
        }
        int space = s.lastIndexOf(' ');
        if (space != -1) {
            return s.substring(0, space) + "\n" + s.substring(space + 1, s.length());
        }
        return s.substring(0, column) + "\n" + wrap(s.substring(column, s.length()), column);
    }
}
