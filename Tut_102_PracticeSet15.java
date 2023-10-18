/*
PROBLEM 1:
Create an Arraylist and store names of 10 students inside it. Print it using a for-each loop.

PROBLEM 2:
Use date class in java to print time in following format : hr:min:sec

PROBLEM 3:
Repeat 2 using the calendar class

PROBLEM 4:
Repeat 2 using java.time API

PROBLEM 5:
Create a set in java. Try to store duplicate element inside the set and verify that
only one instance is stored.
 */
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Tut_102_PracticeSet15 {
    public static void Problem1(){
        ArrayList<String> a=new ArrayList<>();
        a.add("Kushal1");
        a.add("Kushal2");
        a.add("Kushal3");
        a.add("Kushal4");
        a.add("Kushal5");
        a.add("Kushal6");
        a.add("Kushal7");
        a.add("Kushal8");
        a.add("Kushal9");
        a.add("Kushal10");
        System.out.println("STUDENTS :");
        for(String s:a){
            System.out.println(s);
        }
    }
    public static void Problem2(){
        Date d=new Date();
        System.out.println("TIME : \n"+d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());
    }
    public static void Problem3(){
        Calendar c=Calendar.getInstance();
        System.out.println("Time :");
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
    }
    public static void Problem4(){
        DateTimeFormatter dt=DateTimeFormatter.ofPattern("hh:mm:ss");
        LocalTime t=LocalTime.now();
        String s=t.format(dt);
        System.out.println("Time : \n"+s);
    }
    public static void Problem5(){
        Set<Integer> a=new HashSet<>();
        a.add(34);
        a.add(45);
        a.add(34);
        for(int e:a){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {

    }
}
/*
Problem 1:
STUDENTS :
Kushal1
Kushal2
Kushal3
Kushal4
Kushal5
Kushal6
Kushal7
Kushal8
Kushal9
Kushal10

Problem 2:
TIME :
22:28:58

Problem 3:
Time :
22:34:51

Problem 4:
Time :
10:39:33

Problem 5:
34
45
 */