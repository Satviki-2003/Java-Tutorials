class MyThreads1 extends Thread{
    //Constructor of class
    MyThreads1(String s){
        super(s);
    }
    @Override
    public void run() {
        System.out.println(":)");
    }
}

class MyThreads2 implements Runnable{
    @Override
    public void run() {
        System.out.println(":(");
    }
}
public class Tut_73_ThreadConstructors {
    public static void main(String[] args) {
        MyThreads1 t1=new MyThreads1("S1");
        t1.start();
        System.out.println("Name of t1 : "+t1.getName());
        System.out.println("ID of t1 : "+t1.getId());

        System.out.println("\n");
        MyThreads1 t2=new MyThreads1("S2");
        t2.start();
        System.out.println("Name of t2 : "+t2.getName());
        System.out.println("ID of t2 : "+t2.getId());

        System.out.println("\n");
        MyThreads2 b1=new MyThreads2();
        Thread t3=new Thread(b1,"S3");
        t3.start();
        System.out.println("Name of t3 :"+t3.getId());
        System.out.println("ID of t3 : "+t3.getName());
    }
}
/*
:)
Name of t1 : S1
ID of t1 : 16


Name of t2 : S2
ID of t2 : 17


:)
:(
Name of t3 :18
ID of t3 : S3

 */