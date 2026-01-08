import java.util.Scanner;

public class calculator {
    public static void main(FruitCheck[] args) {
       Scanner in = new Scanner(System.in);
       double num1, num2, ans = 0;
       
       System.out.print("Enter first number: ");
       num1 = in.nextDouble();
       System.out.print("Enter operator (+, -, *, /, %): ");
       char op = in.next().trim().charAt(0);
       System.out.print("Enter second number: ");
       num2 = in.nextDouble();
       
       if (op == '+') {
           ans = num1 + num2;
       } else if (op == '-') {
           ans = num1 - num2;
       } else if (op == '*' || op == 'x' || op == 'X') {
           ans = num1 * num2;
       } else if (op == '/') {
           if (num2 != 0) {
               ans = num1 / num2;
           } else {
               System.out.println("Cannot divide by zero!!");
           }
       } else if (op == '%') {
           ans = num1 % num2;
       } else {
           System.out.println("Invalid Operation!!");
       }
       
       System.out.println(ans);
       in.close();
    }
}
