import java.util.Scanner;
public class Tut_18_SwitchCases {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age :");
        int age = sc.nextInt();
        if (age>56){
            System.out.println("You are experienced.");
        } else if (age>46) {
            System.out.println("You are semi-experienced.");
        } else if (age>36) {
            System.out.println("You are Semi-Semi experienced.");
        }
        else {
            System.out.println("You are not experienced.");
        }
        //Enter your age :
        //45
        //You are Semi-Semi experienced.

        //Switch cases
        // if breaks not used then it executes all the cases after the matched case
        switch (age) {
            case 18:
                System.out.println("You are going to become an adult.");
                break;
            case 23:
                System.out.println("You are going to get a job.");
                break;
            case 60:
                System.out.println("You are going to get retired.");
                break;
            default:
                System.out.println("Enjoy your life !!!!");
                break;
        }
        //Enter your age :
        //23
        //You are not experienced.
        //You are going to get a job.

        // Another form of Switch cases
        // In this form no need of break sentence
        switch (age) {
            case 18 -> System.out.println("You are going to become an adult.");
            case 23 -> System.out.println("You are going to get a job.");
            case 60 -> System.out.println("You are going to get retired.");
            default -> System.out.println("Enjoy your life !!!!");
        }
    }

}
