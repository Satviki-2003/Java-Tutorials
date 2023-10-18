import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Tut_100_Java_TimeAPI {
    public static void main(String[] args) {
        LocalDate d=LocalDate.now();
        System.out.println("TODAY'S DATE : "+d);

        LocalTime t=LocalTime.now();
        System.out.println("TIME : "+t);

        LocalDateTime dt=LocalDateTime.now();
        System.out.println("DATE AND TIME : \n"+dt);
    }
}
/*
TODAY'S DATE : 2022-11-18
TIME : 22:01:43.489764900
DATE AND TIME :
2022-11-18T22:01:43.490381800
 */