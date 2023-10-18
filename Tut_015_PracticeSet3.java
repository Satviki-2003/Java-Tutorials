import java.util.Scanner;

public class Tut_15_PracticeSet3 {
    public static void main(String[] args) {
        // 1.write a program to convert a string to lower case
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to convert it to lower case :");
        String str = sc.nextLine();
        String str1 = str.toLowerCase();
        System.out.println("Converted string : "+str1);
        // Enter a string to convert it to lower case :
        //HELLO WORLD
        //Converted string : hello world


        // 2.Java program to replace the spaces with underscores
        System.out.println("Enter string :");
        String str3 = sc.nextLine();
        String str4 = str3.replace(" ","_");
        System.out.println("String after replacement : "+str4);
        // Enter string :
        //HELLO   WORLD
        //String after replacement : HELLO___WORLD


        // 3.write a java program to fill in the letter template
        System.out.println("Enter name :");
        String some_name = sc.nextLine();
        String letter = "Dear <name> , Thanks a lot";
        System.out.println(letter.replace("<name>",some_name));
        // Enter name :
        //Satviki
        //Dear Satviki , Thanks a lot


        // 4.Write a java program to detect double and triple spaces in string
        System.out.println("Enter a string with extra spaces :");
        String spaces = sc.nextLine();
        int index1 =spaces.indexOf("  ");
        int index2 = spaces.indexOf("   ");
        System.out.println("Double spaces at : "+index1);
        System.out.println("Triple spaces at : "+index2);
        // Enter a string with extra spaces :
        //HELLO  WOR   LD
        //Double spaces at : 5
        //Triple spaces at : 10


        // 5.Write a java program to format a letter
        String letter1 = "Dear Harry,\nThis Java course is nice.\nThanks";
        System.out.println("Formatted letter : ");
        System.out.println(letter1);
        // Formatted letter :
        //Dear Harry,
        //This Java course is nice.
        //Thanks

    }
}
