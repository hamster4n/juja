package OopBasic.staff;

import OopBasic.Owner;
import OopBasic.apartment.Apartment;

/**
 * Created by hamster on 26.06.2017.
 */
public class Housemaid extends Owner implements Cleaner {
    public Housemaid(String name) {
        super(name);
    }

    @Override
    public void clean(Apartment apartment) {
        System.out.println("Clearing apartment " + apartment.getNumber());
        System.out.println("Clearing done by " + name);

    }
}
