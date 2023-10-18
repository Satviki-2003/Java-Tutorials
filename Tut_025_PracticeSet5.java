import java.util.Scanner;
public class Tut_25_PracticeSet5 {
    public static void main(String[] args) {


        //1.Write a program to print star pattern
        System.out.println("STAR PATTERN :");
        for (byte n = 4; n != 0; n--) {
            for (byte j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println("\n");
        }
        //STAR PATTERN :
        //****
        //
        //***
        //
        //**
        //
        //*


        //2.Write a program to sum first n even numbers
        System.out.println("ADDITION OF FIRST n EVEN NUMBERS :");
        System.out.println("Enter n :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num1 = num * 2;
        int i = 1;
        int add = 0;
        System.out.println("Let's Add Following numbers :");
        while (num1 >= i) {
            if (i % 2 == 0) {
                System.out.print(i + " +");
                add = add + i;
                if (num1 == i) {
                    System.out.println("0");
                }
            }
            i++;
        }
        System.out.print("\n");
        System.out.println("Addition :");
        System.out.println(add);
        //ADDITION OF FIRST n EVEN NUMBERS :
        //Enter n :
        //20
        //Let's Add Following numbers :
        //2 +4 +6 +8 +10 +12 +14 +16 +18 +20 +22 +24 +26 +28 +30 +32 +34 +36 +38 +40 +0
        //
        //Addition :
        //420


        //3.Write a program to print multiplication table of number n in reverse order
        System.out.println("Enter a number to print it's multiplication table :");
        int e = sc.nextInt();
        System.out.println("MULTIPLICATION TABLE OF " + e + " :");
        byte r = 10;
        while (r != 0) {
            System.out.print(e + " * " + r + " = ");
            System.out.println(e * r);
            r--;
        }
        //MULTIPLICATION TABLE OF 5 :
        //5 * 10 = 50
        //5 * 9 = 45
        //5 * 8 = 40
        //5 * 7 = 35
        //5 * 6 = 30
        //5 * 5 = 25
        //5 * 4 = 20
        //5 * 3 = 15
        //5 * 2 = 10
        //5 * 1 = 5


        //4.Write a program to print multiplication table of 10 in reverse order
        byte w = 10;
        System.out.println("MULTIPLICATION TABLE OF 10");
        for (byte q = 10; w != 0; w--) {
            System.out.print(q + " * " + w + " = ");
            System.out.println(q * w);
        }
        //MULTIPLICATION TABLE OF 10
        //10 * 10 = 100
        //10 * 9 = 90
        //10 * 8 = 80
        //10 * 7 = 70
        //10 * 6 = 60
        //10 * 5 = 50
        //10 * 4 = 40
        //10 * 3 = 30
        //10 * 2 = 20
        //10 * 1 = 10


        //5.Write a program to find factorial of a number using loops
        System.out.println("ENTER A NUMBER TO FIND IT'S FACTORIAL :");
        int t = sc.nextInt();
        int u =1;
        for (int y = t ;y!=0;y--){
            u = y * u;
        }
        System.out.println("Factorial of "+t+" :");
        System.out.println(u);
        //ENTER A NUMBER TO FIND IT'S FACTORIAL :
        //5
        //Factorial of 5 :
        //120


        //6.Repeat 5 using while loop
        System.out.println("ENTER A NUMBER TO FIND IT'S FACTORIAL :");
        int o = sc.nextInt();
        int p =1;
        System.out.println("Factorial of "+o+" :");
        while (o!=0){
            p= p *o;
            o--;
        }
        System.out.println(p);
        //ENTER A NUMBER TO FIND IT'S FACTORIAL :
        //5
        //Factorial of 5 :
        //120


        //7. Repeat 1 using while loop
        byte s = 4;
        System.out.println("STAR PATTERN :");
        while (s != 0) {
            for (byte d = 0; d < s; d++) {
                System.out.print("*");
            }
            s--;
            System.out.println("\n");
            //STAR PATTERN :
            //****
            //
            //***
            //
            //**
            //
            //*
        }


        //8.What can be done using one type of loop can be done using other two types of loops
        //--> TRUE


        //9.Write a program to find addition of numbers occuring in multiplication table of 8
        byte f = 8;
        int k = 0;
        for (byte g = 10; g != 0; g--) {
            int h = f * g;
            k = k + h;
        }
        System.out.println("Addition of numbers occuring in multiplication table of 8 :");
        System.out.println(k);
        //Addition of numbers occuring in multiplication table of 8 :
        //440


        //10.A do-while loop is executed :
        //-->1.At least once


        //11. Repeat 2 using for loop
        System.out.println("Enter n :");
        int l = sc.nextInt();
        int l1=l*2;
        int z = 1;
        System.out.println("Addition of first "+l+" natural numbers :");
        int add1;
        for (add1 = 0; z <= l1; z++) {
            if (z % 2 == 0) {
                System.out.print(z + " + ");
                add1 = add1 + z;
            }
            if (z == l1) {
                System.out.print("0 =");
            }
        }
        System.out.println(add1);
        //Enter n :
        //20
        //Addition of first 20 natural numbers :
        //2 + 4 + 6 + 8 + 10 + 12 + 14 + 16 + 18 + 20 + 22 + 24 + 26 + 28 + 30 + 32 + 34 + 36 + 38 + 40 + 0 =420
    }
}