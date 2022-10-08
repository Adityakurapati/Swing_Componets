import java.awt.*;
import javax.swing.*;

class Progress extends JFrame
{
    Progress()
    {
        Container c = getContentPane();
        c.setLayout(null);
        JProgressBar jpb = new JProgressBar(0,1000);
        jpb.setBounds(100,100,200,40);
        c.add(jpb);
        jpb.setStringPaineted(true);

    }
    void changeProgressValue(){
        int i=0;
        while(i<1000)
        { 
            jpb.setValue(i);
            i++;
        }
    }
    public static void main(String a[])
    {
        Progress1 p = new Progress1();
        p.setVisible(true);
        p.setSize(500,500);
        p.setTitle("Progress Bar ");
        p.changeProgress();

    }
}