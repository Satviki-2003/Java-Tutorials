public class Tut_26_IntroductionToArrays {
    public static void main(String[] args) {
        //classroom of 500 students : You have to store their marks
        //So we have two options :
        //1.making 500 variables
        //2.Making array(Recommended)

        //one way of making array
        //1. Declaration and then memory allocation
        int[] marks= new int[5];
        marks[0]=100;
        marks[1]=70;
        marks[2]=50;
        marks[3]=67;
        marks[4]=45;
        System.out.println(marks[2]);
        //50

        //2.First declaration then initialisation
        int[] mark;
        mark = new int[5];
        mark[0]=100;
        mark[1]=70;
        mark[2]=50;
        mark[3]=67;
        mark[4]=45;
        System.out.println(mark[2]);
        //50


        //Another way of making array
        //3.Declaration and initialisation together
        int [] marks1={33,55,78,90,34};
        System.out.println(marks1[3]);
        //78
    }
}
