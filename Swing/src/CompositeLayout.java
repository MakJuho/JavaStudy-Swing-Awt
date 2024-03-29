import javax.swing.*;
import java.awt.*;

public class CompositeLayout {

    JFrame jFrame = new JFrame(); // 전체적인 프레임
    JPanel jpanel = new JPanel(); // 상단에 들어갈 패널
    JButton [] btn = new JButton[4]; // 버튼


    public CompositeLayout()
    {

        // 버튼 생성
        for(int i=0; i<btn.length; i++){
            btn[i] = new JButton(i+"번째 버튼");
        }

        // 패널에 버튼 추가
        jpanel.add(btn[0]);
        jpanel.add(btn[1]);

        // 패널 추가
        jFrame.add(jpanel, "North");
        jFrame.add(btn[2], "West");
        jFrame.add(btn[3], "Center");


        // 사이즈 및 보여짐 여부 설정
        jFrame.setSize(300, 300);
        jFrame.setVisible(true);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args)
    {
        new CompositeLayout();
    }
}
