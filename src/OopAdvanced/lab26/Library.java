package OopAdvanced.lab26;

/**
 * Created by hamster on 10.07.2017.
 */
public class Library {

    public String printCatalog(Issue[] catalog) {
              /*BODY*/
              if (catalog.length == 0){
                  return "";
              }
              String result = "";
        for (int i = 0; i < catalog.length; i++) {
            result += catalog[i].toPrint();
        }
        return result;
    }
}