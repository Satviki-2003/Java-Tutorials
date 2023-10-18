import java.util.Scanner;

public class Tut_13_Strings {
    public static void main(String[] args) {
        String name = new String("Harry");
        System.out.println(name);
        // Harry

        // Print does not add a new line or space while printing
        System.out.print("The name is :");
        System.out.print(name);
        // The name is :Harry

        // printf is used to format a string
        int a = 6;
        float b = 5.5454f;
        System.out.printf("\n The value of a is %d and value of b is %f",a,b);
        // The value of a is 6 and value of b is 5.545400

        // Accepting an Input as string
        Scanner sc = new Scanner(System.in);
        // sc.next only prints the string until the first space
        System.out.println("\n Enter string : ");
        //String str = sc.next();
        //System.out.println(str);
        // Enter string :
        //YOU ARE MAD
        //YOU

        // sc.nextLine() can print the whole string irrespective of space
        System.out.println("Enter Strings : ");
        String str1 = sc.nextLine();
        System.out.println(str1);
        // Enter Strings :
        //HI HOW R U ?
        //HI HOW R U ?

    }
}
