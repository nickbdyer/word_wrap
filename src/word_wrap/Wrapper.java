package word_wrap;

public class Wrapper {

    private int column;

    public Wrapper(int column) {
        this.column = column;
    }

    public static String wrap(String s, int column) {
        return new Wrapper(column).wrap(s);
    }

    private String wrap(String s) {
        if (s.length() <= column) {
            return s;
        }
        int space = s.substring(0, column + 1).lastIndexOf(' ');
        if (space != -1) {
            return breakLine(s, space, 1);
        }
        return s.substring(0, column) + "\n" + wrap(s.substring(column, s.length()), column);
    }

    private String breakLine(String s, int space, int gap) {
        return s.substring(0, space) + "\n" + wrap(s.substring(space + gap, s.length()), column);
    }
}
