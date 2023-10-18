class Base1{
    Base1(){
        System.out.println("I am constructor of class Base1");
    }
    Base1(int x){
        System.out.println("I am constructor of base1 with value of x : "+x);
    }
}
class Child extends Base1{
    Child(){
        System.out.println("I am constructor of class child");
    }
    Child(int x,int y){
        super(x);
        System.out.println("I am constructor of class child with value of y : "+y);
    }
}

class GrandChild extends Child{
    GrandChild(){
        System.out.println("I am constructor of class GrandChild");
    }
    GrandChild(int x,int y,int z){
        super(x,y);
        System.out.println("I am constructor of class GrandChild with value of z : "+z);
    }
}
public class Tut_46_ConstructorsInInheritance {
    public static void main(String[] args) {
        GrandChild g=new GrandChild();
        //I am constructor of class Base1
        //I am constructor of class child
        //I am constructor of class GrandChild

        GrandChild gc =new GrandChild(67,89,23);
        //I am constructor of base1 with value of x : 67
        //I am constructor of class child with value of y : 89
        //I am constructor of class GrandChild with value of z : 23
    }
}
