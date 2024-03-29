import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutExam {
    // 컴포넌트 생성
    JFrame jFrame = new JFrame("제목 ㅋㅋ");
    JButton btn1 = new JButton("1번 버튼");
    JButton btn2 = new JButton("2번 버튼");
    JButton btn3 = new JButton("3번 버튼");
    JButton btn4 = new JButton("4번 버튼");
    JButton btn5 = new JButton("5번 버튼");

    public BorderLayoutExam()
    {
        // 컴포넌트를 넣을 컨테이너 구하기
        Container container = jFrame.getContentPane();

        // 컴포넌트를 컨테이너에 추가
        container.add(btn1, BorderLayout.NORTH);
        container.add(btn2, BorderLayout.EAST);
        container.add(btn3, BorderLayout.WEST);
        container.add(btn4, BorderLayout.SOUTH);
        container.add(btn5, BorderLayout.CENTER);

        // 프레임 크기 지정
        jFrame.setSize(300, 300);

        // 프레임 보이기 설정
        jFrame.setVisible(true);

        // 종료 버튼
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }


    public static void main(String[] args){
        // 실행
        new BorderLayoutExam();
    }

}
