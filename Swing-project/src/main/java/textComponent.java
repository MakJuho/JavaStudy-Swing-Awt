import javax.swing.*;
import java.awt.*;

public class textComponent {

    JFrame jFrame = new JFrame();


    public textComponent(){



        //�ؽ�Ʈ �Է�
        JTextField text = new JTextField("�̸��Է��ּ���.", 3);

        //��ũ�ѹٰ� �⺻������ �ִ� AWT �ؽ�Ʈ �ʵ�
        TextArea textArea = new TextArea(); //��ũ�ѹ� �⺻ ����.

//        //Swing������ �ؽ�Ʈ ����.. ��ũ�ѹٰ� �������� �ʴ´�.
//        JTextArea textArea = new JTextArea("���� �Է��ϼ���.", 5,10);//��ũ�ѹ� ����

        //Swing���� ��ũ�ѹٸ� �ֱ� ���� �Ʒ��� ���� ����Ѵ�.
//        JScrollPane jp  = new JScrollPane(textArea);//��Ŭ�ѹ� �����

        //�н����带 ���� �ʵ�
//        JPasswordField pwd = new JPasswordField();

        jFrame.add(textArea);
        jFrame.setSize(300,300);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args){
        new textComponent();
    }

}
