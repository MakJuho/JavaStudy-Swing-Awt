import javax.swing.*;
import java.awt.*;

public class textComponent {

    JFrame jFrame = new JFrame();


    public textComponent(){



        //텍스트 입력
        JTextField text = new JTextField("이름입력주세요.", 3);

        //스크롤바가 기본적으로 있는 AWT 텍스트 필드
        TextArea textArea = new TextArea(); //스크롤바 기본 있음.

//        //Swing에서의 텍스트 영역.. 스크롤바가 존재하지 않는다.
//        JTextArea textArea = new JTextArea("내용 입력하세요.", 5,10);//스크롤바 없음

        //Swing에서 스크롤바를 넣기 위해 아래와 같이 사용한다.
//        JScrollPane jp  = new JScrollPane(textArea);//스클롤바 만들기

        //패스워드를 위한 필드
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
