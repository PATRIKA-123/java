package Methods;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
           Scanner in = new Scanner(System.in);
           int ans = sum2(in);
           System.out.println(ans);
           in.close();

        }

    static int sum2(Scanner in) {
        System.out.print("Enter number 1:");
        int num1 = in.nextInt();
        System.out.print("Enter number 2:");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;

    }

    static void sum(Scanner in) {
        System.out.print("Enter number 1:");
        int num1 = in.nextInt();
        System.out.print("Enter number 2:");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum = " + sum);

    }
}
