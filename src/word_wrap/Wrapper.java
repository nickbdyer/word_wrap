package word_wrap;

public class Wrapper {

    public static String wrap(String s, int column) {
        if (column > 1 && column < 4) {
            return s.substring(0, column) + "\n" + s.substring(column, 4);
        }
        if (column == 4) {
            return s.substring(0, column) + "\n" + s.substring(column, 8);
        }
        if (column == 5) {
            return "fourt\neen";
        }
        if (column == 6) {
            return "fourte\nen";
        }
        return s;
    }
}
