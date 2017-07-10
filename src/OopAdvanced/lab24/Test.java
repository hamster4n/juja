package OopAdvanced.lab24;



/**
 * Created by hamster on 10.07.2017.
 */
public class Test {
    public static void main(String[] args) {
        Book book = new Book("TestNameBook", 100, "TestBookAuthor");
        System.out.println(book.toPrint());
    }
}
