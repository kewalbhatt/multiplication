import java.util.*;
public class MulArray1 {
    public static void main(String[] args) {
        int m1[][] = {{1, 2, 3}, {2, 3, 4}, {3, 2, 3}};
        int m2[][] = {{1, 2}, {2, 2}, {3, 2}};
        int result[][] = new int[3][2];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                //result[i][j]=0;
                for (int k = 0; k < 3; k++) {
                    result[i][j] = result[i][j] + m1[i][k] * m2[k][j];


                }
            }
        }
        //display the matrix
        for (int i = 0;i < 3; i++) {
            for (int j = 0;j < 2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

}
