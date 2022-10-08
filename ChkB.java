import java.awt.*;
import java.net.URL;
import java.awt.event.*;
import javax.swing.*;
class ChkB extends JFrame implements ItemListener{
    JRadioButton jrb1,jrb2,jrb3;
    JCheckBox jcb1,jcb2,jcb3;
    ChkB()
    {
        setVisible(true);
        setSize(400,400);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        // URL u = new URL("D://MY USERS/Aditya/IFE5I/Adv Java/Adv_Java_V/Unit 2/nature.jpeg");
        ImageIcon ii = new ImageIcon("D:/ww1.jpg");
        c.setBackground(Color.orange);
        jcb1 = new JCheckBox("JS");
        jcb2 = new JCheckBox("Python",true);
        jcb3 = new JCheckBox("Android",ii);
        c.add(jcb1);c.add(jcb2);c.add(jcb3);
        ButtonGroup bg = new ButtonGroup();
        bg.add(jcb1);bg.add(jcb2);bg.add(jcb3);

        jrb1 = new JRadioButton("Male");
        jrb2 = new JRadioButton("FeMale");
        jrb3 = new JRadioButton("Others");
        ButtonGroup bg1 = new ButtonGroup();
        bg1.add(jrb1);bg1.add(jrb2);bg1.add(jrb3);
        c.add(jrb1);c.add(jrb2);c.add(jrb3);
        jcb1.addItemListener(this);
        jcb1.addItemListener(this);
        jcb1.addItemListener(this);
        jrb1.addItemListener(this);
        jrb2.addItemListener(this);
        jrb3.addItemListener(this);
        // jrb1.addItemListener(new ItemListener(){
        //     public void itemStateChanged(ItemEvent ie){
        //         if(jrb1.isSelected()){
        //            JOptionPane.showMessageDialog(this,"male");
        //         }
        //     }
        // });
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
        new ChkB();
    }
    

}
