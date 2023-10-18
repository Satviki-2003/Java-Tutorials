import java.util.Scanner;
public class Tut_19_PracticeSet4 {
    public static void main(String[] args) {
        System.out.println("********************************************");
        // 1. What will be output of the following code :
        int a = 10;
        if (a == 11) {
            System.out.println("I am 11");
        } else {
            System.out.println("I am not 11");
        }


        // 2. write a java program to find if a student is pass or fail
        System.out.println("\n\n********************************************");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks for 100 marks paper :");
        System.out.println("Enter marks of English :");
        float sub1 = sc.nextFloat();
        System.out.println("Enter marks of Mathematics :");
        float sub2 = sc.nextFloat();
        System.out.println("Enter marks of Science :");
        float sub3 = sc.nextFloat();
        float total = sub1 + sub2 + sub3;
        float percent = (total / 300) * 100;
        System.out.println("******************************************");
        System.out.println("PERCENTAGE : " + percent);
        if (sub1 >= 33 && sub2 >= 33 && sub3 >= 33) {

            if (percent >= 40) {
                System.out.println("PASS !!!!!!!!!!");
            } else {
                System.out.println("FAIL !!!!!!!!!!");
            }
        } else {
            System.out.println("FAIL !!!!!!!!!!");
        }

        // 3.Calculate income tax paid by an employee to the government as per salary
        System.out.println("\n\n********************************************");
        System.out.println("Enter your salary (in Lakhs) :");
        float income = sc.nextFloat();
        if (5.0 < income && income > 2.5) {
            float tax = (float) (0.05 * income * 100000);
            System.out.println("Tax Payable :" + tax);
        } else if (income > 5.0 && income < 10.0) {
            float tax = (float) (0.20 * income * 100000);
            System.out.println("Tax Payable :" + tax);
        } else if (income > 10.0) {
            float tax = (float) (0.3 * income * 100000);
            System.out.println("Tax Payable :" + tax);
        } else {
            System.out.println("*****************************************");
            System.out.println("Not Taxable Income");
        }

        // 4.Write a java program to find days of week from given number
        System.out.println("\n\n********************************************");
        System.out.println("Enter a number between 1 to 7 :");
        int num = sc.nextByte();
        if (num == 1) {
            System.out.println("The day is Monday");
        } else if (num == 2) {
            System.out.println("The day is Tuesday");
        } else if (num == 3) {
            System.out.println("The day is Wednesday");
        } else if (num == 4) {
            System.out.println("The day is Thursday");
        } else if (num == 5) {
            System.out.println("The day is Friday");
        } else if (num == 6) {
            System.out.println("The day is Saturday");
        } else {
            System.out.println("The day is Sunday");
        }


        // 5.Java program to find a leap year
        System.out.println("\n\n********************************************");
        System.out.println("Enter a year :");
        int year = sc.nextInt();
        if ((year % 100 == 0 && year % 4 == 0) || year % 4 == 0) {
            System.out.println("LEAP YEAR");
        } else {
            System.out.println("NOT A LEAP YEAR");
        }


        //6.Write a program to find a type of website
        System.out.println("Enter website URL :");
        String website = sc.next();
        if (website.endsWith(".com")) {
            System.out.println("COMMERCIAL WEBSITE");
        } else if (website.endsWith(".org")) {
            System.out.println("ORGANIZATION WEBSITE");
        } else {
            System.out.println("INDIAN WEBSITE");
        }
        // ********************************************
        //I am not 11
        //
        //
        //********************************************
        //Enter your marks for 100 marks paper :
        //Enter marks of English :
        //89
        //Enter marks of Mathematics :
        //98
        //Enter marks of Science :
        //92
        //******************************************
        //PERCENTAGE : 93.0
        //PASS !!!!!!!!!!
        //
        //
        //********************************************
        //Enter your salary (in Lakhs) :
        //7
        //Tax Payable :35000.0
        //
        //
        //********************************************
        //Enter a number between 1 to 7 :
        //4
        //The day is Thursday
        //
        //
        //********************************************
        //Enter a year :
        //2024
        //LEAP YEAR
        //Enter website URL :
        //www.website.in
        //INDIAN WEBSITE
    }
}

