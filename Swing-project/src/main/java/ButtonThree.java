
// ������Ʈ ���̾ƿ� ����
// setLayout

import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonThree extends JFrame{

    JButton b1 = new JButton("1");
    JButton b2 = new JButton("2");
    JButton b3 = new JButton("3");

    public ButtonThree()
    {
        // ���� ����
        super("������ ���⿡");

        // ���̾ƿ� ����
        this.setLayout(new FlowLayout());

        // ��ư �߰�
        this.add(b1);
        this.add(b2);
        this.add(b3);

        // ������ ũ�� ����
        this.setSize(300, 400);

        // ������ ���̵��� ����
        this.setVisible(true);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args)
    {
        // ����
        new ButtonThree();
    }
}
