
import java.awt.*;
import javax.swing.*;

public class Jmain {

    static class setGUI extends JFrame{

        // 생성자를 통해 GUI 초기 세팅을 해준다.
        setGUI(){

            // 윈도우 제목(Title)을 생성
            setTitle("이름 & 취미");

            // 종료 버튼 생성
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // 이 부분부터 원하는 버튼, 레이블, 콤보박스 등등 설정

            // FlowLayout을 설정
            this.setLayout(new GridLayout(2,2));


            // 레이블 생성
            JLabel lb1 = new JLabel("취미:");
            this.add(lb1);

            // 체크 박스 생성
            JCheckBox chk1 = new JCheckBox("게임",true);
            JCheckBox chk2 = new JCheckBox("영화",false);
            JCheckBox chk3 = new JCheckBox("노래",true);
            this.add(chk1);
            this.add(chk2);
            this.add(chk3);

            // 레이블 생성
            JLabel lb2 = new JLabel("성별:");
            this.add(lb2);

            // 라디오 버튼 생성
            JRadioButton rd1 = new JRadioButton("남자");
            JRadioButton rd2 = new JRadioButton("여자");

            // 1번 라디오 버튼 눌러져있도록
            rd1.setSelected(true);

            // 라디오 버튼을 그룹화 하기위한 객체 생성
            ButtonGroup groupRd = new ButtonGroup();

            // 그룹에 라디오 버튼 포함시킨다.
            groupRd.add(rd1);
            groupRd.add(rd2);

            this.add(rd1);
            this.add(rd2);


            // 윈도우 창 크기 설정(가로, 세로)
            setSize(300, 200);

            // 이 메소드를 이용해야 윈도우 창이 나타난다.
            setVisible(true);
        }
    }


    public static void main(String[] args){

        new setGUI();
    }
}