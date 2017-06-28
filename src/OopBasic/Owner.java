package OopBasic;

/**
 * Created by hamster on 22.06.2017.
 */
public class Owner {
    protected String name;

    public Owner(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Owner: " + name;
    }
}
