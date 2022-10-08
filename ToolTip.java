import java.awt.*;
import javax.swing.*;

class ToolTip extends JFrame
{
    ToolTip()
    {
        Container c = getContentPane();
        c.setLayout(null);
        JProgressBar jpb = new JProgressBar(0,1000);
        jpb.setBounds(100,100,200,40);
        c.add(jpb);
        jpb.setStringPaineted(true);
        jpb.setToolTipText("This Is Progres bar ");

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
        ToolTip p = new ToolTip();
        p.setVisible(true);
        p.setSize(500,500);
        p.setTitle("Progress Bar ");
        p.changeProgress();

    }
}