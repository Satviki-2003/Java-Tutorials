/**
 * This class is very useful
 * @author Satviki Chaudhari
 * @since 2020
 * @version 2.0
 */
public class Tut_107_Javadoc_TagsForMethods {
    /**
     * This method is very useful to add two numbers
     * @param a This is 1st number
     * @param b This is 2nd number
     * @return It returns the sum of two numbers
     * @throws Exception
     */
    public static int add(int a,int b) throws Exception{
        if(a==0|| b==0){
            throw new Exception();
        }
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println("Hello");
    }
}
