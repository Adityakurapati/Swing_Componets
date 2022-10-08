import javax.swing.*;
import javax.swing.tree.*;
import java.awt.*;
import java.util.*;
import java.security.spec.DSAGenParameterSpec;

import javax.swing.tree.*;

public class TreeUsingVector extends JFrame {
    TreeUsingVector(){
        Vector Desktop = new Vector();

        DefaultMutableTreeNode ThisPc = new DefaultMutableTreeNode("This PC");
        DefaultMutableTreeNode s1 = new DefaultMutableTreeNode("Local Disk C");
        DefaultMutableTreeNode s2 = new DefaultMutableTreeNode("Local Disk D");
        DefaultMutableTreeNode s3 = new DefaultMutableTreeNode("Documents");
        DefaultMutableTreeNode s4 = new DefaultMutableTreeNode("Downloads");
        ThisPc.add(s1);
        ThisPc.add(s2);
        ThisPc.add(s3);
        ThisPc.add(s4);
        
        DefaultMutableTreeNode Libraries = new DefaultMutableTreeNode("Libraries");
        DefaultMutableTreeNode s5 = new DefaultMutableTreeNode("Music");
        DefaultMutableTreeNode s6 = new DefaultMutableTreeNode("Pictures");
        DefaultMutableTreeNode s7 = new DefaultMutableTreeNode("Saved Pictures");
        DefaultMutableTreeNode s8 = new DefaultMutableTreeNode("Videos");
        Libraries.add(s5);
        Libraries.add(s6);
        Libraries.add(s7);
        Libraries.add(s5);
       
        DefaultMutableTreeNode Network= new DefaultMutableTreeNode("Network");
        DefaultMutableTreeNode s9 = new DefaultMutableTreeNode("192.168.61.11");
        Network.add(s9);

        Desktop.add(ThisPc);
        Desktop.add(Libraries);
        Desktop.add(Network);
        

        JTree jt = new JTree(Desktop);
        int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
        int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
        JScrollPane jsp = new JScrollPane(jt,v,h);
                getContentPane().add(jsp,v,h);     
    }

    public static void main(String[] args) {
        TreeUsingVector tut = new TreeUsingVector();
        tut.setVisible(true);
        tut.setSize(100, 100);
        tut.setBackground(Color.magenta);
        tut.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}