import java.util.Scanner;

public class ArmstrongNumberGeneral {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start: ");
        int start = sc.nextInt();

        System.out.print("Enter end: ");
        int end = sc.nextInt();

        printArmstrongInRange(start, end);
        sc.close();
    }

    static void printArmstrongInRange(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }

    static boolean isArmstrong(int n) {
        if (n < 0) return false;

        int original = n;
        int sum = 0;
        int digits = countDigits(n);

        while (n > 0) {
            int rem = n % 10;
            sum += power(rem, digits);
            n /= 10;
        }
        return sum == original;
    }

    static int countDigits(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    static int power(int base, int exp) {
        int result = 1;
        for (int i = 0; i < exp; i++) {
            result *= base;
        }
        return result;
    }
}


