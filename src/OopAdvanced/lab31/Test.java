package OopAdvanced.lab31;

/**
 * Created by hamster on 12.07.2017.
 */
public class Test {
    public static void main(String[] args) {
        OdessaSeaPort port = new OdessaSeaPort();

        System.out.println("Test1");
        System.out.println("добавляем первый корабль. Индекс добавленого корабля: ");
        System.out.println(port.addShipToEndQueue(new Cargo("Cargo1", 121f, 10f, 1000f, 147f)));
        System.out.println("добавляем второй корабль. Индекс добавленого корабля: ");
        System.out.println(port.addShipToEndQueue(new Cargo("Cargo2", 80f, 8f, 800f, 88f)));
        System.out.println("добавляем третий корабль. Индекс добавленого корабля: ");
        System.out.println(port.addShipToEndQueue(new Liner("Liner1", 121f, 10f, 1000f, 100)));
        System.out.println("добавляем четвёртый корабль. Индекс добавленого корабля: ");
        System.out.println(port.addShipToEndQueue(new Liner("Liner2", 101f, 7f, 700f, 70)));
        System.out.println("добавляем пятый корабль. Индекс добавленого корабля: ");
        System.out.println(port.addShipToEndQueue(new Tanker("Tanker1", 200f, 200f, 2000f, 2000)));


        System.out.println("В порту должны остаться корабли: Cargo1, Cargo2, Liner1");
        System.out.println("Печатаем список кораблей в порту: ");
        System.out.println(port.printQueueShip());
        System.out.println("----------------------------------------------------------------------");


        System.out.println("Test2");
        System.out.println("Первый раз удаляем корабль: ");
        System.out.println(port.removeShipFromBeginQueue());
        System.out.println("Второй раз удаляем корабль: ");
        System.out.println(port.removeShipFromBeginQueue());
        System.out.println("Третий раз удаляем корабль: ");
        System.out.println(port.removeShipFromBeginQueue());
        System.out.println("Четвёртый раз удаляем корабль: ");
        System.out.println(port.removeShipFromBeginQueue());

        System.out.println("В порту не должно остаться кораблей");
        System.out.println("Печатаем список кораблей в порту: ");
        System.out.println(port.printQueueShip());
        System.out.println("----------------------------------------------------------------------");


        System.out.println("Test3");
        System.out.println("добавляем первый корабль. Индекс добавленого корабля: ");
        System.out.println(port.addShipToEndQueue(new Liner("Liner2", 101f, 7f, 700f, 70)));
        System.out.println("добавляем второй корабль. Индекс добавленого корабля: ");
        System.out.println(port.addShipToEndQueue(new Tanker("Tanker1", 200f, 200f, 2000f, 2000)));
        System.out.println("добавляем третий корабль. Индекс добавленого корабля: ");
        System.out.println(port.addShipToEndQueue(new Liner("Liner1", 121f, 10f, 1000f, 100)));
        System.out.println("Первый раз удаляем корабль: ");
        System.out.println(port.removeShipFromBeginQueue());
        System.out.println("Второй раз удаляем корабль: ");
        System.out.println(port.removeShipFromBeginQueue());
        System.out.println("добавляем второй корабль. Индекс добавленого корабля: ");
        System.out.println(port.addShipToEndQueue(new Cargo("Cargo1", 121f, 10f, 1000f, 147f)));
        System.out.println("добавляем третий корабль. Индекс добавленого корабля: ");
        System.out.println(port.addShipToEndQueue(new Cargo("Cargo2", 80f, 8f, 800f, 88f)));

        System.out.println("В порту должны остаться Liner1, Cargo1, Cargo2");
        System.out.println("Печатаем список кораблей в порту: ");
        System.out.println(port.printQueueShip());
        System.out.println("----------------------------------------------------------------------");

    }
}
