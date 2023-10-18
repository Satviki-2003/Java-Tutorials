interface MyCamera{
    void takeVideo();
    void takePic();
    //Private methods can't be accessed outside the class
    //They are mostly use to minimize the logic
    private void greet1(){
        System.out.println("Good !!!!");
    }
    //Default method is implemented without being overridden
    //It saves the time to edit each class which implements the interface
    //Default methods can also be overridden
    default void greet(){
        greet1();
        System.out.println("Good Night !!");
    }
}
interface MyWifi{
    void checkNetwork();
    void printNetworks();
}
class MyCellphone{
    public void makeCall(){
        System.out.println("Calling...");
    }
    public void textMe(){
        System.out.println("Texting Message....");
    }
}
class MySmartphone extends MyCellphone implements MyCamera,MyWifi{
    @Override
    public void checkNetwork() {
        System.out.println("Checking networks ...");
    }

    @Override
    public void printNetworks() {
        System.out.println("Networks are 5G,4G,3G and 2G");
    }

    @Override
    public void takePic() {
        System.out.println("Taking pics....");
    }

    @Override
    public void takeVideo() {
        System.out.println("Taking video....");
    }
}
public class Tut_57_DefaultMethods {
    public static void main(String[] args) {
        MySmartphone s=new MySmartphone();
        s.checkNetwork();
        s.takePic();
        s.printNetworks();
        s.takeVideo();
        s.makeCall();
        s.textMe();
        s.greet();
    }
}
//Checking networks ...
//Taking pics....
//Networks are 5G,4G,3G and 2G
//Taking video....
//Calling...
//Texting Message....
//Good !!!!
//Good Night !!
