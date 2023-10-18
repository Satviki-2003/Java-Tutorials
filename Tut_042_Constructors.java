class Employee3{
    private int id;
    private String name;
    private int salary;
    public Employee3(int i){
        id=i;
        name="Default";
    }

    //Overloaded constructor
    public Employee3(String s){
        name=s;
        id=99;
    }
    //QUICK QUIZ
    //Overload the employee constructor to get salary 10000
    public Employee3(){
        salary=10000;
    }

    public int getId() {
        return id;
    }
    public String getName(){
        return name;
    }

    public int getSalary() {
        return salary;
    }
}



public class Tut_42_Constructors {
    public static void main(String[] args) {
        Employee3 h=new Employee3(9);
        System.out.println(h.getId());
        System.out.println(h.getName());
        //9
        //Default

        //Constructor overloading
        Employee3 d=new Employee3("Kushal");
        System.out.println(d.getId());
        System.out.println(d.getName());
        //99
        //Kushal

        //QUICK QUIZ
        Employee3 j=new Employee3();
        System.out.println(j.getSalary());
        //10000
    }
}
