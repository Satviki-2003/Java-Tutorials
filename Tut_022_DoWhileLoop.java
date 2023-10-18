import java.util.Scanner;
public class Tut_22_DoWhileLoop {
    public static void main(String[] args) {
        int b = 0;
        do {
            System.out.println(b);
            b++;
        } while (b < 5);
        // 0
        //1
        //2
        //3
        //4
        int a = 10;
        do {
            System.out.println("DO WHILE LOOP");
            System.out.println(a);
            b++;
        } while (a < 5);
        // in do-while loop first time loop is executed and after that the condition is checked
        //DO WHILE LOOP
        //10

        // QUICK QUIZ
        // PRINTING FIRST N NATURAL NUMBERS
        byte n = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number until which you want to print Natural numbers :");
        int num = sc.nextInt();
        System.out.println("FIRST 10 NATURAL NUMBERS :");
        do {
            System.out.println(n);
            n++;
        }while (n<=num);
        //Enter a number until which you want to print Natural numbers :
        //10
        //FIRST 10 NATURAL NUMBERS :
        //1
        //2
        //3
        //4
        //5
        //6
        //7
        //8
        //9
        //10
        }
    }

