package OopBasic.apartment;

import OopBasic.equipment.Bucket;
import OopBasic.equipment.Equipment;
import OopBasic.equipment.Extinguisher;
import OopBasic.equipment.Swob;

import java.util.Arrays;

/**
 * Created by hamster on 23.06.2017.
 */
public class TechnicalApartment extends Apartment {

    private Equipment[] equipments;

    public TechnicalApartment(int number) {
        super(number);
        equipments = new Equipment[10];
        equipments[0] = new Extinguisher();
        equipments[1] = new Bucket();
        equipments[2] = new Swob();
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "With object: " + Arrays.toString(equipments);
    }
}
