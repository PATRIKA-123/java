public class shadow {

    static int x = 90; // static field

    public static void main(String[] args) {
        System.out.println(x); // 90 (static field)
        int x = 10;// class variable is shadowed by this
        System.out.println(x); // 10 (local variable shadows static x)
        fun();

    }

    static void fun() {
        System.out.println(x); // 90 (static field)
    }
}
// SHADOWING: using the same variable name in an inner scope hides the outer one