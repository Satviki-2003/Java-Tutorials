public class Tut_32_MethodOverloading {
    static void good(){
        System.out.println("Good !!!");
    }

    static void change(int x){
        x=89;
    }

    static void change2(int []arr){
        arr[0]=67;
    }

    // Method overloading means creating method with same method
    // name but changing parameters of method
    static void hello(){
        System.out.println("Hello !!!!!");
    }
    static void hello(int x){
        System.out.println(x+" HELLO !!!!");
    }
    static void hello(int y,char z){
        System.out.println(y+" HELLO !!!!!!!");
        System.out.println(z);
    }

    public static void main(String[] args) {
        good();
        //Good !!!

        // Case 1: Changing integer
        int a =78;
        System.out.println(a);
        change(a);
        System.out.println(a);
        //78
        //78
        // No change is seen here

        //Case 2: Changing array element
        int [] marks = {77,45,67,89};
        System.out.println(marks[0]);
        //77
        change2(marks);
        System.out.println(marks[0]);
        //67

        // Method overloading
        hello();
        hello(78);
        hello(67,'H');
        //Hello !!!!!
        //78 HELLO !!!!
        //67 HELLO !!!!!!!
        //H
    }
}
