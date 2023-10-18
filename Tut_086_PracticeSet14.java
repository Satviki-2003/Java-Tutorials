import java.util.Scanner;

/*
PROBLEM 1:
write a java program to demonstrate syntax,runtime and logical errors

PROBLEM 2 :
Write a java program that prints "haha" during Arithmetic Exception and "hehe"
during illegal argument exception

PROBLEM 3:
Write a java program to keep accessing the array untill a valid index is given.
If maximum entries exceed 5 print error.

PROBLEM 4:
Modify Program in Q3 to throw a custom exception if maximum entries are reached.

 */
class MyException1 extends Exception {
    @Override
    public String toString() {
        return "Error Occurred";
    }
}
public class Tut_86_PracticeSet14 {
    public static void Problem1(){
        //Syntax errors
        //int a=90
        //System.out.println(a);

        //Runtime error
        //int d=9;
        //int b=0;
        //int div=d/b;
        //System.out.println(div);

        //Logical error
        System.out.println("Printing Prime numbers");
        for(int i=1;i<5;i++){
            System.out.println(i*2+1);
        }
    }
    public static void Problem2(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a :");
        int a= sc.nextInt();
        System.out.println("Enter b :");
        int b= sc.nextInt();
        //Arithmetic Exception
        try {
            int c=a/b;
        }
        catch (ArithmeticException e){
            System.out.println("Haha");
        }
        catch (IllegalArgumentException e){
            System.out.println("Hehe");
        }
    }
    public static void Problem3(){
        Scanner sc=new Scanner(System.in);
        int[] marks1 = new int[4];
        marks1[0] = 99;
        marks1[1] = 89;
        marks1[2] = 87;
        marks1[3] = 56;
        for(int i=0;i<5;i++) {
            System.out.println("Enter an index :");
            int n1 = sc.nextInt();
            try {
                int a1 = marks1[n1];
                System.out.println("Number at index " + n1 + " is " + a1);
                break;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Enter an index between 0 and 3");
            }
            if(i==4){
                System.out.println("Error");
            }
        }
    }
    public static void Problem4(){
        Scanner sc=new Scanner(System.in);
        int[] marks1 = new int[4];
        marks1[0] = 99;
        marks1[1] = 89;
        marks1[2] = 87;
        marks1[3] = 56;
        for(int i=0;i<5;i++) {
            System.out.println("Enter an index :");
            int n1 = sc.nextInt();
            try {
                int a1 = marks1[n1];
                System.out.println("Number at index " + n1 + " is " + a1);
                break;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Enter an index between 0 and 3");
            }
            if(i==4) {
                try {
                    throw new MyException1();
                }
                catch(MyException1 e){
                    System.out.println(e.toString());
                }
            }
        }
    }
    public static void main(String[] args) {
        Problem4();
    }
}
/*
PROBLEM 1 :

java: ';' expected

Exception in thread "main" java.lang.ArithmeticException: / by zero
	at Tut_86_PracticeSet14.Problem1(Tut_86_PracticeSet14.java:14)
	at Tut_86_PracticeSet14.main(Tut_86_PracticeSet14.java:24)

Printing Prime numbers
3
5
7
9

PROBLEM 2 :
Enter a :
3
Enter b :
0
Haha

Problem 3:
Enter an index :
2
Number at index 2 is 87


Enter an index :
6
Enter an index between 0 and 3
Enter an index :
6
Enter an index between 0 and 3
Enter an index :
6
Enter an index between 0 and 3
Enter an index :
6
Enter an index between 0 and 3
Enter an index :
6
Enter an index between 0 and 3
Error

PROBLEM 4:
Enter an index :
3
Number at index 3 is 56

Enter an index :
5
Enter an index between 0 and 3
Enter an index :
5
Enter an index between 0 and 3
Enter an index :
5
Enter an index between 0 and 3
Enter an index :
5
Enter an index between 0 and 3
Enter an index :
5
Enter an index between 0 and 3
Error Occurred

 */