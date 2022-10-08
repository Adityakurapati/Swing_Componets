import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Progress extends JFrame implements ActionListener
{
    JProgressBar jpb;
    
    Progress()
    {
        setVisible(true);
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(null);
        jpb = new JProgressBar();
        jpb.setBounds(50,50,200,40);
        jpb.setValue(0);
        jpb.setStringPainted(true);
        JButton start = new JButton("Start");
        start.addActionListener(this);
        c.add(start);
        c.add(jpb);
        jpb.setBounds(50,50,300,50);
        start.setBounds(120,150,200,40);

    }
    
    public void actionPerformed(ActionEvent ae){
        ChangeProgressValue();
        }
        public void ChangeProgressValue(){
            int i=0;
            while(i<3000)
            {
                jpb.setValue(i);
                i+=20;
                try{
                    Thread.sleep(1000);
                }catch(Exception e){}
            }
        
        }
    public static void main(String a[])
    {
        Progress p = new Progress();
        // p.ChangeProgressValue();
    }
}