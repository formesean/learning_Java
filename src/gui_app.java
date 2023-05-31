import javax.swing.JOptionPane;

public class gui_app {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));

        JOptionPane.showMessageDialog(null, "Greetings " + name + "!");
        JOptionPane.showMessageDialog(null, "Your age is " + age);
    }
}
