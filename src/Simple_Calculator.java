import java.util.Scanner;

public class Simple_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter operation to use (+, -, *, /): ");
        String op = scanner.next();

        switch (op) {
            case "+":
                int sum = add(num1, num2);
                System.out.println("\n" + num1 + " + " + num2 + " = " + sum);
            case "-":
                int difference = subtract(num1, num2);
                System.out.println("\n" + num1 + " - " + num2 + " = " + difference);
            case "*":
                int product = multiply(num1, num2);
                System.out.println("\n" + num1 + " * " + num2 + " = " + product);
            case "/":
                double quotient = divide(num1, num2);
                System.out.println("\n" + num1 + " / " + num2 + " = " + quotient);
            default:
                System.out.println("Please run the program again and input a valid operation :)");
        }
    }

    static int add(int x, int y) {
        return x + y;
    }

    static int subtract(int x, int y) {
        return x - y;
    }

    static int multiply(int x, int y) {
        return x * y;
    }

    static double divide(double x, double y) {
        return x / y;
    }
}
