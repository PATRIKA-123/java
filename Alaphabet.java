import java.util.Scanner;

public class Alaphabet {
    public static void main(FruitCheck[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(3);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is a lowercase letter");
        } else {
            System.out.println(ch);
        }

        in.close();
    }
}
