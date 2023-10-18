import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Tut_101_DateTimeFormater {
    public static void main(String[] args) {
        LocalDate d=LocalDate.now();
        DateTimeFormatter df=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String nf=d.format(df);
        System.out.println(nf);

        DateTimeFormatter df1=DateTimeFormatter.ISO_LOCAL_DATE;
        String nf1=d.format(df1);
        System.out.println(nf1);
    }
}
/*
18/11/2022
2022-11-18
 */