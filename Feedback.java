import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Feedback extends JFrame implements ActionListener
{
    JLabel l = new JLabel("Result");
    JButton btn,clear;
    JTextField tf1,tf2,tf3;
    JTextArea ta4;
    Feedback()
    {
        setVisible(true);
        setSize(490,600);
        Container c = getContentPane();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        c.setBackground(Color.orange);
        c.setLayout(null);

        JLabel l1 = new JLabel("FeedBack Form");
        Font f = new Font("Times New Roman",Font.BOLD,28);
        l1.setFont(f);
        l1.setBounds(100,30,250,40);
        c.add(l1);

        JLabel l2 = new JLabel("Name ",JLabel.RIGHT);
        Font f1 = new Font("Arial Black",Font.BOLD,18);
        l2.setFont(f1);
        l2.setBounds(50,100,70,20);
        c.add(l2);

        tf1 = new JTextField("Name ");
        tf1.setFont(f1);
        tf1.setBounds(180,100,200,20);
        c.add(tf1);
        
        JLabel l3 = new JLabel("Roll No.");
        l3.setFont(f1);
        l3.setBounds(50,160,90,20);
        c.add(l3);

        tf2 = new JTextField("Roll No.");
        tf2.setFont(f1);
        tf2.setBounds(180,160,200,20);
        c.add(tf2);

        
        JLabel l4 = new JLabel("Mobile No. ");
        l4.setFont(f1);
        l4.setBounds(50,220,120,20);
        c.add(l4);

        tf3 = new JTextField("10 digits mobille");
        tf3.setFont(f1);
        tf3.setBounds(180,220,200,20);
        c.add(tf3);
        
        JLabel l5 = new JLabel("Feedback ");
        l5.setFont(f1);
        l5.setBounds(50,280,120,20);
        c.add(l5);

        ta4 = new JTextArea("10 digits mobille");
        ta4.setFont(f1);
        ta4.setBounds(180,280,200,130);
        c.add(ta4);

        btn = new JButton("Submit");
        btn.setFont(f1);
        btn.setBounds(90,440,120,55);
        c.add(btn);
        btn.addActionListener(this);

        clear = new JButton("Clear");
        clear.setFont(f1);
        clear.setBounds(250,440,100,55);
        c.add(clear);
        clear.addActionListener(this);

        l.setBounds(105,520,220,30);
        l.setFont(f);
        c.add(l);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==btn)
        {
            l.setText("Record Submitted");
        }
        else if(ae.getSource()==clear)
        {
            tf1.setText("");
            tf2.setText("");
            tf3.setText("");
            ta4.setText("");

        }
        
    }
    public static void main(String[] args) {
        new Feedback();
    }
}