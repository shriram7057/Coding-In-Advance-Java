import javax.swing.*;

public class OptionPaneExampleSmd {
    JFrame f;

    OptionPaneExampleSmd() {
        f = new JFrame();
        // Showing an input dialog with a warning message
        JOptionPane.showInputDialog(f, "Successfully updated", "Alert", JOptionPane.WARNING_MESSAGE);
    }

    public static void main(String[] args) {
        new OptionPaneExampleSmd();
    }
}
