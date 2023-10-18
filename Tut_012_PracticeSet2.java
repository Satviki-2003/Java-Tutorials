import java.util.Scanner;
public class Tut_12_PracticeSet2 {
    public static void main(String[] args) {

        //1
        // Find the result of the following expression
        float a = 7/4.0f*9/2.0f;
        System.out.println(a);
        //7.875

        //2
        //Write a java program to encrypt a grade by adding 8 to it
        // decrypt it to show the right grade
        char grade ='B';
        grade = (char) ( grade + 8);
        System.out.println(grade);
        // J
        grade = (char)(grade-8);
        System.out.println(grade);
        //B

        //3
        //Use comparison operator to find out whether a given number is
        //greater than user entered number or not
        int num = 100;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to compare :");
        int comp = sc.nextInt();
        System.out.println(comp<100);
        //Enter a number to compare :
        //78
        //true

        //4
        // Using a expression
        int v =90;
        int u = 189;
        int s = 90;
        float exp = ((v*v)-(u*u))/(2*a*s);
        System.out.println("Exp : "+exp);
        //Exp : -19.485714

        // 5
        // Find the value of :
        int x = 7;
        int exp1 = x*49/7+35/7;
        System.out.println(exp1);
        // 54
    }
}
