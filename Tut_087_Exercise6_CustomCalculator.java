import java.util.Scanner;

class InvalidInputException extends Exception{
    public String toString() {
        return "Enter a valid input";
    }
}
class MaxNumberException extends Exception{
    @Override
    public String toString() {
        return "Enter a number less than 10000";
    }
}
class MaxMultiplicationException extends Exception{
    @Override
    public String toString() {
        return "Enter a number less than 7000";
    }
}
class ZeroInputException extends Exception{
    @Override
    public String toString() {
        return "A number cannot be divided by zero";
    }
}
class Calculations {
    public static void Addition(double a,double b){
        double add=a+b;
        System.out.println("Addition : "+add);
    }
    public static void Subtraction(double a,double b){
        double sub=a-b;
        System.out.println("Subtraction : "+sub);
    }
    public static void Multiplication(double a,double b){
        double multi=a*b;
        System.out.println("Multiplication : "+multi);
    }
    public static void Division(double a,double b){
        double div=a/b;
        System.out.println("Division : "+div);
    }
}
public class Tut_87_Exercise6_CustomCalculator {
    public static void main(String[] args) {
        System.out.println("\t\tWELCOME !!");
        Scanner sc = new Scanner(System.in);
        int ch=0;
        while(ch!=5) {
            System.out.println("Enter first number : ");
            int a = sc.nextInt();
            System.out.println("Enter second number : ");
            int b = sc.nextInt();
            if (a > 10000 || b > 10000) {
                try {
                    throw new MaxNumberException();
                } catch (MaxNumberException e) {
                    System.out.println(e.toString());
                    continue;
                }
            }
            if (b == 0) {
                try {
                    throw new ZeroInputException();
                } catch (ZeroInputException e) {
                    System.out.println(e.toString());
                    continue;
                }
            }
            if (a < 0 || b < 0) {
                try {
                    throw new InvalidInputException();
                } catch (InvalidInputException e) {
                    System.out.println(e.toString());
                    continue;
                }
            }
            System.out.println("********************** MENU **********************");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.println("Enter your choice :");
            ch= sc.nextInt();
            if(ch==3){
                if(a>7000 || b>700){
                    try{
                        throw new MaxMultiplicationException();
                    }
                    catch (MaxMultiplicationException e){
                        System.out.println(e.toString());
                        continue;
                    }
                }
            }
            switch (ch) {
                case 1 -> Calculations.Addition(a, b);
                case 2 -> Calculations.Subtraction(a, b);
                case 3 -> Calculations.Multiplication(a, b);
                case 4 -> Calculations.Division(a, b);
                case 5 -> System.out.println("Exiting...");
            }
            System.out.println("\n");
        }
    }
}
