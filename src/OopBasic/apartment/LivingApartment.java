package OopBasic.apartment;

import OopBasic.Owner;
import OopBasic.apartment.printer.Printer;

/**
 * Created by hamster on 23.06.2017.
 */
public class LivingApartment extends Apartment {
    private Owner[] owners;
    private Printer printer;

    public LivingApartment(int number, int capacity, Printer printer
    ) {
        super(number);
        this.owners = new Owner[capacity];
        this.printer = printer;
    }

    public void addOwner(Owner owner) {
        owners[getFreeRoomIndex()] = owner;

    }

    public int getFreeRoomIndex(){
        for (int index = 0; index < owners.length; index++) {
            if (owners[index] == null){
                return index;
            }
        }
        throw new RuntimeException("No free rooms for owner");
    }

    @Override
    public String toString() {
        return printer.print(this);
    }


    @Override
    public boolean isFree() {
        return owners[owners.length - 1] == null;
    }

    public boolean isSettled() {
        return owners[0] != null;
    }

    public String[] getOwners() {
        String[] result = new String[owners.length];
        for (int index = 0; index < result.length; index++) {
            if (owners[index] != null){
                result[index] = owners[index].toString();
            } else {
                result[index] = "";
            }

        }
        return result;
    }
}
