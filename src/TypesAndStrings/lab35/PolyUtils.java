package TypesAndStrings.lab35;

import java.math.BigInteger;

/**
 * Created by hamster on 25.07.2017.
 */
public class PolyUtils {
    public static BigInteger eval(BigInteger[] poly, BigInteger arg) {
        /*BODY*/
        BigInteger result = new BigInteger("0");
        int power = 0;
        for (int i = poly.length - 1; i > -1; i--, power++) {
            BigInteger tmp = poly[i].multiply(arg.pow(power));
            result = result.add(tmp);
        }
        return result;
    }
}
