class MyThr1 extends Thread{
    @Override
    public void run() {
        try {
            for (int i = 0; i < 20; i++) {
                System.out.println(" :) ");
                Thread.sleep(200);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
class MyThr2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(" :( ");
        }
    }
}
public class Tut_75_ThreadMethods {
    public static void main(String[] args) {
        MyThr1 t1=new MyThr1();
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        MyThr2 t2=new MyThr2();
        t2.start();
    }
}
/*
:)
 :)
 :)
 :)
 :)
 :)
 :)
 :)
 :)
 :)
 :)
 :)
 :)
 :)
 :)
 :)
 :)
 :)
 :)
 :)
 :(
 :(
 :(
 :(
 :(
 :(
 :(
 :(
 :(
 :(
 */