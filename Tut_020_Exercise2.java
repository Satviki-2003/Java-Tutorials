import java.util.Random;
import java.util.Scanner;
public class Tut_20_Exercise2 {
    public static void main(String[] args) {
        // WELCOME message
        System.out.println("WELCOME !!!!!!!!!!!!!!");
        System.out.println("THIS IS THE ROCK,PAPER AND SCISSOR GAME");
        // Random choice of computer
        String[] arr = {"ROCK", "SCISSOR", "PAPER"};
        Random r = new Random();
        int len = arr.length;
        int random_number = r.nextInt(len);
        String l = arr[random_number];
        // Taking user choice
        System.out.println("MAKE A CHOICE : ");
        System.out.println("1. ROCK");
        System.out.println("2. PAPER");
        System.out.println("3. SCISSOR");
        System.out.println("Enter your choice (in number) :");
        Scanner sc = new Scanner(System.in);
        byte ch = sc.nextByte();
        System.out.println("CHOICE OF COMPUTER : " + l);
            if (l.equals("ROCK")) {
                if (ch == 1) {
                    System.out.println("TIE !!!!!");
                } else if (ch == 2) {
                    System.out.println("YOU WIN !!!!!");
                } else {
                    System.out.println("COMPUTER WINS !!!!!");
                }
            } else if (l.equals("SCISSOR")) {
                if (ch == 1) {
                    System.out.println("YOU WIN !!!!!");
                } else if (ch == 2) {
                    System.out.println("COMPUTER WIN !!!!!");
                } else {
                    System.out.println("TIE !!!!!");
                }
            } else {
                if (ch == 1) {
                    System.out.println("COMPUTER WIN !!!!!");
                } else if (ch == 2) {
                    System.out.println("TIE !!!!!");
                } else {
                    System.out.println("YOU WIN !!!!!");
                }

            }
        }
    }


