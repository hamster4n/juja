package TypesAndStrings.lab35;

import java.math.BigInteger;

/**
 * Created by hamster on 25.07.2017.
 */
public class Test {
    public static void main(String[] args) {
        BigInteger[] polinom1 = new BigInteger[]{
                new BigInteger("2"),
                new BigInteger("0"),
                new BigInteger("-3"),
                new BigInteger("0"),
        };
        BigInteger point1  = new BigInteger("100");


        if (PolyUtils.eval(polinom1, point1).equals(new BigInteger("1999700"))){
            System.out.println("Done!");
        } else {
            System.out.println("False");
        }

    }
}
