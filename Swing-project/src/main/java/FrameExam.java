import javax.swing.JButton;
import javax.swing.JFrame;

public class FrameExam {

    // Ÿ��Ʋ
    JFrame frame = new JFrame("������");
    // ��ư
    JButton button = new JButton("������");

    public void createFrame(){
        // �����ӿ� ������Ʈ �߰�
        frame.add(button);

        // ������ ũ�� ����
        frame.setSize(300, 600);

        // ������ ���̱�
        frame.setVisible(true);

        //swing���� �ִ� X��ư Ŭ���� ����
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args){

        // ������ ����
        FrameExam frameExam = new FrameExam();
        frameExam.createFrame();
    }
}
