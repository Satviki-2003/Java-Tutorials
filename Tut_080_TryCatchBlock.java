public class Tut_80_TryCatchBlock {
    public static void main(String[] args) {
        int a=100;
        int b=0;
        try{
            int div=a/b;
            System.out.println("Division : "+div);
        }
        catch(Exception e){
            System.out.println("Failed to divide because "+e);
        }
    }
}
/*
Failed to divide because java.lang.ArithmeticException: / by zero
 */