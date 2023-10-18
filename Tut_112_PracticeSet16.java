import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
PROBLEM 1 :
Create a class and a method with deprecated annotation.
What is its effect on program execution ?

PROBLEM 2:
We saw how compiler generated warnings could be suppressed using annotation.
Add such annotation to suppress the warning in PROBLEM 1.

PROBLEM 3:
Create an interface and generate an instance from it.

PROBLEM 4:
Write a Java program to generate a multiplication table of a given number and
write it to a file.
 */
class Problem1{
    @Deprecated
    public void add(int a){
        System.out.println("Addition : "+(a+10));
    }
}
interface Problem3{
    public void prints();
}

public class Tut_112_PracticeSet16 {
    public static void main(String[] args) {
        //Problem 2
        @SuppressWarnings("deprication")

        //Problem 1
        Problem1 p1=new Problem1();
        p1.add(56);

        //Problem 3
        Problem3 p3=new Problem3() {
            @Override
            public void prints() {
                System.out.println("Hello :)");
            }
        };
        p3.prints();

        //problem 4
        System.out.println("Enter a number :");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        File f1=new File("MyFile1.txt");
        try {
            f1.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileWriter fw=new FileWriter(f1);
            fw.write("Multiplication table of "+n+"\n");
            for(int i=1;i<11;i++){
                int num=n*i;
                fw.write(n+" * "+i+" = "+num+"\n");
            }
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
/*
PROBLEM 1:
Addition : 66

PROBLEM 3 :
Hello :)

PROBLEM 4:
Enter a number :
10

WRITTEN IN FILE :
Multiplication table of 10
10 * 1 = 10
10 * 2 = 20
10 * 3 = 30
10 * 4 = 40
10 * 5 = 50
10 * 6 = 60
10 * 7 = 70
10 * 8 = 80
10 * 9 = 90
10 * 10 = 100
 */