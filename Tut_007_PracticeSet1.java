import java.util.Scanner;
public class Tut_07_PracticeSet1 {
    public static void main(String[] args) {
        // 1. Java program to add 3 numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Java Program to add three numbers :");
        System.out.println("Enter a :");
        int a = sc.nextInt();
        System.out.println("Enter b :");
        int b = sc.nextInt();
        System.out.println("Enter c :");
        int c = sc.nextInt();
        int add = a+b+c;
        System.out.println(a+"+"+b+"+"+c+"="+add);


        // 2.Calculate CGPA of marks of three subjects
        System.out.println("***********CGPA CALCULATOR***********");
        System.out.println("*** ENTER MARKS OUT OF 100 ***");
        System.out.println("Enter marks of Science :");
        float sub1 = sc.nextFloat();
        System.out.println("Enter marks of Mathematics :");
        float sub2 = sc.nextFloat();
        System.out.println("Enter marks of Language :");
        float sub3 = sc.nextFloat();
        float CGPA = (sub1+sub2+sub3)/30;
        System.out.println("********** CGPA :"+CGPA+"**********");

        // 3.Greeting template
        System.out.println("*********** GREETING TEMPLATE ***********");
        System.out.println("Enter your name :");
        String name = sc.next();
        System.out.println("Hello"+" "+name+", have good day !");

        // 4.Java program to convert km to miles
        System.out.println("*********** Km to Miles converter ***********");
        System.out.println("Enter the distance in km :");
        double km = sc.nextDouble();
        double miles = km/1.609;
        System.out.println(km+" "+"km"+" "+"="+" "+miles+" "+"miles");

        // 5.Java program to detect whether the entered number is int or not
        System.out.println("*********** INTEGER VALUE DETECTOR ***********");
        System.out.println("Enter a number :");
        System.out.println(sc.hasNextInt());

        // Java Program to add three numbers :
        //Enter a :
        //56
        //Enter b :
        //78
        //Enter c :
        //89
        //56+78+89=223
        //***********CGPA CALCULATOR***********
        //*** ENTER MARKS OUT OF 100 ***
        //Enter marks of Science :
        //90
        //Enter marks of Mathematics :
        //97
        //Enter marks of Language :
        //98
        //********** CGPA :9.5**********
        //*********** GREETING TEMPLATE ***********
        //Enter your name :
        //Satviki
        //Hello Satviki, have good day !
        //*********** Km to Miles converter ***********
        //Enter the distance in km :
        //89
        //89.0 km = 55.31385954008701 miles
        //*********** INTEGER VALUE DETECTOR ***********
        //Enter a number :
        //57.88
        //false
    }
}
