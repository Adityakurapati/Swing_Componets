import javax.swing.*;
import java.awt.*;
import javax.swing.tree.*;
public class TreeUsingArrey extends JFrame{
    TreeUsingArrey(){
        DefaultMutableTreeNode s1 = new DefaultMutableTreeNode("Local Disk C");
        DefaultMutableTreeNode s2 = new DefaultMutableTreeNode("Local Disk D");
        DefaultMutableTreeNode s3 = new DefaultMutableTreeNode("Downloads");
        DefaultMutableTreeNode s4 = new DefaultMutableTreeNode("Documents");
        DefaultMutableTreeNode s5 = new DefaultMutableTreeNode("Camera Roll");
        DefaultMutableTreeNode s6 = new DefaultMutableTreeNode("Music");
        DefaultMutableTreeNode s7 = new DefaultMutableTreeNode("Pictures");
        DefaultMutableTreeNode s8 = new DefaultMutableTreeNode("Saved Pictures");
        DefaultMutableTreeNode s9 = new DefaultMutableTreeNode("Videos");
        DefaultMutableTreeNode s10 = new DefaultMutableTreeNode("192.168.61.11");
        // DefaultMutableTreeNode s11 = new DefaultMutableTreeNode("");
        // DefaultMutableTreeNode s12 = new DefaultMutableTreeNode("");
        // DefaultMutableTreeNode s13 = new DefaultMutableTreeNode("");
        DefaultMutableTreeNode ThisPC[] = {s1,s2,s3,s4};
        DefaultMutableTreeNode Libraries[] = {s5,s6,s7,s8,s9};
        DefaultMutableTreeNode Network[] = {s10};
        DefaultMutableTreeNode Desktop = new DefaultMutableTreeNode("Desktop");
        Desktop.add(ThisPC);
        JTree jt = new JTree(Desktop);
        int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
        int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
        JScrollPane jsp = new JScrollPane(jt,v,h);
        c.add(jsp,BorderLayout.WEST);
        
    }
    public static void main(String[] args) {
        TreeUsingArrey tut = new TreeUsingArrey();
        tut.setVisible(true);
        tut.setSize(100,100);
        tut.setBackground(Color.magenta);
        tut.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
