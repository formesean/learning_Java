package OOP.Formula_One;

public class Teams {
    String[] team = {
            "Oracle Red Bull Racing",
            "Aston Martin Aramco Cognizant F1 Team",
            "Mercedes-AMG PETRONAS F1 Team",
            "Scuderia Ferrari",
            "BWT Alpine F1 Team",
            "Mclaren F1 Team",
            "MoneyGram Haas F1 Team",
            "Alfa Romeo F1 Team Stake",
            "Scuderia AlphaTauri",
            "Williams Racing"};

    String[] chassis = {
            "RB19",
            "AMR23",
            "W14",
            "SF-23",
            "A523",
            "MCL60",
            "VF-23",
            "C43",
            "AT04",
            "FW45"
    };

    String[] powerUnit = {
            "Honda RBPT",
            "Mercedes",
            "Mercedes",
            "Ferrari",
            "Renault",
            "Mercedes",
            "Ferrari",
            "Honda RBPT",
            "Mercedes"
    };

    void drsEnabler(int drs) {
        if (drs == 1) {
            System.out.println("DRS enabled\n");
        } else if (drs == 0) {
            System.out.println("DRS disabled\n");
        }
    }
}