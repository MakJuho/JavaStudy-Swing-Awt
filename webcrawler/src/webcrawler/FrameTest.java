package webcrawler;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
 
public class FrameTest extends JFrame {
	JPanel p, p1, p2;
    // JList ����
    JList<String> jl;
    // ComboBox ����
    JComboBox<String> com;
    String name[] = { "�ʱ���", "����", "������ ", "����", "��" };
    String count[] = { "1", "2", "3", "4", "5" };
 
    public FrameTest() 
    {
        super("JComponent����");
        Container c = getContentPane();
        // FlowLayout ����
        c.setLayout(new FlowLayout());
        // JPanel ����
        p = new JPanel(new GridLayout(1, 2));
        // JComboBox�� name �迭 �α�
        com = new JComboBox<String>(name);
        JScrollPane s = new JScrollPane(com);
        c.add(s);
        // JList�� count��
        jl = new JList<String>(count);
        JScrollPane s1 = new JScrollPane(jl);
        jl.setVisibleRowCount(4);
        c.add(s1);
        setSize(250, 300);
        setVisible(true);
    }
    
    public static void main(String args[]) 
    {
        FrameTest Obj = new FrameTest();
        Obj.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}