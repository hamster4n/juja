package OopBasic;

import OopBasic.apartment.Apartment;
import OopBasic.apartment.LivingApartment;
import OopBasic.apartment.TechnicalApartment;
import OopBasic.apartment.printer.SecureTextPrinter;
import OopBasic.apartment.printer.SimpleTextPrinter;
import OopBasic.staff.Cleaner;

/**
 * Created by hamster on 22.06.2017.
 */
public class Floor {
    private static final int DEFAULT_APARTMENT_CAPACITY = 4;
    private int number;
    private Apartment[] apartments;
    private Cleaner cleaner;

    public Floor(int number, int apartmentsCount, NumberGenerator numbers) {
        this.number = number;
        this.apartments = new Apartment[apartmentsCount];
        this.apartments[0] = new TechnicalApartment(numbers.getNext());
        for (int index = 1; index < apartmentsCount; index++) {
            apartments[index] = new LivingApartment(numbers.getNext(), DEFAULT_APARTMENT_CAPACITY, new SecureTextPrinter());
        }
    }

    public LivingApartment getFreeApartment() {
        for (Apartment apartment: apartments) {
            if (apartment instanceof LivingApartment && apartment.isFree()){
                LivingApartment livingApartment = (LivingApartment) apartment;
                if (!livingApartment.isSettled()){
                    cleaner.clean(apartment);
                }
                return livingApartment;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        String result = "==============================\n";
        result += "Floor number " +  number + "\n";
        result += "------------------------------\n";
        for (Apartment apartment: apartments) {
            result += apartment.toString() + "\n";
        }
        result += "==============================\n";
        return result;
    }

    public void setCleaner(Cleaner cleaner) {
        this.cleaner = cleaner;
    }
}
