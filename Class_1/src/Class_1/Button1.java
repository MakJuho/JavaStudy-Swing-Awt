package Class_1;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;

// class를 Button으로 만들면 Button 객체와 겹치므로 Button1으로 만들어주는 게 편하다.

public class Button1 extends Frame{
	
//	public static void main(String args[]) {
//		 new Button1("버튼만들기");
//	}
	
	// 버튼 변수 선언
	Button btn1, btn2, btn3;
	
	// 버튼 생성자
	public Button1(String str) {
		super(str);
		
		
		// 버튼을 생성하기위해 패널 생성
		Panel p = new Panel();
		
		// 가위,바위,보 버튼 생성
		btn1 = new Button(" 가위 ");
		btn2 = new Button(" 바위 ");
		btn3 = new Button(" 보 ");
		
		// 패널에 3가지 버튼 생성
		p.add(btn1);
		p.add(btn2);
		p.add(btn3);
		add(p);
		
		// 보 버튼을 사용 안함
		btn3.setEnabled(false);
		
		// 윈도우창 크기는 200x200
		setSize(200, 200);
		
		// 윈도우창
		setVisible(true);
	}
}
