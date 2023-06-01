import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Array_list {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Enter number of teams"));

        ArrayList<String> formulaOne = new ArrayList<>();

        int i = 0;
        do {
            String teamName = JOptionPane.showInputDialog("Enter team name " + (i + 1) + ":");
            formulaOne.add(teamName);
            i++;
        } while (i < num);

        JOptionPane.showMessageDialog(null, "Click Okay to show all the teams");

        StringBuilder allTeams = new StringBuilder();
        for (int j = 0; j < num; j++) {
            allTeams.append(formulaOne.get(j)).append("\n");
        }

        JOptionPane.showMessageDialog(null, allTeams.toString());
    }
}
