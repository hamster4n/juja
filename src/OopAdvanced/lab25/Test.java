package OopAdvanced.lab25;

/**
 * Created by hamster on 10.07.2017.
 */
public class Test {
    public static void main(String[] args) {
        Journal journal = new Journal("TestNameJournal",
                100, "TestYearJournal", "TestNumberJournal");
        System.out.println(journal.toPrint());
    }
}
