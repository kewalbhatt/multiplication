import  java.util.*;
public class MulArry2 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int row1,col1,row2,col2;
        System.out.println("enter the number of first row of matrix1");
         row1= s.nextInt();
        System.out.println("enter the number of column in matrix1");
         col1= s.nextInt();
        System.out.println("Enter the number of row in second matrix");
        row2=s.nextInt();
        System.out.println("enter the number of column in second matrix");
        col2=s.nextInt();

        if(row2!=col1){
            System.out.println("cannot perform operation");
        }
        else {
             int a[][]=new int[row1][col1];
             int b[][]= new int[row2][col2];
             int c[][]= new int [row1][col2];

            System.out.println("enter the first matrix");

            for(int i=0; i<row1;i++){
                for(int j=0;j<col1;j++){
                    a[i][j]=s.nextInt();
                }
            }
            System.out.println("enter the second matrix");
            for(int i=0;i<row2;i++){
                for(int j=0;j<col2;j++){
                    b[i][j]=s.nextInt();
                }
            }

            System.out.println("matrix multiplaction:");

            for(int i=0;i<row1;i++) {
                for (int j = 0; j < col2; j++) {
                    c[i][j] = 0;
                    for (int k = 0; k< col1; k++) {

                        c[i][j] = c[i][j] + a[i][k]*b[k][j];
                    }
                    System.out.print(c[i][j] +" ");
                }
                System.out.println();
            }
        }

    }
}
