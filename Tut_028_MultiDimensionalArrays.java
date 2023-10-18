public class Tut_28_MultiDimensionalArrays {
    public static void main(String[] args) {
        // Making 2 D array
        int[][] flats;
        flats = new int[2][3];
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;
        System.out.println(flats[0][2]);
        //103

        System.out.println("PRINTING 2-D ARRAY :");
        for (int i = 0; i < (flats.length); i++) {
            for (int j = 0; j < (flats[i].length); j++) {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("\n");
        }
        //PRINTING 2-D ARRAY :
        //101 102 103
        //
        //201 202 203
    }
}
