import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;

public class JDialogExam extends JFrame{

    // �ʿ��� �ʵ� ����
    JFrame jFrame = new JFrame("J���̾�α� ����");
    JDialog jDialog = new JDialog(jFrame, "JDialog Ÿ��Ʋ");
    JButton jButton = new JButton("Click");

    // GUI ���� ������
    public JDialogExam()
    {
        // ���̾�α׿� ��ư �߰�
        jDialog.add(jButton, "South");

        // �⺻ ������ ũ��� ���� ����
        jFrame.setSize(600, 600);
        jFrame.setVisible(true);
        //X��ư ������ ���α׷� ����
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // ���̾�α��� ũ��� ���� ����
        jDialog.setSize(300, 300);
        jDialog.setVisible(true);
        //��X��ư ������ ���̾�α׸� ����
        jDialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }

    public static void main(String[] args)
    {
        //����
        new JDialogExam();
    }
}
