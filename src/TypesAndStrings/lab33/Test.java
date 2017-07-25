package TypesAndStrings.lab33;

import java.math.BigInteger;

/**
 * Created by hamster on 25.07.2017.
 */
public class Test {
    public static void main(String[] args) {
        BigInteger first1 = new BigInteger("5");
        BigInteger first2 = new BigInteger("6");
        BigInteger second1 = new BigInteger("1");
        BigInteger second2 = new BigInteger("3");

        BigInteger[] firstArr = {first1, first2};
        BigInteger[] secondArr = {second1, second2};

        BigInteger[] result = FractionUtils.sum(firstArr, secondArr);
        System.out.println(first1 + "/" + first2 + " + " + second1 + "/" + second2 + " = " + result[0] + "/" + result[1]);
    }
}
