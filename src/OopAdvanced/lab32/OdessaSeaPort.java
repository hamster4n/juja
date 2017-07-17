package OopAdvanced.lab32;

/**
 * Created by hamster on 13.07.2017.
 */
public class OdessaSeaPort {
    public static String sortSumPaymentAsc(AbstractShip[] arrayShips) {

    /*BODY*/
        String result = "";
        if (arrayShips == null){
            return "";
        }

        if (arrayShips.length == 0) {
            return "пустой массив";
        }
        for (AbstractShip ship:arrayShips) {
            if (ship == null) return "одно из значений нул";
        }
        for (int barrier = 0; barrier < arrayShips.length; barrier++) {
            for (int index = arrayShips.length - 1; index > barrier; index--) {
                if (arrayShips[index].calculatePayment() < arrayShips[index - 1].calculatePayment()) {
                    AbstractShip tmp = arrayShips[index];
                    arrayShips[index] = arrayShips[index - 1];
                    arrayShips[index - 1] = tmp;
                }
            }
        }

        for (int i = 0; i < arrayShips.length; i++) {
            result += arrayShips[i].getName() + "=" + arrayShips[i].calculatePayment();
        }
        return result;
    }
}
