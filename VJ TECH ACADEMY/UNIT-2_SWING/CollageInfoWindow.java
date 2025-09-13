//SImple Program to display the collage information
import java.awt.*;
import javax.swing.*;
class CollageInfoWindow extends JFrameDemo {
    public static void main(String[] args) throws Exception{
        // Creating a JFrame window
        JFrameDemo frame = new JFrameDemo("College Information");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create a panel to hold the components
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Create labels to hold the College Information
        JLabel collageNameLabel = new JLabel("College Name: D.BATU College of Engineering!");
        collageNameLabel.setBounds(50,200,100,20);
        frame.add(collageNameLabel);
        JLabel collageLocationLabel = new JLabel("Location: At Lonere, Raigad, Ta. Mangoan, D. Raigad");
        JLabel collageTypeLabel = new JLabel("Type: Government Autonomous");
        JLabel collageEstablishedLabel = new JLabel("Established: in 1990");

        // Add the labels to the panel
        panel.add(collageNameLabel);
        panel.add(collageLocationLabel);
        panel.add(collageTypeLabel);
        panel.add(collageEstablishedLabel);

        // Add the panel to the frame
        frame.add(panel);
        frame.setVisible(true);
    }
}
