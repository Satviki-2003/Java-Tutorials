public class Tut_31_JavaMethods {
    // Method creation without object
    static int logic(int a,int b){
        int c=0;
        if(a>b){
            c =a+b*6;
        }
        else {
            c=a-b*8;
        }
        return c;
    }

    // creating method which need object
    int Tut_31_javaMethods(int c,int d){
        int sum = c+d;
        return sum;
    }

    public static void main(String[] args) {
        // Calling static method
        int d=logic(9,6);
        System.out.println(d);
        //45

        // Creating object for non-static method
        Tut_31_JavaMethods l= new Tut_31_JavaMethods();
        int e= l.Tut_31_javaMethods(90,89);
        System.out.println(e);
        //179
    }
}





