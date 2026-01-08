public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // swap number code
        // int temp = a;
        // a = b;
        // b = temp;

        swap(a, b);

        System.out.println(a + " " + b);

        String name = "Developer";
        changeName(name);
        System.out.println(name);

    }

    static void changeName(String name) {
        name = "Software Engineer";
    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
      // IN JAVA  there  no pass by  ref

      // Primitive data type - pass by value
      // Object and value/Complex data - pass by value of that ref varaiable


      