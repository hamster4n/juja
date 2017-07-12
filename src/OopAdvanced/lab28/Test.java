package OopAdvanced.lab28;

/**
 * Created by hamster on 11.07.2017.
 */
public class Test {
    public static void main(String[] args) {
        Liner liner = new Liner("TestLinerName", 1000, 1000, 1000, 100);
        System.out.println(liner.calculatePayment());
    }
}
