class Base{
    int x;
    Base(){
        System.out.println("I am in class base now");
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getX() {
        return x;
    }
}

//Creating class with characteristics inherited from class base
class Derived extends Base{
    int y;
    public void setY(int y) {
        this.y = y;
    }
    public int getY() {
        return y;
    }
}
public class Tut_45_Inheritance {
    public static void main(String[] args) {
        //Creating object of base class
        Base b=new Base();
        b.setX(89);
        System.out.println(b.getX());
        //I am in class base now
        //89

        //Creating an object of derived class
        Derived d=new Derived();
        d.setY(90);
        d.setX(78);
        System.out.println(d.getX());
        System.out.println(d.getY());
        //I am in class base now
        //78
        //90
    }
}
