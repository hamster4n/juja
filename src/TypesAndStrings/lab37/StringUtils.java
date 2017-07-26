package TypesAndStrings.lab37;

/**
 * Created by hamster on 25.07.2017.
 */
public class StringUtils {
    public static String rightShift(String arg, int delta) {
        /*BODY*/
        if (delta == 0 || arg.length() == 0) return arg;
        delta %= arg.length();
        String result;
        if (delta > 0) {
            result = arg.substring(arg.length() - delta, arg.length()) + arg.substring(0, arg.length() - delta);
        } else {
            result = arg.substring(-delta, arg.length()) + arg.substring(0, -delta);
        }
        return result;
    }
}
