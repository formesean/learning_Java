package OOP.Formula_One;

public class Drivers {
    String name;
    String team;
    int age;
    String nationality;
    int driverPos;

    Drivers(String name, String team, int age, String nationality, int driverPos) {
        this.name = name;
        this.team = team;
        this.age = age;
        this.nationality = nationality;
        this.driverPos = driverPos;
    }

    public String toString(int j) {
        return "Driver " + (j + 1) + ": " + name + ", " + team + ", " + age + ", " + nationality;
    }

    void firstDriver(String team) {
        System.out.println("Driver 1 for " + team);
    }

    void secondDriver(String team) {
        System.out.println("Driver 2 for " + team);
    }
}
