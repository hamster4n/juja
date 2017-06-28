package OopBasic;

/**
 * Created by hamster on 23.06.2017.
 */
public class NumberGenerator {
    private int current;

    public NumberGenerator() {
        current = 1;
    }

    public int getNext() {
        int result = current;
        current++;
        return result;
    }
}
