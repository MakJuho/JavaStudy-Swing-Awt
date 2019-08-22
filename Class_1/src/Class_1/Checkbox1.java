package Class_1;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.Panel;

public class Checkbox1 extends Frame{
	
	// 레이블이 있는 생성자
	public Checkbox1(String str) {
		super(str);
		
		// 패널 생성
		Panel p = new Panel();
		
		// 치킨 체크 박스 체크 표시
		Checkbox cbx1 = new Checkbox("치킨", true);
		
		Checkbox cbx2 = new Checkbox("피자", true);
		
		Checkbox cbx3 = new Checkbox("햄버거", true);
		
		// 패널에 생성
		p.add(cbx1);
		p.add(cbx2);
		p.add(cbx3);
		
		// 체크 박스 그룹 생성
		CheckboxGroup group = new CheckboxGroup();
		Checkbox cbx4 = new Checkbox("치킨", group, false);
		Checkbox cbx5 = new Checkbox("피자", group, true);
		Checkbox cbx6 = new Checkbox("햄버거", group, false);
		
		p.add(cbx4);
		p.add(cbx5);
		p.add(cbx6);
		
		add(p);
		setSize(180, 300);
		setVisible(true);
		
		
	}
	
}
