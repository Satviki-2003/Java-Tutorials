class A{
    public void print(){
        System.out.println("I am method of class A");
    }
}
class B extends A{
    //Method Overriding
    public void print(){
        System.out.println("I am method of class B");
    }
}
public class Tut_48_MethodOverriding {
    public static void main(String[] args) {
        A a=new A();
        a.print();
        B b=new B();
        b.print();
    }
}
//I am method of class A
//I am method of class B
