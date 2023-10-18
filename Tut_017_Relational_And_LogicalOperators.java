public class Tut_17_Relational_And_LogicalOperators {
    public static void main(String[] args) {
        System.out.println("LOGICAL AND");
        boolean a = true;
        boolean b = false;
        boolean c = true;
        if (a&&b&&c){
            System.out.println("Y");
        }
        else {
            System.out.println("N");
        }
        System.out.println("LOGICAL OR");
        boolean a1 = true;
        boolean b1 = false;
        boolean c1 = true;
        if (a||b||c){
            System.out.println("Y");
        }
        else {
            System.out.println("N");
        }
        System.out.println("Logical NOT");
        System.out.println("NOT a : "+!a);
        System.out.println("NOT b : "+!b);
        System.out.println("NOT c : "+!c);
        //LOGICAL AND
        //N
        //LOGICAL OR
        //Y
        //Logical NOT
        //NOT a : false
        //NOT b : true
        //NOT c : false
    }

}
