abstract class Base2{
    abstract void print();
    public void greet(){
        System.out.println("Hello !!!!!");
    }
}
class child extends Base2{
    @Override
    void print() {
        System.out.println("Hello There !!!!");
    }
    void greets(){
        System.out.println("Good !!!!!");
    }
}
public class Tut_53_AbstractClassAndMethods {
    public static void main(String[] args) {
        child c=new child();
        c.greets();
        c.print();
        c.greet();
    }
}
//Good !!!!!
//Hello There !!!!
//Hello !!!!!

//An object of abstract class can't be created
//Abstract class is used as standard class from which by inheritance the abstract method in that class is overridden
//Any single abstract method in class makes class abstract
//The inherited classes must also implement the abstract method otherwise compiler throws error
