import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun();
       multiple(2, 3, 4, 5, 78, 90, 100);  
    }
    static void multiple(int a, int b, int ...v) {
        
    }

    static void fun(int...v) {
      System.out.println(Arrays.toString(v));
    }
}
