import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JOptionPaneExam extends JFrame {
    public JOptionPaneExam()
    {
        super("JOptionPane 테스트");

        // 간단한 메세지 창
        JOptionPane.showMessageDialog(this, "축하합니다.");

        // 간단한 확인 창
        System.out.println(JOptionPane.showConfirmDialog(this, "선택하시겠습니까?"));
        // Yes :0
        // No : 1
        // Cancel : 2

        // 사용자 입력창
        System.out.println(JOptionPane.showInputDialog(this, "이름은?"));

        setSize(500,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args){
        new JOptionPaneExam();
    }

}
