import javax.swing.*;
import java.awt.*;
class txt extends JFrame{
    txt()
    {
        setVisible(true);
        setSize(1000,1000);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JLabel l = new JLabel("Hello User ");
        JButton b = new JButton("Click me ");

        JTextField tf = new JTextField("Username",5);
        JCheckBox cb = new JCheckBox("JavaScript");
        JCheckBox cb2 = new JCheckBox("Python");
        JCheckBox cb3 = new JCheckBox("HTML");
        JCheckBox cb4 = new JCheckBox("CSS");
        JToggleButton jtb = new JToggleButton("Toggle Btn");
        ButtonGroup grp = new ButtonGroup();
        grp.add(cb);grp.add(cb2);grp.add(cb3);grp.add(cb4);
        c.add(l);c.add(b);add(tf);
        c.add(cb);c.add(cb2);c.add(cb3);c.add(cb4);c.add(jtb);
    }
    public static void main(String args[])
    {
        new txt();
    }

}