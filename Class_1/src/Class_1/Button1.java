package Class_1;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;

// class�� Button���� ����� Button ��ü�� ��ġ�Ƿ� Button1���� ������ִ� �� ���ϴ�.

public class Button1 extends Frame{
	
//	public static void main(String args[]) {
//		 new Button1("��ư�����");
//	}
	
	// ��ư ���� ����
	Button btn1, btn2, btn3;
	
	// ��ư ������
	public Button1(String str) {
		super(str);
		
		
		// ��ư�� �����ϱ����� �г� ����
		Panel p = new Panel();
		
		// ����,����,�� ��ư ����
		btn1 = new Button(" ���� ");
		btn2 = new Button(" ���� ");
		btn3 = new Button(" �� ");
		
		// �гο� 3���� ��ư ����
		p.add(btn1);
		p.add(btn2);
		p.add(btn3);
		add(p);
		
		// �� ��ư�� ��� ����
		btn3.setEnabled(false);
		
		// ������â ũ��� 200x200
		setSize(200, 200);
		
		// ������â
		setVisible(true);
	}
}
