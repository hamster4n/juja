package OopAdvanced.lab27;

/**
 * Created by hamster on 10.07.2017.
 */
public class Library {
    public String getIssueWithCountPagesMoreN(Issue[] catalog, int barrierCountPages) {
               /*BODY*/
               if (catalog.length == 0){
                   return "";
               }
               String result = "";
        for (int i = 0; i < catalog.length; i++) {
            if (catalog[i].getCountPages() > barrierCountPages){
                result += catalog[i].toPrint();
            }
        }
        return result;
    }
}
