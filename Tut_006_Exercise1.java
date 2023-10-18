import java.util.Scanner;
// for taking user input

public class Tut_06_Exercise1 {
    public static void main(String[] args) {
        System.out.println("Enter below the marks for CBSE Board Exam :");
        System.out.println("Enter marks of English :");
        Scanner sc = new Scanner(System.in);
        byte sub1 = sc.nextByte();
        System.out.println("Enter marks of Mathematics :");
        byte sub2 = sc.nextByte();
        System.out.println("Enter marks of Science :");
        byte sub3 = sc.nextByte();
        System.out.println("Enter marks of Hindi :");
        byte sub4 = sc.nextByte();
        System.out.println("Enter marks of Social Science :");
        byte sub5 = sc.nextByte();
        System.out.println("Of how many marks was paper ?");
        byte mark = sc.nextByte();
        int mark1 = mark*5;

        float total = sub1+sub2+sub3+sub4+sub5;
        float percent = (total/mark1)*100;

        System.out.println("The percentage got :");
        System.out.println(percent);
    }
}
//Enter below the marks for CBSE Board Exam :
//Enter marks of English :
//87
//Enter marks of Mathematics :
//93
//Enter marks of Science :
//93
//Enter marks of Hindi :
//89
//Enter marks of Social Science :
//89
//Of how many marks was paper ?
//100
//The percentage got :
//90.200005