@FunctionalInterface
interface F2{
    public void add();
    }

public class Tut_109_AnonymousClasses_LambdaFunctions {
    public static void main(String[] args) {
        //Anonymous class
        F2 f=new F2() {
            @Override
            public void add() {
                System.out.println(2+3);
            }
        };
        f.add();

        //Lambda expression
        F2 obj=() -> {
            System.out.println("Adding....");
        };
        obj.add();
    }
}
/*
5
Adding....
 */