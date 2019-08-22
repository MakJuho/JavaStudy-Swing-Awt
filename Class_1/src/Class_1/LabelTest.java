package Class_1;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;

public class LabelTest extends Frame {
	
	//패널 변수
	Panel p;
	
	//레이블 변수
	Label label1, label2, label3;
	
	// 레이블 생성자
	public LabelTest(String str) {
		super(str);
		
		//패널 생성
		p = new Panel();
		
		// 레이블 생성
		label1 = new Label("치킨");
		label2 = new Label("피자", Label.CENTER);
		label3 = new Label("종로", Label.LEFT);
		
		//  레이블 색 설정
		label1.setBackground(Color.red);
		label2.setBackground(Color.blue);
		label3.setBackground(Color.green);
		
		// 패널에 레이블
		p.add(label1);
		p.add(label2);
		p.add(label3);
		
		add(p);
		setSize(300, 300);
		setVisible(true);
	}
}
