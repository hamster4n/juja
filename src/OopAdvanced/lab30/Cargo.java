package OopAdvanced.lab30;

/**
 * Created by hamster on 12.07.2017.
 */
public class Cargo extends AbstractShip{
    private float tonnage;
    public static final float DEFAULT_RENTAL=550;

     /*BODY*/

    public Cargo(String name, float length, float width, float displacement, float tonnage) {
        super(name, length, width, displacement);
        this.tonnage = tonnage;
    }

    public float calculatePayment(float rental) {
        if (rental <= 0){
            return calculatePayment();
        } else {
            return tonnage * rental;
        }
    }

    @Override
    public float calculatePayment() {
        return tonnage * DEFAULT_RENTAL;
    }
}
