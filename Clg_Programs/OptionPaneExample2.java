import javax.swing.*;

class OptionPaneExample2 {
    JFrameDemo f;

    OptionPaneExample2() {
        f = new JFrameDemo();  // Corrected the class name to JFrame
        JOptionPane.showInputDialog(f, "Hello Shriram, welcome");  // Display an input dialog with a welcome message
    }

    public static void main(String[] args) {
        new OptionPaneExample2();  // Create an instance of OptionPaneExample2
    }
}
