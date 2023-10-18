class Employee2{
    private String name;
    private int ID;
    private int salary;

    public void setName(String s){
        name=s;
    }
    public void setID(int i){
        ID =i;
    }
    public void setSalary(int u){
        salary=u;
    }
    public String getName(){
        return name;
    }
    public int getID(){
        return ID;
    }
    public int getSalary(){
        return salary;
    }
}


// QUICK QUIZ
//Create a class for setting a circle radius and area and perimeter
class Circle1{
    private int radius;
    private int perim;
    private int area;
    public void setRadius(int r){
        radius=r;
    }
    public int getRadius(){
        return radius;
    }
    public void setArea(double area){
        double areas= 3.14*radius*radius;
        if(areas == area){
            area=areas;
            System.out.println("AREA : "+area);
        }
        else {
            System.out.println("Enter valid area");
        }
    }
    public void setPerimeter(double perim){
        double peri= 3.14*2*radius;
        if(peri == perim){
            perim=peri;
            System.out.println("PERIMETER : "+perim);
        }
        else {
            System.out.println("Enter valid perimeter");
        }
    }
}


public class Tut_40_GettersAndSetters {
    public static void main(String[] args) {
        Employee2 satviki = new Employee2();
        satviki.setName("Satviki C");
        satviki.setID(89);
        satviki.setSalary(90000);
        System.out.println(satviki.getName());
        System.out.println(satviki.getID());
        System.out.println(satviki.getSalary());
        //Satviki C
        //89
        //90000

        //Quick quiz
        Circle1 c=new Circle1();
        c.setRadius(8);
        System.out.println(c.getRadius());
        c.setPerimeter(89);
        c.setArea(90);
        //8
        //Enter valid perimeter
        //Enter valid area
        c.setPerimeter(50.24);
        c.setArea(200.96);
        //PERIMETER : 50.24
        //AREA : 200.96
    }
}

