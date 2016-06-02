package word_wrap;

public class Wrapper {

    private int col;

    private Wrapper(int col) {
        this.col = col;
    }

    public static String wrap(String s, int col) {
        return new Wrapper(col).wrap(s);
    }

    private String wrap(String s) {
        if (s.length() <= col)
            return s;
        int space = s.substring(0, col).lastIndexOf(' ');
        if (space != -1)
            return breakLine(s, space, 1);
        if (s.charAt(col) == ' ')
            return breakLine(s, col, 1);
        else
            return breakLine(s, col, 0);
    }

    private String breakLine(String s, int space, int gap) {
        return s.substring(0, space) + "\n" + wrap(s.substring(space + gap), col);
    }
}
