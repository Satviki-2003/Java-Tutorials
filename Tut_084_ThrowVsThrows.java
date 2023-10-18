import java.util.Scanner;
class AgeException1 extends Exception{
    @Override
    public String toString() {
        return "Enter valid age";
    }
}

public class Tut_84_ThrowVsThrows {
    public static void divide(int a,int b) throws ArithmeticException{
        if (b < 0) {
            throw new ArithmeticException();
        }
        else {
            int div=a/b;
            System.out.println("Division : "+div);
        }
    }
    public static void isAgeRight(int a) throws AgeException1 {
        if(a>120){
            throw new AgeException1();
        }
        else{
            System.out.println("Welcome");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            divide(2,0);
        }
        catch (Exception e){
            System.out.println("Exception occurred");
        }
        try{
            System.out.println("Enter age :");
            int age= sc.nextInt();
            isAgeRight(age);
        }
        catch (AgeException1 e) {
            throw new RuntimeException(e);
        }
    }
}
/*
Exception occurred

Enter age :
222
Enter valid age

Enter age :
20
Welcome
 */