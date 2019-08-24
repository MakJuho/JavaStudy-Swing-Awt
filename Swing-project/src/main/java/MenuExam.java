import javax.swing.*;
import java.awt.event.InputEvent;

public class MenuExam {
    // ������ ����
    JFrame jFrame = new JFrame("Menu����");

    // Swing������ �ؽ�Ʈ ����.. ��ũ�ѹٰ� �������� �ʴ´�.
    JTextArea textArea = new JTextArea("���� �Է��ϼ���.", 5, 10);// ��ũ�ѹ� ����

    // Swing���� ��ũ�ѹٸ� �ֱ� ���� �Ʒ��� ���� ����Ѵ�.
    JScrollPane jp = new JScrollPane(textArea);// ��Ŭ�ѹ� �����

    // �޴� ����
    JMenuBar menuBar = new JMenuBar();
    JMenu fileMenu = new JMenu("����");
    JMenu helpMenu = new JMenu("Help");

    public MenuExam()
    {
        // ���� �޴� ����
        fileMenu.add(new JMenuItem("�� ����"));
        fileMenu.getItem(0).setAccelerator
                (KeyStroke.getKeyStroke('N', InputEvent.CTRL_MASK ^ InputEvent.ALT_MASK)); //����Ű����
        fileMenu.add(new JMenuItem("����"));
        fileMenu.add(new JMenuItem("����"));
        fileMenu.addSeparator(); //���м� �߰�
        fileMenu.add(new JMenuItem("����"));

        // ���� �޴� ����
        helpMenu.add(new JMenuItem("����"));
        helpMenu.add(new JMenuItem("����"));

        // �޴��� �޴��ٿ� ���
        menuBar.add(fileMenu);
        menuBar.add(helpMenu);

        // �޴��� �߰�
        jFrame.setJMenuBar(menuBar);

        // �ؽ�Ʈ ���� �߰�
        jFrame.add(jp, "Center");

        // ������ ũ�� ����
        jFrame.setSize(300, 300);

        // ������ ���̱�
        jFrame.setVisible(true);

        // swing���� �ִ� X��ư Ŭ���� ����
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args)
    {
        // ����
        new MenuExam();
    }

}
