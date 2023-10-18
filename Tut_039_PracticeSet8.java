// Problem 1: Create a class employee with following properties and methods
//salary,getsalary,name,getname,setname
class Employee1{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public void getName(){
        System.out.println("My name is "+name);
    }
    public void setName(String n){
        name=n;
    }
}

//Problem 2: Create a class cellphone having methods to print "Ringing..",
//"Vibrating..",etc.
class Cellphone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
    public void callFriend(){
        System.out.println("Calling a friend...");
    }
}

//problem 3:Create a class Square with a method to initialise its side,calculating area,
//perimeter,etc.
class Square{
    int side;

    public void peri(){
        int perim = side*4;
        System.out.println("Perimeter : "+perim);
    }
    public void area(){
        int areas = side*side;
        System.out.println("Area : "+areas);
    }
}

//problem 4: Create a class Rectangle and repeat 3
class Rectangle{
    int side1;
    int side2;
    public void peri(){
        int perim =2*(side1+side2);
        System.out.println("Perimeter : "+perim);
    }
    public void area(){
        int areas = side1*side2;
        System.out.println("Area : "+areas);
    }
}

//Create a class TommyVecetti for Rockstar Games capable of hitting(print
//hitting..),running,firing,etc.
class TommyVecetti{
    public void hit(){
        System.out.println("Hitting....");
    }
    public void run(){
        System.out.println("Running...");
    }
    public void fire(){
        System.out.println("Firing...");
    }
}

//Problem 6: Repeat 4 for a Circle
class Circle{
    int radius;
    public void peri(){
        double perim =2*3.14*radius;
        System.out.println("Perimeter : "+perim);
    }
    public void area(){
        double areas = 3.14*radius*radius;
        System.out.println("Area : "+areas);
    }
}

public class Tut_39_PracticeSet8 {
    public static void main(String[] args) {
        //Problem 1
        Employee1 satviki = new Employee1();
        satviki.name="Satviki C";
        satviki.salary=90000;
        satviki.getName();
        int s=satviki.getSalary();
        System.out.println("My salary is "+s);
        satviki.setName("S.C");
        satviki.getName();
        //My name is Satviki C
        //My salary is 90000
        //My name is S.C

        //Problem 2
        Cellphone samsung = new Cellphone();
        samsung.ring();
        samsung.vibrate();
        samsung.callFriend();
        //Ringing...
        //Vibrating...
        //Calling a friend...

        //Problem 3
        Square sq=new Square();
        sq.side=5;
        sq.peri();
        sq.area();
        //Perimeter : 20
        //Area : 25

        //Problem 4
        Rectangle r=new Rectangle();
        r.side1=8;
        r.side2=10;
        r.peri();
        r.area();
        //Perimeter : 36
        //Area : 80

        //Problem 5
        TommyVecetti t= new TommyVecetti();
        t.fire();
        t.hit();
        t.run();
        //Firing...
        //Hitting....
        //Running...

        //Problem 6
        Circle c=new Circle();
        c.radius=4;
        c.peri();
        c.area();
        //Perimeter : 25.12
        //Area : 50.24
    }
}
