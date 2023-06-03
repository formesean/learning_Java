package OOP.Formula_One;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Teams myTeam = new Teams();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of drivers: ");
        int numDriver = scanner.nextInt();
        scanner.nextLine();

        Drivers[] driversArray = new Drivers[numDriver];

        for (int i = 0; i < numDriver; i++) {
            System.out.printf("\nDriver %d name: ", i + 1);
            String name = scanner.nextLine();
            System.out.printf("Driver %d team: ", i + 1);
            String team = scanner.nextLine();
            System.out.printf("Driver %d age: ", i + 1);
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.printf("Driver %d nationality: ", i + 1);
            String nationality = scanner.nextLine();
            System.out.printf("Driver %d priority (1 or 2): ", i + 1);
            int driverPos = scanner.nextInt();
            scanner.nextLine();

            driversArray[i] = new Drivers(name, team, age, nationality, driverPos);
        }

        System.out.println();
        for (int j = 0; j < numDriver; j++) {
            System.out.println("Driver " + (j + 1) + ": " +
                    driversArray[j].name + ", " +
                    driversArray[j].team + ", " +
                    driversArray[j].age + ", " +
                    driversArray[j].nationality);

            Drivers drivers = driversArray[j];
            if (drivers.driverPos == 1) {
                drivers.firstDriver(drivers.team);
            } else {
                drivers.secondDriver(drivers.team);
            }
        }

//        System.out.print("Choose a number between 1 and 10: ");
//        int num = scanner.nextInt();

//        System.out.println("\nYour Formula Team is:");
//        System.out.printf("\tTeam: \t\t\t%s\n\tChassis: \t\t%s\n\tPower Unit: \t%s", myTeam.team[num - 1], myTeam.chassis[num - 1], myTeam.powerUnit[num - 1]);
//        myTeam.drsON();
//        myTeam.drsOFF();
    }
}
