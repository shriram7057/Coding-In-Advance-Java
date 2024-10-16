import javax.swing.*;

class OptionPaneExample2 {
    JFrame f;

    OptionPaneExample2() {
        f = new JFrame();  // Corrected the class name to JFrame
        JOptionPane.showInputDialog(f, "Hello Shriram, welcome");  // Display an input dialog with a welcome message
    }

    public static void main(String[] args) {
        new OptionPaneExample2();  // Create an instance of OptionPaneExample2
    }
}
