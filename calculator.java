import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Input a sign: +, -, /, *");
        String sign = userInput.next();
        System.out.println("Input your first number:");
        int num1 =userInput.nextInt();
        System.out.println("Input your second number:");
        int num2 =userInput.nextInt();

        if (sign.equals("+")) {
            int ans = num1 + num2;
            System.out.println("Answer: " + ans);
        }
        if (sign.equals("-")) {
            int ans = num1 - num2;
            System.out.println("Answer: " + ans);
        }
        if (sign.equals("/")) {
            int ans = num1 / num2;
            System.out.println("Answer: " + ans);
        }
        if (sign.equals("*")) {
            int ans = num1 * num2;
            System.out.println("Answer: " + ans);
        }
    }
}
