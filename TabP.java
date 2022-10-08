import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TabP extends JFrame implements ItemListener,ActionListener{
    JRadioButton jrb1,jrb2,jrb3;
    JCheckBox jcb1,jcb2,jcb3;
    JTextField jtf1,jtf2;
    JButton submit;
    TabP()
    {
        setVisible(true);
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setBackground(Color.green);
        JTabbedPane jtp = new JTabbedPane();
        JPanel p1 = new JPanel();
        p1.setLayout(new FlowLayout());
        Panel p2 = new Panel();
        p2.setLayout(new FlowLayout());
        Panel p3 = new Panel();
        p3.setLayout(new FlowLayout());

        JButton jb1 = new JButton("Ok");
        JButton jb2 = new JButton("Cancel");
        JButton jb3 = new JButton("Retry");
        p1.add(jb1);p1.add(jb2);p1.add(jb3);
        jtp.addTab("Buttons ",p1);
         

        jrb1 = new JRadioButton("Male");
        jrb2 = new JRadioButton("FeMale");
        jrb3 = new JRadioButton("Others");
        ButtonGroup bg1 = new ButtonGroup();
        bg1.add(jrb1);bg1.add(jrb2);bg1.add(jrb3);
        p2.add(jrb1);p2.add(jrb2);p2.add(jrb3);
        jrb1.addItemListener(this);
        jrb2.addItemListener(this);
        jrb3.addItemListener(this);
        p2.add(jrb1);p2.add(jrb2);p2.add(jrb3);
        jtp.addTab("Radio Buttons ",p2);

        jtf1 = new JTextField("Name ");
        jtf2 = new JTextField("Password ");
        submit = new JButton("Submit");
        submit.addActionListener(this);

        jcb1 = new JCheckBox("JS");
        jcb2 = new JCheckBox("Python",true);
        jcb3 = new JCheckBox("Android");
        ButtonGroup bg = new ButtonGroup();
        bg.add(jcb1);bg.add(jcb2);bg.add(jcb3);
        jcb1.addItemListener(this);
        jcb1.addItemListener(this);
        jcb1.addItemListener(this);
        p3.add(jtf1);p3.add(jtf2);p3.add(submit);p3.add(jcb1);p3.add(jcb2);p3.add(jcb3);
        jtp.addTab("Radio Buttons ",p3);
        jtp.setBackground(Color.orange);
        c.add(jtp);

    }
    public void actionPerformed(ActionEvent ae){
        String str = jtf2.getText();
        if(str.equals("pass14")){
            JOptionPane.showMessageDialog(this, "Login Successful ");
        }
        else{
            JOptionPane.showMessageDialog(this, "Login Denied ");
        }
    }
    public void itemStateChanged(ItemEvent ie)
    {
        if(jrb1.isSelected())
        {
            JOptionPane.showMessageDialog(this, "You Are Male ");
        }
        else if(jrb2.isSelected()){
            JOptionPane.showMessageDialog(this, "You Are Female ");
        }
        else if(jrb3.isSelected())
        {
            JOptionPane.showMessageDialog(this, "You Are Others ");
        }
        else if(jcb1.isSelected()){
            JOptionPane.showMessageDialog(this, "You Have Selected JS");
        }
        else if(jcb2.isSelected()){
            JOptionPane.showMessageDialog(this, "You Have Selected Python");
        }
        else if(jcb3.isSelected()){
            JOptionPane.showMessageDialog(this, "You Have Selected Android");
        }

    }
    
    public static void main(String[] args) {
        new TabP();
    }
    
}
