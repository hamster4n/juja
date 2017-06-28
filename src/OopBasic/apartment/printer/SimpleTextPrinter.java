package OopBasic.apartment.printer;
import OopBasic.apartment.LivingApartment;

/**
 * Created by hamster on 26.06.2017.
 */
public class SimpleTextPrinter implements Printer{

    @Override
    public String print(LivingApartment livingApartment) {
        String result =  super.toString();
        String[] owners = livingApartment.getOwners();
        for (int index = 0 ; index < owners.length; index++) {
            String owner = livingApartment.getOwners()[index];
            if (owner != null){
                result += "****************************** \n";
                result += "Owner: " + owner.toString() + "\n";
                result += "****************************** \n";
            }
        }
        return result;
    }

}
