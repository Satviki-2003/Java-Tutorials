import java.util.ArrayList;

//Generic class
//<> : Symbol of generics
class Generics1 <T1,T2>{
    private T1 t1;
    private T2 t2;

    public Generics1(T1 t1,T2 t2) {
        this.t1 = t1;
        this.t2=t2;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }
}

public class Tut_110_JavaGenerics {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        a.add(34);
        System.out.println(a);
        Generics1<Integer,Integer> g1=new Generics1(23,45);
        System.out.println(g1.getT1());
        System.out.println(g1.getT2());
    }
}
/*
[34]
23
45
 */