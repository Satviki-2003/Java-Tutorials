public class Tut_29_PracticeSet6 {
    public static void main(String[] args) {
        //1. Create an array of 5 floats and calculate their sum
        float[] q = {0.66f, 0.77f, 0.44f, 0.99f, 0.78f};
        System.out.println("SUM OF ARRAY ELEMENTS :");
        float add = 0;
        for (int i = 0; i < q.length; i++) {
            add += (q[i]);
        }
        System.out.println(add);
        //SUM OF ARRAY ELEMENTS :
        //3.64

        //2. Write a program to find whether the given element in present in the array or not
        int[] w = {90, 78, 66, 54, 32, 22};
        int find = 78;
        for (int j = 0; j <= w.length - 1; j++) {
            if (find == w[j]) {
                System.out.println("78 is found at index : " + j);
            }
        }
        //78 is found at index : 1


        //3.Calculate average marks from an array containing marks of all students in physics using for each loop
        int[] marks = {67, 78, 89, 90, 79, 45, 46};
        int edd = 0;
        for (int element : marks) {
            edd = edd + element;
        }
        float avg = (float) edd / (marks.length);
        System.out.println("AVERAGE : " + avg);
        //AVERAGE : 70.57143

        //4.Create a java program to add the two matrices of size 2*3
        int[][] mat1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] mat2 = {{7, 8, 9}, {10, 11, 12}};
        int[][] result = {{0, 0, 0}, {0, 0, 0}};
        for (int a = 0; a < mat1.length; a++) {
            for (int s = 0; s < mat1[a].length; s++) {
                result[a][s] = mat1[a][s] + mat2[a][s];
            }
        }
        System.out.println("ADDITION OF TWO MATRICES :");
        for (int a = 0; a < result.length; a++) {
            for (int s = 0; s < result[a].length; s++) {
                System.out.print(result[a][s]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
        // 5.Write a java program to reverse an array
        int[] d = {4, 5, 6, 7};
        int l1 = d.length - 1;
        int[] h = {0, 0, 0, 0, 0, 0, 0, 0};
        for (int f = 0; f < d.length; f++) {
            h[f] = d[l1];
            l1 = l1 - 1;
        }
        System.out.println("INVERTED MATRIX :");
        for (int j = 0; j < d.length; j++) {
            System.out.print(h[j]);
            System.out.print(" ");
        }

        //6.Write a java program to find max. element in an array
        int[] k = {1, 78, 90, 34, 56};
        int max = 0;
        for (int e:k) {
            if (e > max) {
                max = e;
            }
        }
        System.out.println("\nMAXIMUM ELEMENT : "+max);
    }
}










