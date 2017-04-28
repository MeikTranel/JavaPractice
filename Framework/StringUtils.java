/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Framework;

/**
 *
 * @author bbsuser
 */
public class StringUtils {
    public static String padRight(String s, int n) {
        return String.format("%1$-" + n + "s", s);
    }
}
