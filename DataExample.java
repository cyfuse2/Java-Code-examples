import java.text.*;
import java.util.*;
import java.util.Date;

public class DataExample {
    public static void main(String args[]) {
        
        //Obtem a data
        Date now = new Date();

        //Formata datas para locais designados
        DateFormat theDate = DateFormat. getDateInstance(DateFormat.LONG);
        DateFormat germanDate = DateFormat.getDateInstance(DateFormat.LONG, Locale.GERMANY);
        DateFormat frenchDate = DateFormat.getDateInstance(DateFormat.LONG, Locale.FRANCE);

        //Imprime as datas
        System.out.println("Date in the default locale: " + theDate.format(now));
        System.out.println("Date in the german locale: " + germanDate.format(now));
        System.out.println("Date in the french locale: " + frenchDate.format(now));
    }
}