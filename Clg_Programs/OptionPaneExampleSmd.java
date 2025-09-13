import javax.swing.*;

public class OptionPaneExampleSmd {
    JFrameDemo f;

    OptionPaneExampleSmd() {
        f = new JFrameDemo();
        // Showing an input dialog with a warning message
        JOptionPane.showInputDialog(f, "Successfully updated", "Alert", JOptionPane.WARNING_MESSAGE);
    }

    public static void main(String[] args) {
        new OptionPaneExampleSmd();
    }
}
