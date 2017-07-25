package TypesAndStrings.lab34;

import java.math.BigInteger;

/**
 * Created by hamster on 25.07.2017.
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(BigIntegerUtils.toBitStr(new BigInteger("2")));
        System.out.println(BigIntegerUtils.toBitStr(new BigInteger("8")));
        System.out.println(BigIntegerUtils.toBitStr(new BigInteger("10")));
        System.out.println(BigIntegerUtils.toBitStr(new BigInteger("140")));
    }
}
