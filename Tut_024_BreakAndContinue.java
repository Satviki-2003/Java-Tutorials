public class Tut_24_BreakAndContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            System.out.println("Java is GREAT !!!!");
            if (i == 2) {
                System.out.println("Ending the loop");
                break;
            }
            //0
            //Java is GREAT !!!!
            //1
            //Java is GREAT !!!!
            //2
            //Java is GREAT !!!!
            //Ending the loop
        }
        int j = 0;
        do {
            System.out.println(j);
            System.out.println("HELLO !!!!");
            if (j == 2) {
                System.out.println("Ending the loop");
                break;
            }
            j++;
        }
        while (j < 5);
        System.out.println("LOOP ENDS HERE");

        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                System.out.println("Ending the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("Java is GREAT !!!!");

        }
    }
}
