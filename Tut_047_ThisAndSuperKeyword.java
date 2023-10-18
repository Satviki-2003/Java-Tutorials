class Parent1{
    int a;
    Parent1() {
        System.out.println("I am constructor of Parent1");
    }
    Parent1(int a){
        this.a=a;
    }

    public int getA() {
        return a;
    }
}
class Child1 extends Parent1{
    Child1(int a,int u){
        super(a);
        System.out.println(u);
    }
}
public class Tut_47_ThisAndSuperKeyword {
    public static void main(String[] args) {
        Parent1 p=new Parent1();
        Parent1 p1=new Parent1(56);
        System.out.println(p1.getA());
        Child1 c=new Child1(34,78);
        System.out.println(c.getA());
        //I am constructor of Parent1
        //56
        //78
        //34
    }
}
