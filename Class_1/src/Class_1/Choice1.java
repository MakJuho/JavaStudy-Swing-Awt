package Class_1;

import java.awt.Choice;
import java.awt.Frame;

public class Choice1 extends Frame {
	
	// 콤보 박스 변수 생성
	Choice ch;
	
	// 레이블이 있는 콤보 박스 생성자
	public Choice1(String str) {
		super(str);
		
		// 콤보 박스 객체 생성
		ch = new Choice();
		
		// 콤보 박스 아이템 생성
		ch.addItem("치킨");
		ch.addItem("피자");
		ch.addItem("햄버거");
		
		// 추가
		add(ch);
		setSize(300, 100);
		setVisible(true);
		
	}
}
