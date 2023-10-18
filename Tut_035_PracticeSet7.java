public class Tut_35_PracticeSet7 {
    //1.Write a java method to print multiplication table
    static void table(int n){
        for(int i=1;i<11;i++){
            System.out.println(n+" * "+i+" = "+n*i);
        }
    }

    //2.Write a java program using functions to print incrementing star pattern
    static void pattern(int y){
        for(int i=0;i<y;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    //3.Write a recursive function to print the sum of first n natural numbers
    static int sum(int r){
        if(r==1){
            return 1;
        }
        else {
            int add = 0;
            return r+sum(r-1);
        }
    }

    //4.Write a function to print decrementing star pattern
    static void star(int t){
        for(int i=0;i<t;i++){
            for(int j=t;j!=i;j--){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    //5.Write a function to print nth term of fibonaccie series using recursion
    static int fib(int n){
        if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        }
        else{
            return fib(n-1)+fib(n-2);
        }
    }

    //6. Write a function to find average of a set of numbers passed as argument
    static int avg(int q,int... arr){
        int add=q;
        for(int element:arr){
            add=add+element;
        }
        return add;
    }

    //7.write a function to convert celsius temperature into fahrenheit
    static double far(double j){
        double div=(double)9/5;
        double t=j*div;
        double finals = t+32;
        return finals;
    }


    public static void main(String[] args) {
        //1
        table(12);
        //12 * 1 = 12
        //12 * 2 = 24
        //12 * 3 = 36
        //12 * 4 = 48
        //12 * 5 = 60
        //12 * 6 = 72
        //12 * 7 = 84
        //12 * 8 = 96
        //12 * 9 = 108
        //12 * 10 = 120

        //2
        pattern(6);
        //*
        //**
        //***
        //****
        //*****
        //******

        //3
        int d=sum(7);
        System.out.println(d);
        //28

        //4
        star(7);
        //*******
        //******
        //*****
        //****
        //***
        //**
        //*

        //5
        int b=fib(7);
        System.out.println(b);

        //6
        int e=avg(8,4,6,7,7);
        System.out.println(e);
        //32

        //7
        double y=far(78);
        System.out.println(y);
        //172.4
    }
}
