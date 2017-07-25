package TypesAndStrings.lab33;

import java.math.BigInteger;

/**
 * Created by hamster on 21.07.2017.
 */
public class FractionUtils {
    public static BigInteger[] sum(BigInteger[] x, BigInteger[] y) {
        /*BODY*/
        BigInteger first1 = x[0];
        BigInteger first2 = x[1];
        BigInteger second1 = y[0];
        BigInteger second2 = y[1];

        BigInteger numerator = first1.multiply(second2).add(second1.multiply(first2));
        BigInteger denominator = first2.multiply(second2);

        BigInteger divisor = numerator.gcd(denominator);

        numerator = numerator.divide(divisor);
        denominator = denominator.divide(divisor);

        return new BigInteger[]{numerator, denominator};
    }
}
