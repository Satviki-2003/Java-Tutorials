import java.util.Calendar;

public class Tut_98_CalenderClass {
    public static void main(String[] args) {
        //Calendar is not concrete class it is abstract class
        Calendar c=Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getFirstDayOfWeek());
        System.out.println(c.getMinimalDaysInFirstWeek());
        System.out.println(c.getTime());
        System.out.println(c.getTimeZone());
        System.out.println(c.getWeekYear());
    }
}
/*
gregory
1
1
Thu Nov 17 18:17:39 IST 2022
sun.util.calendar.ZoneInfo[id="Asia/Calcutta",offset=19800000,dstSavings=0,useDaylight=false,transitions=7,lastRule=null]
2022
 */