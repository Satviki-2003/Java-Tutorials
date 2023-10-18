class Phones extends MySmartphone{
    //@override is annotation
    @Override
    public void greet() {
        System.out.println("Hello :)");
    }

    @Deprecated
    public void takePics() {
        System.out.println("Takes pics ...1...2...3..Say cheese :)");
    }
}
@FunctionalInterface
interface f1{
    abstract void add(int a,int b);
}
public class Tut_108_JavaAnnotations {
    public static void main(String[] args) {
        System.out.println("Hello");
        Phones p=new Phones();
        p.takePics();
    }
}
/*
Hello
Takes pics ...1...2...3..Say cheese :)
 */