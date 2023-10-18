class Employee{
    //Defining attributes of class
    int id;
    String name;
    int salary;

    //Defining methods of class
    public void getDetails(){
        System.out.println("My name is "+name+" and my ID is "+id);
    }
    public void getSalary(){
        System.out.println("My salary is "+salary);
    }
}
//Program execution start from main class
public class Tut_38_CustomClass {
    public static void main(String[] args) {
        // Creating objects of class Employee
        Employee satviki = new Employee();
        Employee kushal = new Employee();
        satviki.id=89;
        satviki.name="Satviki C";
        satviki.salary=500000;
        kushal.salary=400000;
        kushal.name="Kushal";
        kushal.id=67;
        satviki.getDetails();
        satviki.getSalary();
        kushal.getDetails();
        kushal.getSalary();
    }
}
//My name is Satviki C and my ID is 89
//My salary is 500000
//My name is Kushal and my ID is 67
//My salary is 400000
