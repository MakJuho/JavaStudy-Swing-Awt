package Class_1;

import java.awt.Dialog;
import java.awt.Frame;

public class ModelessDialog extends Frame {
	public ModelessDialog() {
		super("다이얼로그 테스트");
		
		//객체 생성
		Dialog d = new Dialog(this, "모덜리스 다이얼로그");
		
		//위치와 크기 결정
		setBounds(0, 0, 400, 400);
		
		//창을 화면에 보이게 함
		setVisible(true);
		
		//크기 결정
		d.setSize(200,200);
		
		// 다이어로그를 화면에 보이게 함
		d.setVisible(true);
	}
}
