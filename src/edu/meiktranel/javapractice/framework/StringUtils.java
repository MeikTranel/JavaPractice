package edu.meiktranel.javapractice.framework;

/**
 * @author meiktranel
 */
public class StringUtils {
    public static String padRight(String s, int n) {
        return String.format("%1$-" + n + "s", s);
    }
}
