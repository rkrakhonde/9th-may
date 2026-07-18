package Array;

public class Ex9_2DimensiopnalArray_DeclartionInitialization_InSingleStep {
    public static void main(String[] s1) {
        int[][] ar = {{10, 20, 30, }, {40, 50, 60,}};
        System.out.println(ar.length);
        System.out.println(ar[0][2]);

        System.out.println("-----print all data from 2dimensional array----");
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.println(ar[i][j] + "  ");
            }
            System.out.println();

        }
    }
}







