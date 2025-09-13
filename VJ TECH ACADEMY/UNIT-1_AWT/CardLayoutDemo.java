import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CardLayoutDemo extends JFrameDemo implements ActionListener {
    private CardLayout cardLayout;
    private JPanel cardPanel;
    private JButton b1, b2, b3, b4;

    CardLayoutDemo() {
        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);

        b1 = new JButton("C Lang");
        b2 = new JButton("C++ Lang");
        b3 = new JButton("Java Lang");
        b4 = new JButton("Python Lang");

        cardPanel.add(new JLabel("C Language Content"), "a");
        cardPanel.add(new JLabel("C++ Language Content"), "b");
        cardPanel.add(new JLabel("Java Language Content"), "c");
        cardPanel.add(new JLabel("Python Language Content"), "d");

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(b1);
        buttonPanel.add(b2);
        buttonPanel.add(b3);
        buttonPanel.add(b4);

        setLayout(new BorderLayout());
        add(buttonPanel, BorderLayout.SOUTH);
        add(cardPanel, BorderLayout.CENTER);

        setSize(500, 500);
        setTitle("CardLayout Demo");
        setDefaultCloseOperation(JFrameDemo.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String command = ae.getActionCommand();
        switch (command) {
            case "C Lang":
                cardLayout.show(cardPanel, "a");
                break;
            case "C++ Lang":
                cardLayout.show(cardPanel, "b");
                break;
            case "Java Lang":
                cardLayout.show(cardPanel, "c");
                break;
            case "Python Lang":
                cardLayout.show(cardPanel, "d");
                break;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CardLayoutDemo demo = new CardLayoutDemo();
            demo.setVisible(true);
        });
    }
}
