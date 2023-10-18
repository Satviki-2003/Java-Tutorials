import java.util.Scanner;

public class Tut_79_Syntax_Runtime_LogicalErrors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Syntax error
        /*
        int a=3
        System.out.println(a);
        ERROR : java: ';' expected
         */

        //Runtime Error
        System.out.println("Enter a number :");
        int n=sc.nextInt();
        System.out.println("Division : "+100/n);
        /*
        Enter a number :
        0
        Exception in thread "main" java.lang.ArithmeticException: / by zero
	    at Tut_79_Syntax_Runtime_LogicalErrors.main(Tut_79_Syntax_Runtime_LogicalErrors.java:16)
        */

        //Logical Error
        System.out.println("Prime number between 1 and 10 :");
        for(int i=1;i<5;i++){
            System.out.println(2*i+1);
        }
        /*
        Prime number between 1 and 10 :
        3
        5
        7
        9
         */
    }
}
