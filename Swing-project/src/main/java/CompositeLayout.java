import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CompositeLayout {

    JFrame jFrame = new JFrame(); // ��ü���� ������
    JPanel jpanel = new JPanel(); // ��ܿ� �� �г�
    JButton [] btn = new JButton[4]; // ��ư

    public CompositeLayout()
    {
        // ��ư ����
        for(int i=0; i<btn.length; i++){
            btn[i] = new JButton(i+"��° ��ư");
        }

        // �гο� ��ư �߰�
        jpanel.add(btn[0]);
        jpanel.add(btn[1]);

        // �г� �߰�
        jFrame.add(jpanel, "North");
        jFrame.add(btn[2], "West");
        jFrame.add(btn[3], "Center");

        // ������ �� ������ ���� ����
        jFrame.setSize(300, 300);
        jFrame.setVisible(true);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args)
    {
        new CompositeLayout();
    }
}
