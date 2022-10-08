import java.awt.*;
import javax.swing.*;

class MyFrame extends JFrame{
    JProgressBar jsp;
    void cpv()throws InterruptedException{
        // int i=100;
        // while(i>0){
        //     i-=10;
        //     jsp.setValue(i);
        //     Thread.sleep(1000);
        // }
        int i=100;
        while(i>0){
            i-=10;
            jsp.setValue(i);
            Thread.sleep(1000);
            if(jsp.getValue()==0){
                JOptionPane.showMessageDialog(this, "You Have Exceeded Time");
            }
        }
    }
    MyFrame() throws InterruptedException{
        setIconImage(new ImageIcon("nature.jpeg").getImage());
        setVisible(true);
        setSize(800,400);
        // getContentPane().setLayout(new FlowLayout());
        // JButton b1 = new JButton("Btn1");
        // JSeparator js = new JSeparator();
        // js.setBackground(Color.green);
        // JButton b2 = new JButton("Btn2 ");
        // add(b1);
        // add(js);
        // add(b2);
        // DefaultListModel m1 = new DefaultListModel();
        // m1.addElement("CSS");
        // m1.addElement("AJP");
        // m1.addElement("EST");
        // m1.addElement("OS");
        // m1.addElement("OS");
        // m1.addElement("OS");
        // String a[]={"Ajp","JS","CSS","Python"};
        // JList<String> jl =new <String>JList(m1);
        // JScrollPane p1 =  new JScrollPane(jl);
        // p1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        // add(jl);
        // jsp = new JProgressBar(SwingConstants.VERTICAL,0,100);
        // add(jsp);
        // jsp.setToolTipText("Progressing");
        // cpv();
        JPanel p11 = new JPanel();
        JPanel p12 = new JPanel();
        JButton bb1 = new JButton("BTN1");
        JButton bb2 = new JButton("BTN2");
        JButton bb3 = new JButton("BTN3");
        p11.add(bb1);p11.add(bb2);p11.add(bb3);
        JTabbedPane pane = new JTabbedPane();
        pane.addTab("Button",p11);
        pane.addTab("Table",p12);
        add(pane);

        String head[]={"Name","Percentage"};
        String data[][]={
            {"Aditya","98"},
            {"AK","97"}
        };
        JTable t = new JTable(data,head);
        JScrollPane jsp2 = new JScrollPane(t,1,0);
        p12.add(jsp2);
    }
}
public class Separtor{
    public static void main(String a[]) throws InterruptedException{
        new MyFrame();
    }
}