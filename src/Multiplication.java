import java.io.UnsupportedEncodingException;
import java.util.*;

public class Multiplication extends ForLoop {
    private int a = 5;
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
    public static void main(String[] args) {
        new Multiplication().getInterest();
    }
    public void multiplication(int n) {
        for(int i=1;i<=10;i++) {
            int result=n*i;

            System.out.println(n + "*" + i +"=" +result);
        }
    }

    public static String getMyName(String name) {
        return "Hi," + name;
    }

    public static String getMyName(String name, String name1) {
        return "Hi," + name + name1;
    }

    @Override
    public String getInterest() {
        System.out.println("11");
        return "11";
    }
}
