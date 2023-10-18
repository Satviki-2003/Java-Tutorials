public class Tut_33_VariableArguments {
    static int add(int... arr) {
        int sum = 0;
        for (int element : arr) {
            sum = sum + element;
        }
        return sum;
    }
    static int sums(int num,int... arr){
        int add=0;
        for(int element : arr){
            add=add+element;
        }
        return add;
    }

    public static void main(String[] args) {
        int c=add(7, 8, 9, 2);
        System.out.println(c);
        //26
        int d=sums(6,8,9,1,23,78);
        System.out.println(d);
        //119
    }
}
