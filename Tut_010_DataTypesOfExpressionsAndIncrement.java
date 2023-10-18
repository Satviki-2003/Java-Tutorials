public class Tut_10_DataTypesOfExpressionsAndIncrement {
    public static void main(String[] args) {
        // Data types of expressions
        byte x = 5;
        int y = 6;
        short z = 8;
        int a = y+z;
        float b = 6.54f+x;
        System.out.println(b);

        // Increment and decrement
        int i = 56;
        System.out.println(i++);//i will be printed then incremented
        System.out.println(i);// incremented i will be printed
        int j = 89;
        System.out.println(++j);// j will be incremented then printed

        //11.54
        //56
        //57
        //90

        // Quick quiz
        int y1 = i++;
        int z1 = ++i;
        System.out.println("Later : "+y1);
        System.out.println(z1);
        //Later : 57
        //59

        // Quick Quiz
        // Find value of x1
        int y2 =7 ;
        int x1 =++y2*8;
        System.out.println("QUICK QUIZ : "+x1);
        //QUICK QUIZ : 64

        // Using  increment for character
        // Next character gets printed
        char ch = 'B';
        System.out.println(++ch);
        // C





    }
}
