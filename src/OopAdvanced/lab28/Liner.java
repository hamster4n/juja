package OopAdvanced.lab28;

/**
 * Created by hamster on 10.07.2017.
 */
public class Liner extends AbstractShip{
    private int passengers;
    public static final float DEFAULT_RENTAL = 1000;

     /*BODY*/

    public Liner(String name, float length, float width, float displacement, int passengers) {
        super(name, length, width, displacement);
        this.passengers = passengers;
    }

    public float calculatePayment (float rental){
        if (rental <= 0){
            return calculatePayment();
        } else {
            return passengers * rental;
        }
    }
    @Override
    public float calculatePayment() {
        return passengers * DEFAULT_RENTAL;
    }
}
