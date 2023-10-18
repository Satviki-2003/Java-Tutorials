public class Tut_96_DateAndTime {
    public static void main(String[] args) {
        long mili=System.currentTimeMillis();
        System.out.println("Milliseconds : "+mili);
        long sec=mili/1000;
        System.out.println("Seconds : "+sec);
        long min=sec/60;
        System.out.println("Minutes : "+min);
        long hr=min/60;
        System.out.println("Hours : "+hr);
        long day=hr/24;
        System.out.println("Days : "+day);
        long months=day/30;
        System.out.println("Months : "+months);
        long year=day/365;
        System.out.println("Year : "+year);
    }
}
/*
Milliseconds : 1668687859590
Seconds : 1668687859
Minutes : 27811464
Hours : 463524
Days : 19313
Months : 643
Year : 52
 */