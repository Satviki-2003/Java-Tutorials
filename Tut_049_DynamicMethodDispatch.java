class Phone{
    public void greet(){
        System.out.println("Good Morning !!!");
    }
    public void on(){
        System.out.println("Turning on phone ....");
    }
}
class Smartphone extends Phone{
    public  void music(){
        System.out.println("Playing music...");
    }
    public void on(){
        System.out.println("Turning on smartphone ....");
    }
}
public class Tut_49_DynamicMethodDispatch {
    public static void main(String[] args) {
        Phone p=new Smartphone();
        //The overridden method of subclass gets prints while all other methods
        // of superclass are accessible
        p.on();
        p.greet();
    }
}
