interface ParentInterface{
    void meth1();
    void meth2();
}
interface ChildInterface extends ParentInterface{
    void meth3();
    void meth4();
}
class Sample implements ParentInterface,ChildInterface{
    @Override
    public void meth1() {
        System.out.println("meth1");
    }

    @Override
    public void meth2() {
        System.out.println("meth2");
    }

    @Override
    public void meth3() {
        System.out.println("meth3");
    }

    @Override
    public void meth4() {
        System.out.println("meth4");
    }
}
public class Tut_58_InheritanceInInterfaces {
    public static void main(String[] args) {
        Sample s=new Sample();
        s.meth1();
        s.meth2();
        s.meth3();
        s.meth4();
    }
}
//meth1
//meth2
//meth3
//meth4