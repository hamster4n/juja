package OopBasic.apartment.printer;

import OopBasic.apartment.LivingApartment;

/**
 * Created by hamster on 26.06.2017.
 */
public class SecureTextPrinter implements Printer {

    @Override
    public String print(LivingApartment livingApartment) {
        String result = ""; //TODO implement me
        result += (livingApartment.isFree()) ? "is free" : "is not free \n";
        return result;
    }

}
