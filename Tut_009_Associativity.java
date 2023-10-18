public class Tut_09_Associativity {
    public static void main(String[] args) {
        // Quick quiz

        //1
        int x = 6;
        int y = 1;
        int exp1 = (x-y)/2;
        System.out.println("Exp1 : "+exp1);

        //2
        int a = 5;
        int b = 4;
        int c = 1;
        int d = 69;
        int exp2 = ((b*b)-(4*a*c))/(2*a);
        System.out.println("Exp2 : "+exp2);

        // 3
        int v = 90;
        int u = 89;
        int exp3 = (v*v)-(u*u);
        System.out.println("Exp3 : "+exp3);

        //4
        int exp4 = (a*b)-d;
        System.out.println("Exp4 : "+exp4);

        //Exp1 : 2
        //Exp2 : 0
        //Exp3 : 179
        //Exp4 : -49
    }
}
