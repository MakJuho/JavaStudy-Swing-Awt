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
    // JList 선언
    JList<String> jl;
    // ComboBox 선언
    JComboBox<String> com;
    String name[] = { "너구리", "돼지", "족제비 ", "봉이", "말" };
    String count[] = { "1", "2", "3", "4", "5" };
 
    public FrameTest() 
    {
        super("JComponent연습");
        Container c = getContentPane();
        // FlowLayout 생성
        c.setLayout(new FlowLayout());
        // JPanel 생성
        p = new JPanel(new GridLayout(1, 2));
        // JComboBox에 name 배열 널기
        com = new JComboBox<String>(name);
        JScrollPane s = new JScrollPane(com);
        c.add(s);
        // JList에 count배
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