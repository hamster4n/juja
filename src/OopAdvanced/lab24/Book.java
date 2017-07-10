package OopAdvanced.lab24;

/**
 * Created by hamster on 10.07.2017.
 */
 class Book extends Issue{
    private String authorBook;

    public Book(String name, int countPages, String authorBook) {
        super(name, countPages);
        this.authorBook = authorBook;
    }
          /*BODY*/




    public String toPrint() {
        return "Book{" + super.toPrint() +
                ",author=" + authorBook + '}';
    }
}
