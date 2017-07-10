package OopAdvanced.lab25;

/**
 * Created by hamster on 10.07.2017.
 */
 class Journal extends Issue{
    private String yearJournal;
    private String numberJournal;
    /*BODY*/

    public Journal(String name, int countPages, String yearJournal, String numberJournal) {
        super(name, countPages);
        this.yearJournal = yearJournal;
        this.numberJournal = numberJournal;
    }

    @Override
    public String toPrint() {
        return "Journal{" + super.toPrint() +
                ",year=" + yearJournal + ",number=" + numberJournal + '}';
    }
}
