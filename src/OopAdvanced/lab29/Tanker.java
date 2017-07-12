package OopAdvanced.lab29;

/**
 * Created by hamster on 12.07.2017.
 */
public class Tanker extends AbstractShip{
    private float volume;
    public static final float DEFAULT_RENTAL = 250;

     /*BODY*/

    public Tanker(String name, float length, float width, float displacement, float volume) {
        super(name, length, width, displacement);
        this.volume = volume;
    }

    public float calculatePayment(float rental){
        if (rental <= 0){
            return calculatePayment();
        } else {
            return volume * rental;
        }

    }

    @Override
    public float calculatePayment() {
        return volume * DEFAULT_RENTAL;
    }
}
