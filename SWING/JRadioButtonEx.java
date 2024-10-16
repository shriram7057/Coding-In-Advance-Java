import java.awt.*;
import javax.swing.*;
public class JRadioButtonEx extends JFrame {
    JRadioButtonEx(){
//        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,600,500);
        java.awt.Container c=getContentPane();
        c.setLayout(null);
        c.setBackground(Color.gray);

        JRadioButton jrd=new JRadioButton("Male");
        jrd.setBounds(100,50,100,20);
        c.add(jrd);

        JRadioButton jrd2=new JRadioButton("Female");
        jrd2.setBounds(250,50,100,20);
        c.add(jrd2);

        ButtonGroup gender=new ButtonGroup();
        gender.add(jrd); gender.add(jrd2);

        JRadioButton gen=new JRadioButton("General");
        JRadioButton obc=new JRadioButton("OBC");
        JRadioButton sc=new JRadioButton("SC");
        JRadioButton st=new JRadioButton("ST");

        gen.setBounds(100,100,100,20);
        obc.setBounds(200,100,100,20);
        sc.setBounds(300,100,100,20);
        st.setBounds(400,100,100,20);

        c.add(gen);
        c.add(obc);
        c.add(sc);
        c.add(st);
        
        //creating button group to select only one option
        ButtonGroup caste=new ButtonGroup();
        caste.add(gen); caste.add(obc); caste.add(sc); caste.add(st);

        //initially selected option
        jrd.setSelected(true);
        gen.setSelected(true);

        //To disable SC caste
//        sc.setEnabled(false);

        //To change font
        Font font=new Font("Times New Roman", Font.BOLD,20);
        jrd.setFont(font);
        jrd2.setFont(font);

        setVisible(true);
    }

    public static void main(String[] args) {
        JRadioButtonEx j=new JRadioButtonEx();
    }
}
