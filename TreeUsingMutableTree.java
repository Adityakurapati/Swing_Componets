import javax.swing.*;
import java.awt.*;
import javax.swing.tree.*;
import java.awt.Container.*;
public class TreeUsingMutableTree extends JFrame{
    TreeUsingMutableTree(){
        Container c = getContentPane();

        c.setLayout(new BorderLayout(20,20));
        DefaultMutableTreeNode m1 = new DefaultMutableTreeNode("This PC");
        DefaultMutableTreeNode m2 = new DefaultMutableTreeNode("Libraries");
        DefaultMutableTreeNode m3 = new DefaultMutableTreeNode("Network");
        DefaultMutableTreeNode s1 = new DefaultMutableTreeNode("Local Disk C");
        DefaultMutableTreeNode s11 = new DefaultMutableTreeNode("Operating System");
        s1.add(s11);
        DefaultMutableTreeNode s2 = new DefaultMutableTreeNode("Local Disk D");
        DefaultMutableTreeNode s3 = new DefaultMutableTreeNode("Downloads");
        DefaultMutableTreeNode s4 = new DefaultMutableTreeNode("Documents");
        m1.add(s1);m1.add(s2);m1.add(s3);m1.add(s4);
        DefaultMutableTreeNode s5 = new DefaultMutableTreeNode("Camera Roll");
        DefaultMutableTreeNode s6 = new DefaultMutableTreeNode("Music");
        DefaultMutableTreeNode s7 = new DefaultMutableTreeNode("Pictures");
        DefaultMutableTreeNode s8 = new DefaultMutableTreeNode("Saved Pictures");
        DefaultMutableTreeNode s9 = new DefaultMutableTreeNode("Videos");
        m2.add(s5);m2.add(s6);m2.add(s7);m2.add(s8);m2.add(s9);
        DefaultMutableTreeNode s10 = new DefaultMutableTreeNode("192.168.61.11");
        m3.add(s10);
        DefaultMutableTreeNode Desktop = new DefaultMutableTreeNode("Desktop");
        Desktop.add(m1);
        Desktop.add(m2);
        Desktop.add(m3);
        JTree jt = new JTree(Desktop);
        jt.setSize(200,200);
        int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
        int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
        JScrollPane jsp = new JScrollPane(jt,v,h);
        c.add(jsp,BorderLayout.WEST);
        
    }
    public static void main(String a[]){
        TreeUsingMutableTree t = new TreeUsingMutableTree();
        t.setVisible(true);
        t.setSize(500,500);
        t.setDefaultCloseOperation(EXIT_ON_CLOSE);
        t.setTitle("File Manager ");
    }
}
