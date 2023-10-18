class MyRunnable1 implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<400;i++){
            System.out.println(":) HELLO !!!");
        }
    }
}
class MyRunnable2 implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<404;i++){
            System.out.println(":(  I am sad !!!");
        }
    }
}
public class Tut_71_UsingRunnableInterface {
    public static void main(String[] args) {
        MyRunnable1 bullet1=new MyRunnable1();
        Thread gun1=new Thread(bullet1);
        gun1.start();

        MyRunnable2 bullet2=new MyRunnable2();
        Thread gun2=new Thread(bullet2);
        gun2.start();
    }
}
/*
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:(  I am sad !!!
:(  I am sad !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:(  I am sad !!!
:(  I am sad !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:) HELLO !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!
:(  I am sad !!!

 */
