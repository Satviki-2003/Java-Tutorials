//Problem 1: Create an abstract class Pen with methods write() and refill() as
//abstract methods
abstract class Pen{
    abstract void write();
    abstract void refill();
}
class pen1 extends Pen{
    public void write(){
        System.out.println("Writing ....");
    }
    public void refill(){
        System.out.println("Refilling Pen...");
    }
}

//Problem 2: Use the pen class from problem 1 to create a concrete class
//FountainPen with additional method changeNib()
class FountainPen extends Pen{
    public void write(){
        System.out.println("Writing ....");
    }
    public void refill(){
        System.out.println("Refilling Pen...");
    }
    public void changeNib(){
        System.out.println("Changing Nib....");
    }
}

//Problem 3: Create a class monkey with jump() and bite() methods.Create a class
//Human which inherits this monkey class and implements BasicAnimal interface
//with eat() and sleep() methods
class Monkey{
    public void jump(){
        System.out.println("Jumping");
    }
    public void bite(){
        System.out.println("Bad Monkey !!!");
        System.out.println("Don't bite");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
    @Override
    public void eat() {
        System.out.println("Eat food");
    }

    @Override
    public void sleep() {
        System.out.println("Sleep for 8 hours");
    }
}

//Problem 4 :Create a class Telephone with ring(),lift() and disconnect() methods
//as abstract methods.create another class Smartphone and demonstrate polymorphism
abstract class Telephone{
   abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class Smartphone1 extends Telephone{
    public void ring(){
        System.out.println("Ring...");
    }
    public void lift(){
        System.out.println("Lifting phone....");
    }
    public void disconnect(){
        System.out.println("Disconnected....");
    }
}

//Problem 6:Create an interface TVRemote and use it to inherit another
//interface SmartTVRemote
interface TVRemote{
    void changeChannel();
    void off();
}
interface SmartTVRemote{
    void ChangePlatform(String s);
}
class Remote implements TVRemote,SmartTVRemote{
    @Override
    public void changeChannel() {
        System.out.println("Change the channel");
    }

    @Override
    public void off() {
        System.out.println("Switch off...");
    }

    @Override
    public void ChangePlatform(String s) {
        System.out.println("Changing to "+s);
    }
}

//Problem 7:Create a class TV Which implements TVRemote interface
class TV implements TVRemote{
    @Override
    public void changeChannel() {
        System.out.println("Changing...");
    }

    @Override
    public void off() {
        System.out.println("Turning off...");
    }
}

public class Tut_60_PracticeSet11 {
    public static void main(String[] args) {
        //Problem 1
        pen1 stylo=new pen1();
        stylo.write();
        stylo.refill();
        //Writing ....
        //Refilling Pen...

        //Problem 2
        FountainPen p=new FountainPen();
        p.refill();
        p.write();
        p.changeNib();
        //Refilling Pen...
        //Writing ....
        //Changing Nib....

        //Problem 3
        Human h=new Human();
        h.jump();
        h.bite();
        h.eat();
        h.sleep();
        //Jumping
        //Bad Monkey !!!
        //Don't bite
        //Eat food
        //Sleep for 8 hours

        //Problem 4
        Telephone s=new Smartphone1();
        s.disconnect();
        s.ring();
        s.lift();
        //Disconnected....
        //Ring...
        //Lifting phone....

        //Problem 5:Demonstrate polymorphism using monkey class from Problem 3
        Monkey m=new Human();
        m.bite();
        m.jump();
        //Bad Monkey !!!
        //Don't bite
        //Jumping

        //problem 6
        Remote r=new Remote();
        r.changeChannel();
        r.ChangePlatform("Voot");
        r.off();
        //Change the channel
        //Changing to Voot
        //Switch off...

        //Problem 7
        TV t=new TV();
        t.changeChannel();
        t.off();
        //Changing...
        //Turning off...
    }
}
