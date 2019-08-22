package Class_1;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class PanelTest extends Frame {
	public PanelTest(String str) {
		super(str);
		Panel panel1 = new Panel();
		
		// 색을 빨간색으로 지정
		panel1.setBackground(Color.RED);
		// 추가
		add(panel1);
		// 크기
		setSize(300,300);
		setVisible(true);
		
	}
}


