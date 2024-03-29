import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.List;
import java.awt.TextArea;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ListExam extends JFrame {
    String ch_item[]=
            {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일" };

    // List list = new List(3); // 3행으로 보여짐(단일선택)
    List list = new List(4, true);

    TextArea text = new TextArea(5, 10);

    public ListExam(){
        super("JComboBoxExam 입니다.");

        // 레이아웃 변경.
        setLayout(new FlowLayout());

        // List에 항목 추가
        for (String str: ch_item)
            list.add(str);

        // 추가
        super.add(list);
        super.add(text);

        // 크기
        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args)
    {
        new ListExam();
    }
}
