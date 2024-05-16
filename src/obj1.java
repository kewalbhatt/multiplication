public class obj1 {
    int  age,a1,a2;
        String name;
    void display(int age,String name){
        System.out.println( "age" +age+ ", name:" +name );

    }
     void sum( int a1, int a2){
         System.out.println(a1+a2);
     }
        public static void main(String[] args) {
            obj1 r1 =new obj1();
            r1.display(10,"kewal");
            r1.sum(2,3);
        }
    }

