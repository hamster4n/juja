package TypesAndStrings.lab37;

/**
 * Created by hamster on 25.07.2017.
 */
public class Test {
    public static void main(String[] args) {
        String string = "0123456789";
        int delta = Integer.MAX_VALUE;

        System.out.println(StringUtils.rightShift(string, delta));

    }
}
