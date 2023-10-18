import java.util.Scanner;

public class Tut_82_NestedTryCatchBlock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[4];
        marks[0] = 99;
        marks[1] = 89;
        marks[2] = 87;
        marks[3] = 56;
        System.out.println("Enter a index :");
        int n = sc.nextInt();
        try {
            int a = marks[n];
            System.out.println("Number at index " + n + " is " + a);
            try {
                System.out.println("Enter a number :");
                int d = sc.nextInt();
                int div = marks[n] / d;
                System.out.println("Division : " + div);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero");
            }
        } catch (Exception e) {
            System.out.println("Array index out of bounds");
        }
        System.out.println("Program ends");

        //Quick Quiz
        // Write a java program that allows you to keep accessing an array
        //untill a valid index is given by user
        int[] marks1 = new int[4];
        marks1[0] = 99;
        marks1[1] = 89;
        marks1[2] = 87;
        marks1[3] = 56;
        boolean b = true;
        while (b) {
            System.out.println("Enter a index :");
            int n1 = sc.nextInt();
            try {
                int a1 = marks1[n1];
                System.out.println("Number at index " + n1 + " is " + a1);
                b=false;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Enter an index between 0 and 3");
            }
        }
        System.out.println("Program ends...");
    }
}
/*
Enter a index :
4
Array index out of bounds
Program ends

Enter a index :
2
Number at index 2 is 87
Enter a number :
0
Cannot divide by zero
Program ends

Enter a index :
2
Number at index 2 is 87
Enter a number :
4
Division : 21
Program ends

QUICK QUIZ :
Enter a index :
6
Enter an index between 0 and 3
Enter a index :
3
Number at index 3 is 56
Program ends...

 */