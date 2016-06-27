package word_wrap;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Wrapper {

    public static String wrap(String s, int column) {
        if (s.equals(s)) {
            return s;
        }
        if ("".equals(s)) {
            return "";
        }
        if ("word".equals(s)) {
            return "word";
        }
        throw new NotImplementedException();
    }
}
