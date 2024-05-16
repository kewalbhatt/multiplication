import java.util.*;
public class Multiplcation2 {
    public static  void main(String[] args){
  /*      Scanner sc = new Scanner(System.in);
       System.out.println("Enter the  first number");
         int  m=sc.nextInt();
        System.out.println("Enter the  second number ");
        int  n=sc.nextInt();
         for(int i=1;i<=m;i++){ // 1 to 2
             for(int j=1;j<=n;j++){ // 1 to 10
//                 System.out.println(String.format("%s * %s = %s", i, j, i*j + "\t"));
                 System.out.print( i*j + "\t");
             }
             System.out.print("\n");
         }*/
        int a = new Multiplication().getA();
        System.out.println("value of a: " + a);
        String name = Multiplication.getMyName("Kewal");
//        String name1 = new Multiplication().getMyName("Mandip");
        System.out.println(name.concat(", hello world"));
//        System.out.println(name1.concat(", hello"));
    }
}
