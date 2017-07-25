package TypesAndStrings.lab36;

import java.math.BigInteger;

/**
 * Created by hamster on 25.07.2017.
 */
public class Test {
    public static void main(String[] args) {

        //Test1
        BigInteger[] polinom1 = new BigInteger[]{
                new BigInteger("1"),
                new BigInteger("1"),
        };

        BigInteger[] poly = PolyUtils.mul(polinom1, polinom1);
        System.out.println("Test1");
        for (int i = 0; i < poly.length; i++) {
            System.out.println(poly[i]);
        }

        //Test2
        BigInteger[] polinom2 = new BigInteger[]{
                new BigInteger("10"),
                new BigInteger("0"),
                new BigInteger("1"),
        };
        BigInteger[] polinom3 = new BigInteger[]{
                new BigInteger("-1"),
                new BigInteger("0"),
        };

        BigInteger[] poly2 = PolyUtils.mul(polinom2, polinom3);
        System.out.println("Test2");
        for (int i = 0; i < poly2.length; i++) {
            System.out.println(poly2[i]);
        }

        //Test3
        BigInteger[] polinom4 = new BigInteger[]{
                new BigInteger("1"),
        };

        BigInteger[] poly3 = PolyUtils.mul(polinom4, polinom4);
        System.out.println("Test3");
        for (int i = 0; i < poly3.length; i++) {
            System.out.println(poly3[i]);
        }

    }
}
