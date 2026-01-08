package Methods;

public class scoping {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        {
            a = 100;
            System.out.println(a);
            int c = 99;
        }
        System.out.println(a);

        // scoping in forloop
        for (int i = 0; i< 4; i++) {
            System.out.println(i);
        }
       // System.out.println(i);//error: i is out of scope
    }
     static void  random(int marks) {
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
     }
}
