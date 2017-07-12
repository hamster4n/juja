package OopAdvanced.lab31;

/**
 * Created by hamster on 12.07.2017.
 */
public interface SeaPortQueue {
    public final static int LENGTH_QUEUE_SHIP = 3;
    public int addShipToEndQueue(AbstractShip ship);
    public int removeShipFromBeginQueue();
    public String printQueueShip();
}
