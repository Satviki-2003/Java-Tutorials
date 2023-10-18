class Cylinder{
    private int radius;
    private int height;

    //Problem 3: Use a constructor and repeat 1
    public Cylinder(){
        radius = 67;
        height =90;
    }
    //Problem 1: Create a class Cylinder and use getters and setters to set
// its radius and height
    public void setRadius(int r) {
        radius = r;
    }
    public void setHeight(int h){
        height=h;
    }
    public int getRadius(){
        return radius;
    }
    public int getHeight(){
        return height;
    }

    //Problem 2: Use 1 to calculate surface area and volume of cylinder
    public double surfaceArea(){
        double s=(2*3.14*radius*height)+(2*3.14*radius*radius);
        return s;
    }
    public double volume(){
        double v=3.14*radius*radius*height;
        return v;
    }
}

//Problem 4 : Overload a constructor used to initialise a rectangle
//of length 4 and breadth 5 for using custom parameters
class Rectangle1{
    private int length;
    private int breadth;
    public  Rectangle1(){
        length=0;
        breadth=0;
    }
    public Rectangle1(int i){
        length=4;
        breadth=5;
    }
    public int getLength(){
        return length;
    }
    public int getBreadth(){
        return breadth;
    }
}

//Problem 5: Repeat 1 for sphere
class Sphere{
    private int radius;
    public void setRadius(int r){
        radius=r;
    }
    public int getRadius(){
        return radius;
    }
}
public class Tut_44_PracticeSet9 {
    public static void main(String[] args) {
        // Problem 1
        Cylinder c= new Cylinder();
        c.setHeight(9);
        c.setRadius(8);
        System.out.println("HEIGHT : "+c.getHeight());
        System.out.println("RADIUS : "+c.getRadius());
        //HEIGHT : 9
        //RADIUS : 8

        //Problem 2
        System.out.println("SURFACE AREA : "+c.surfaceArea());
        System.out.println("VOLUME : "+c.volume());
        //SURFACE AREA : 854.08
        //VOLUME : 1808.64

        //Problem 3
        //Using constructor
        System.out.println("HEIGHT : "+c.getHeight());
        System.out.println("RADIUS : "+c.getRadius());
        //HEIGHT : 90
        //RADIUS : 67

        //Problem 4
        Rectangle1 r=new Rectangle1();
        System.out.println("LENGTH : "+r.getLength());
        System.out.println("BREADTH : "+r.getBreadth());
        Rectangle1 r2=new Rectangle1(8);
        System.out.println("LENGTH : "+r2.getLength());
        System.out.println("BREADTH : "+r2.getBreadth());
        //LENGTH : 0
        //BREADTH : 0
        //Overloaded constructor
        //LENGTH : 4
        //BREADTH : 5

        //Problem 5
        Sphere s=new Sphere();
        s.setRadius(9);
        System.out.println("Radius of sphere : "+s.getRadius());
        //Radius of sphere : 9
    }
}
