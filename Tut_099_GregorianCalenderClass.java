import java.util.Calendar;
import java.util.TimeZone;

public class Tut_99_GregorianCalenderClass {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.ERA));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getDefault());
    }
}
/*
17
1
6
Africa/Abidjan
sun.util.calendar.ZoneInfo[id="Asia/Calcutta",offset=19800000,dstSavings=0,useDaylight=false,transitions=7,lastRule=null]
 */