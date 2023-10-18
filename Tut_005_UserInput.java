import java.util.Scanner;
// Used to take user input

public class Tut_05_UserInput {
    public static void main(String[] args) {
        // Taking input from user
        System.out.println("Taking input from user :");
        Scanner sc = new Scanner(System.in);
        // Taking input from keyboard

        System.out.println("Enter a number :");
        int num1 = sc.nextInt();
        System.out.println("Enter another number :");
        int num2 = sc.nextInt();
        int sum = num1+num2;
        System.out.println("Sum :"+sum);
        /*Taking input from user :
        Enter a number :
        56
        Enter another number :
        56
        Sum :112*/

        // sc.nextFloat = use to take float input
        //sc.hasNextInt = returns true if next input in program is int
        //              = returns booleans
        //sc.next() = read input string till space
        //sc.nextLine() = read whole string no restriction as next() method

    }}
