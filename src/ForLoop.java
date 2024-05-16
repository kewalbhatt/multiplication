import java.util.Scanner;

public class ForLoop {
    public static void main (String[] args){
       Scanner s= new Scanner(System.in);
        System.out.println("how many times");
        int num= s.nextInt();
        //int n=5;
         for( int i=1; i<=num;i++){
             System.out.println(i);
         }

    }

    public String getInterest() {
        return "10";
    }
}
