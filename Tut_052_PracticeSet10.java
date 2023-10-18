//Problem 1:Create a class circle and use inheritance to create another class
//Cylinder from it
class Circle2{
    private int r;
    public int getR() {
        return r;
    }
    public void setR(int r) {
        this.r = r;
    }
    public void area(){
        double area = 3.14*r*r;
        System.out.println("Area : "+area);
    }
}
class Cylinder1 extends Circle2{
    private int r,h;
    //Problem 3: Create methods for volume and area in Problem 1
    public void Volume(){
        r=90;
        h=56;
        double v=3.14*r*r*h;
        System.out.println("Volume : "+v);
    }
}
//Problem 2:Create a class Rectangle and use inheritance to create another class cuboid
class Rectangle2{
    private int l,b;
    public int getL() {
        return l;
    }
    public void setL(int l) {
        this.l = l;
    }
    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }
    //Problem 4: Create methods for area and volume in problem 2
    public void area(){
        double a= l*b;
        System.out.println("Area : "+a);
    }
}
class Cuboid extends Rectangle2{
    private int h,l,b;
    Cuboid() {
        l = 89;
        b = 90;
    }
    public int getH() {
        return h;
    }
    public void setH(int h) {
        this.h = h;
    }
    public void volume(){
        int v=l*b*h;
        System.out.println("Volume :"+v);
    }
}
public class Tut_52_PracticeSet10 {
    public static void main(String[] args) {
        //Problem 1
        Cylinder1 c=new Cylinder1();
        c.setR(90);
        System.out.println(c.getR());
        //90

        //Problem 2
        Cuboid cu=new Cuboid();
        cu.setL(89);
        cu.setH(78);
        cu.setB(56);
        System.out.println(cu.getH());
        System.out.println(cu.getL());
        System.out.println(cu.getB());
        //78
        //89
        //56

        //Problem 3
        Circle2 ci=new Circle2();
        ci.setR(8);
        ci.area();
        c.Volume();
        //Area : 200.96
        //Volume : 1424304.0000000002

        //Problem 4
        cu.setH(89);
        cu.volume();
        Rectangle2 r=new Rectangle2();
        r.setL(78);
        r.setB(67);
        r.area();
        //Volume :712890
        //Area : 5226.0
    }
}
