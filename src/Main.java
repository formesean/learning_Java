import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Country: ");
        String country = scanner.nextLine();

        System.out.println("\nFull Name: " + firstName + " " + lastName);
        System.out.println("Age: " + age);
        System.out.println(country);

        scanner.close();
    }
}