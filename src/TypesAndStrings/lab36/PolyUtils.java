package TypesAndStrings.lab36;

import java.math.BigInteger;

/**
 * Created by hamster on 25.07.2017.
 */
public class PolyUtils {
    public static BigInteger[] mul(BigInteger[] x, BigInteger[] y) {
        /*BODY*/
        int resultLength;

        if (x.length == 1 && y.length ==1){
            resultLength = 1;
        } else{
            if (x.length == 1 && y.length != 1){
                resultLength = y.length;
            } else{
                if (x.length != 1 && y.length ==1){
                    resultLength = x.length;
                } else {
                    if (x.length > y.length){
                        resultLength = x.length + 1;
                    } else{
                        resultLength = y.length + 1;
                    }
                }
            }
        }



        BigInteger[] result = new BigInteger[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = new BigInteger("0");
        }

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < y.length; j++) {
                result[i + j] = result[i + j].add(x[i].multiply(y[j]));
            }
        }
        return result;
    }
}
