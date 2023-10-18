public class Tut_85_FinallyBlock {
    public static int Division(int a,int b){
        try{
            int div=a/b;
            return div;
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Function ends here ....");
        }
        return 0;
    }
    public static void loop() {
        int b = 5;
        boolean c = true;
        System.out.println("\n\nnew function");
        while (c = true) {
            try {
                System.out.println(100 / b);
                System.out.println("HELLO");
                b--;
            }
            catch(Exception e){
                c=false;
                break;
            }
            finally{
                System.out.println("ENDING ....");
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(Division(12,2));
        System.out.println(Division(12,0));
        loop();
        try{
            System.out.println("\n");
            int c=4/0;
            System.out.println(c);
        }
        finally {
            System.out.println("HELLO");
        }
    }
}
/*
Function ends here ....
6
java.lang.ArithmeticException: / by zero
Function ends here ....
0

new function
20
HELLO
ENDING ....
25
HELLO
ENDING ....
33
HELLO
ENDING ....
50
HELLO
ENDING ....
100
HELLO
ENDING ....
ENDING ....


HELLO
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at Tut_85_FinallyBlock.main(Tut_85_FinallyBlock.java:40)

 */