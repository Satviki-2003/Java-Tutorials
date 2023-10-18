public class Tut_34_RecursionInJava {
    static int factorial(int n){
        if(n==1 || n==0){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }

    public static void main(String[] args) {
        int f=factorial(3);
        System.out.println(f);
        //6
    }
}
