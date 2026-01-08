
import java.util.Scanner;

public class FruitCheck { 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a fruit: ");
        // Now 'String' correctly refers to the built-in Java String
        String fruit = in.next(); 

        if (fruit.equals("mango")) {
            System.out.println("It's a mango");
        } else {
            System.out.println("Not a mango");
        }

        in.close();
    }
}
