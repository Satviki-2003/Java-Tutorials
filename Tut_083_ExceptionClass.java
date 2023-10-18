import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString() {
        return "I am tostring method of class MyException";
    }

    @Override
    public String getMessage() {
        return "I am getMessage method of class myException";
    }
}
class AgeException extends Exception{
    @Override
    public String toString() {
        return "Enter valid age";
    }
}
public class Tut_83_ExceptionClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int a=sc.nextInt();
        if(a<9){
        try {
                throw new MyException();
            }
        catch (MyException e){
            System.out.println(e.toString());
            System.out.println(e.getMessage());
        }
        }
        System.out.println("Enter your age :");
        int age= sc.nextInt();
        if(age>120){
            try {
                throw new AgeException();
            }
            catch (AgeException e){
                System.out.println(e.toString());
            }
        }
        System.out.println("Program ends");
    }
}
/*
Enter a number :
3
I am tostring method of class MyException
I am getMessage method of class myException

Enter your age :
900
Enter valid age
Program ends

Enter your age :
78
Program ends
 */