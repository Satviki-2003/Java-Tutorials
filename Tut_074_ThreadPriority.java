class threads extends Thread{
    public threads(String n){
        super(n);
    }
    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            System.out.println(":)  " + this.getName());
        }
    }
}
public class Tut_74_ThreadPriority {
    public static void main(String[] args) {
        threads t1=new threads("S1");
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();

        threads t2=new threads("S2");
        t2.setPriority(Thread.NORM_PRIORITY);
        t2.start();

        threads t3=new threads("S3");
        t3.setPriority(Thread.MIN_PRIORITY);
        t3.start();

        threads t4=new threads("S4");
        t4.setPriority(Thread.MIN_PRIORITY);
        t4.start();

        threads t5=new threads("S5");
        t5.setPriority(Thread.MIN_PRIORITY);
        t5.start();

    }
}
/*
:)  S3
:)  S5
:)  S4
:)  S1
:)  S1
:)  S2
:)  S1
:)  S1
:)  S1
:)  S1
:)  S1
:)  S1
:)  S1
:)  S1
:)  S1
:)  S1
:)  S1
:)  S1
:)  S1
:)  S1
:)  S1
:)  S4
:)  S5
:)  S5
:)  S5
:)  S5
:)  S5
:)  S5
:)  S5
:)  S5
:)  S5
:)  S5
:)  S5
:)  S5
:)  S5
:)  S5
:)  S5
:)  S5
:)  S5
:)  S5
:)  S5
:)  S5
:)  S5
:)  S5
:)  S5
:)  S5
:)  S5
:)  S5
:)  S5
:)  S5
:)  S5
:)  S3
:)  S3
:)  S3
:)  S3
:)  S4
:)  S1
:)  S4
:)  S2
:)  S4
:)  S1
:)  S1
:)  S1
:)  S1
:)  S1
:)  S1
:)  S1
:)  S1
:)  S1
:)  S1
:)  S3
:)  S1
:)  S4
:)  S2
:)  S1
:)  S4
:)  S3
:)  S4
:)  S2
:)  S2
:)  S2
:)  S2
:)  S2
:)  S2
:)  S2
:)  S2
:)  S2
:)  S2
:)  S2
:)  S2
:)  S2
:)  S2
:)  S2
:)  S2
:)  S2
:)  S2
:)  S2
:)  S2
:)  S2
:)  S2
:)  S2
:)  S2
:)  S2
:)  S2
:)  S2
:)  S3
:)  S4
:)  S4
:)  S4
:)  S4
:)  S3
:)  S3
:)  S4
:)  S4
:)  S3
:)  S3
:)  S4
:)  S4
:)  S4
:)  S4
:)  S4
:)  S4
:)  S4
:)  S4
:)  S4
:)  S4
:)  S4
:)  S4
:)  S4
:)  S3
:)  S4
:)  S4
:)  S4
:)  S3
:)  S3
:)  S3
:)  S3
:)  S3
:)  S3
:)  S3
:)  S3
:)  S3
:)  S3
:)  S3
:)  S3
:)  S3
:)  S3
:)  S3
:)  S3
:)  S3

 */