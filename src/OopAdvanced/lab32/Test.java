package OopAdvanced.lab32;

/**
 * Created by hamster on 13.07.2017.
 */
public class Test {
    public static void main(String[] args) {
        OdessaSeaPort port = new OdessaSeaPort();
        AbstractShip[] ships = new AbstractShip[3];
        Liner liner = new Liner("Liner1", 100f, 100f, 100f, 100);
        Cargo cargo = new Cargo("Cargo1", 200f, 200f, 200f, 200f);
        Tanker tanker = new Tanker("Tanker1", 300f, 300f, 300f, 300f);
        ships[0] = liner;
        ships[1] = cargo;
        ships[2] = tanker;
        System.out.println(OdessaSeaPort.sortSumPaymentAsc(ships));
    }
}
