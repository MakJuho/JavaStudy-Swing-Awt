import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.List;
import java.awt.TextArea;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ListExam extends JFrame {
    String ch_item[]=
            {"������", "ȭ����", "������", "�����", "�ݿ���", "�����", "�Ͽ���" };

    // List list = new List(3); // 3������ ������(���ϼ���)
    List list = new List(4, true);

    TextArea text = new TextArea(5, 10);

    public ListExam(){
        super("JComboBoxExam �Դϴ�.");

        // ���̾ƿ� ����.
        setLayout(new FlowLayout());

        // List�� �׸� �߰�
        for (String str: ch_item)
            list.add(str);

        // �߰�
        super.add(list);
        super.add(text);

        // ũ��
        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args)
    {
        new ListExam();
    }
}
