package OopAdvanced.lab31;


/**
 * Created by hamster on 12.07.2017.
 */
public class OdessaSeaPort implements SeaPortQueue {
    private static final int NO_SHIP_IN_ARRAY = -1;
    private int indexShipInPort = NO_SHIP_IN_ARRAY;
    private AbstractShip[] arrayShip = new AbstractShip[LENGTH_QUEUE_SHIP];


    /*BODY*/

    @Override
    public int addShipToEndQueue(AbstractShip ship) {
        if (indexShipInPort == LENGTH_QUEUE_SHIP - 1) {
            return -1;
        } else {
                indexShipInPort++;
            arrayShip[indexShipInPort] = ship;
            return indexShipInPort;
        }
    }

    @Override
    public int removeShipFromBeginQueue() {
        if (indexShipInPort == NO_SHIP_IN_ARRAY) {
            return -1;
        } else {
            for (int i = 1; i < LENGTH_QUEUE_SHIP; i++) {
                arrayShip[i-1] = arrayShip[i];
            }
            arrayShip[indexShipInPort] = null;
            indexShipInPort--;
            return 1;
        }
    }

    @Override
    public String printQueueShip() {

        String result = "";
        if (indexShipInPort == NO_SHIP_IN_ARRAY) {
            return "QueueEmpty";
        } else {
            for (int i = 0; i < indexShipInPort + 1 ; i++) {
                result += "{" + arrayShip[i].toPrint() + "};";
            }
            return result;
        }
    }


}
