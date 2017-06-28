package OopBasic;

/**
 * Created by hamster on 26.06.2017.
 */
public class SimpleHouse {
    private int floorsCount;
    private int apartmentsOnFllor;

    public SimpleHouse(int floorsCount, int apartmentsOnFllor) {
        this.floorsCount = floorsCount;
        this.apartmentsOnFllor = apartmentsOnFllor;
    }

    @Override
    public String toString() {
        String result =  "SimpleHouse: \n";
        for (int x = 0; x < floorsCount; x++) {
            for (int y = 0; y < apartmentsOnFllor; y++) {
                result += "#";
            }
            result += " \n";
        }
        return result;
    }
}
