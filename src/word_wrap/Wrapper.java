package word_wrap;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Wrapper {

    public static String wrap(String s, int column) {
        if (s.length() < column) {
            return s;
        }
        if (column > 1 && column < s.length()) {
            return s.substring(0, column) + "\n" + s.substring(column, s.length());
        }
        if (column > 3 && column < s.length()) {
            return s.substring(0, column) + "\n" + s.substring(column, s.length());
        }
        throw new NotImplementedException();
    }
}
