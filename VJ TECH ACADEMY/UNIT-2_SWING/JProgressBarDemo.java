import java.awt.*;
import javax.swing.*;

class JProgressBarDemo extends JFrameDemo {
    JProgressBar jpb;

    JProgressBarDemo() {
        java.awt.Container c = getContentPane();
        FlowLayout f1 = new FlowLayout();
        c.setLayout(f1);
        c.setBackground(Color.CYAN);

        jpb = new JProgressBar(0, 3000);
        jpb.setStringPainted(true);  // Show percentage or value on the progress bar
        jpb.setToolTipText("This is Progress Bar");
        jpb.setValue(0);
        c.add(jpb);
    }

    void ChangeProgressBarValue() throws Exception {
        int i = 0;
        while (i <= 3000) {
            jpb.setValue(i);  // Update the progress bar's value
            i += 100;
            Thread.sleep(200);  // Pause for 200 milliseconds before updating again
        }
    }

    public static void main(String args[]) {
        JProgressBarDemo j = new JProgressBarDemo();
        j.setVisible(true);
        j.setTitle("JProgressBar Frame");
        j.setSize(500, 500);
        j.setDefaultCloseOperation(JFrameDemo.EXIT_ON_CLOSE);

        try {
            j.ChangeProgressBarValue();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
