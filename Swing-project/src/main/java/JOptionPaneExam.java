import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JOptionPaneExam extends JFrame {
    public JOptionPaneExam()
    {
        super("JOptionPane �׽�Ʈ");

        // ������ �޼��� â
        JOptionPane.showMessageDialog(this, "�����մϴ�.");

        // ������ Ȯ�� â
        System.out.println(JOptionPane.showConfirmDialog(this, "�����Ͻðڽ��ϱ�?"));
        // Yes :0
        // No : 1
        // Cancel : 2

        // ����� �Է�â
        System.out.println(JOptionPane.showInputDialog(this, "�̸���?"));

        setSize(500,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args){
        new JOptionPaneExam();
    }

}
