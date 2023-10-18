interface MyCamera1{
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
interface MyWifi1{
    void checkNetwork();
    void printNetworks();
}
class MyCellphone1{
    public void makeCall(){
        System.out.println("Calling...");
    }
    public void textMe(){
        System.out.println("Texting Message....");
    }
}
class MySmartphone1 extends MyCellphone1 implements MyCamera1,MyWifi1{
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
public class Tut_59_PolymorphismInInterfaces {
    public static void main(String[] args) {
        //So here only methods of MyCamera1 can be used
        //This is polymorphism
        MyCamera1 mycam= new MySmartphone1();
        mycam.takePic();
        mycam.takeVideo();
        mycam.greet();
        //Taking pics....
        //Taking video....
        //Good !!!!
        //Good Night !!

        //So here only methods of MyWifi1 can be used
        MyWifi1 wifi=new MySmartphone1();
        wifi.checkNetwork();
        wifi.printNetworks();
        //Checking networks ...
        //Networks are 5G,4G,3G and 2G
    }
}
