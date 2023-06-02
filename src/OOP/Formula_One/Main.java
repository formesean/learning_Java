package OOP.Formula_One;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Teams myTeam = new Teams();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose a number between 1 to 10: ");
        int num = scanner.nextInt();

        System.out.println("\nYour Formula Team is:");
        System.out.printf("\tTeam: \t\t\t%s\n\tChassis: \t\t%s\n\tPower Unit: \t%s", myTeam.team[num - 1], myTeam.chassis[num - 1], myTeam.powerUnit[num - 1]);
//        myTeam.drsON();
//        myTeam.drsOFF();
    }
}
