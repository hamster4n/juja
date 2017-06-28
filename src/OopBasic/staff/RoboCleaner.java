package OopBasic.staff;

import OopBasic.apartment.Apartment;

/**
 * Created by hamster on 26.06.2017.
 */
public class RoboCleaner implements Cleaner {
    private String nick;

    public RoboCleaner(String nick) {
        this.nick = nick;
    }

    @Override
    public void clean(Apartment apartment) {
        System.out.println("RoBoBoBo " + nick +"Cleaning..");
        System.out.println("Done!");
    }
}
