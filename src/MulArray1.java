import java.util.*;

public class Multi_arrray {
 public static void Main (String[] args){
    // result=0;
     int m1[][]= {{1,2,3},{2,3,4},{3,2,3}};
     int m2[][]=  {{1,2},{2,2},{3,2}};
     int result[][]= new int[2][2];

     for(int i=0;i<2;i++){
         for(int j=0;i<2;j++){
             for(int k=0;k<3;k++){
                 result[i][j]= result[i][j] +m1[i][k]*m2[k][j];


             }
         }
     }
     //display the matrix
     for(int i=0;i<2;i++){
         for(int j=0;j<2;j++){
             System.out.print(result[i][j] +" ");
         }
         System.out.println();
     }
 }

}
