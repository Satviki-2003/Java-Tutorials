public class Tut_27_ForEachLoop {
    public static void main(String[] args) {
        int [] marks1={33,55,78,90,34};
        System.out.println(marks1.length);
        //5

        float [] marks2={0.99f,0.77f,0.88f};
        System.out.println(marks2.length);
        //3

        // simple way
        System.out.println("DISPLAYING ARRAY :");
        System.out.println(marks1[0]);
        System.out.println(marks1[1]);
        System.out.println(marks1[2]);
        System.out.println(marks1[3]);
        System.out.println(marks1[4]);
        //DISPLAYING ARRAY :
        //33
        //55
        //78
        //90
        //34

        //for loop for printing array
        int n = marks1.length;
        System.out.println("For loop :");
        for(int i=0;i<n-1;i++){
            System.out.println(marks1[i]);
        }
        //For loop :
        //33
        //55
        //78
        //90

        //Quick quiz : print all elements of array in reverse order
        System.out.println("REVERSE ORDER :");
        int j = marks1.length;
        for(int i = j-1;i>=0;i--){
            System.out.println(marks1[i]);
        }
        //REVERSE ORDER :
        //34
        //90
        //78
        //55
        //33

        // For each loop to display array
        System.out.println("FOR EACH LOOP:");
        for(int element : marks1){
            System.out.println(element);
        }
        //FOR EACH LOOP:
        //33
        //55
        //78
        //90
        //34
    }
}
