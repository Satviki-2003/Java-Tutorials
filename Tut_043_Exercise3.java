import java.util.Random;
import java.util.Scanner;

class Game {
    private int num;
    private int num1;
    private int noOfGuesses;

    public Game() {
        Random ran = new Random();
        num = 1 + ran.nextInt(100);
        noOfGuesses=1;
    }

    public void takeUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 to 100 :");
        num1 = sc.nextInt();
    }

    public void isCorrectNumber() {
        if (num1 < 100 && num1 > 0) {
            if (num == num1) {
                System.out.println("CORRECT GUESS !!!!!!");
                System.out.println("Chances : " + noOfGuesses);
            } else {
                noOfGuesses++;
                if (num1 < num) {
                    System.out.println("Enter a bigger number.");
                } else {
                    System.out.println("Enter a smaller number.");
                }
            }
        }
        else {
            System.out.println("Enter a number between 1 to 100.");
        }
    }
    public void actualGame(){
        while(num!=num1){
            takeUserInput();
            isCorrectNumber();
        }
    }
}
public class Tut_43_Exercise3 {
    public static void main(String[] args) {
        System.out.println("\t\t\t\tWELCOME TO GUESS THE NUMBER GAME !!!!!!!!");
        Game g = new Game();
        g.actualGame();
    }
}

