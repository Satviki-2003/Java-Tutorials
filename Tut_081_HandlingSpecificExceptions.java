import java.util.Scanner;

public class Tut_81_HandlingSpecificExceptions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []arr=new int[3];
        arr[0]=1;
        arr[1]=4;
        arr[2]=5;
        System.out.println("Enter index of element :");
        int i= sc.nextInt();
        try{
            System.out.println("Element at index "+i+" is "+arr[i]);
            System.out.println("Enter a number :");
            int d= sc.nextInt();
            int div=arr[i]/d;
            System.out.println("Division : "+div);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index is out of bounds");
        }
        catch(ArithmeticException e){
            System.out.println("Number cannot be divided by zero");
        }
        System.out.println("End of program");
    }
}
/*
Enter index of element :
4
Array index is out of bounds
End of program


Enter index of element :
2
Element at index 2 is 5
Enter a number :
3
Division : 1
End of program


Enter index of element :
2
Element at index 2 is 5
Enter a number :
0
Number cannot be divided by zero
End of program

 */