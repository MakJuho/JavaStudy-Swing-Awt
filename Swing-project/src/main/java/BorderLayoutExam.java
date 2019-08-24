import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutExam {
    // ������Ʈ ����
    JFrame jFrame = new JFrame("���� ����");
    JButton btn1 = new JButton("1�� ��ư");
    JButton btn2 = new JButton("2�� ��ư");
    JButton btn3 = new JButton("3�� ��ư");
    JButton btn4 = new JButton("4�� ��ư");
    JButton btn5 = new JButton("5�� ��ư");

    public BorderLayoutExam()
    {
        // ������Ʈ�� ���� �����̳� ���ϱ�
        Container container = jFrame.getContentPane();

        // ������Ʈ�� �����̳ʿ� �߰�
        container.add(btn1, BorderLayout.NORTH);
        container.add(btn2, BorderLayout.EAST);
        container.add(btn3, BorderLayout.WEST);
        container.add(btn4, BorderLayout.SOUTH);
        container.add(btn5, BorderLayout.CENTER);

        // ������ ũ�� ����
        jFrame.setSize(300, 300);

        // ������ ���̱� ����
        jFrame.setVisible(true);

        // ���� ��ư
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }


    public static void main(String[] args){
        // ����
        new BorderLayoutExam();
    }

}
