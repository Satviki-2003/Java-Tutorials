import java.util.Scanner;
public class Tut_23_ForLoop {
    public static void main(String[] args) {
        for (int i = 0;i<=10;i++){
            System.out.println(i);
        }
        //0
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


        // QUICK QUIZ
        // Write a program to print first n odd numbers using for loop
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number untill which odd numbers are to be printed :");
        int num = sc.nextInt();
        System.out.println("Odd numbers between 1 and "+num+" are :");
        for(byte j = 0;j<=num;j++){
            if (j % 2 != 0){
                System.out.println(j);
            }
        }
        //Enter a number untill which odd numbers are to be printed :
        //30
        //Odd numbers between 1 and 30 are :
        //1
        //3
        //5
        //7
        //9
        //11
        //13
        //15
        //17
        //19
        //21
        //23
        //25
        //27
        //29

        // Decrementing for loop
        System.out.println("Decrementing for loop");
        for(int i=5;i>0;i--){
            System.out.println(i);
        }
        //Decrementing for loop
        //5
        //4
        //3
        //2
        //1

        // Quick quiz
        // write a program to print first n natural numbers in reverse order
        System.out.println("Enter a number for printing first n natural numbers in reverse order :");
        int num1= sc.nextInt();
        System.out.println("PRINTING FIRST "+num1+" NATURAL NUMBERS IN REVERSE ORDER");
        for (int a =num1;a!=0;a--){
            System.out.println(a);
        }
        //PRINTING FIRST 20 NATURAL NUMBERS IN REVERSE ORDER
        //20
        //19
        //18
        //17
        //16
        //15
        //14
        //13
        //12
        //11
        //10
        //9
        //8
        //7
        //6
        //5
        //4
        //3
        //2
        //1
    }
}
