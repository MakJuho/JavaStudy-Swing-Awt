package Class_1;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class PanelTest extends Frame {
	public PanelTest(String str) {
		super(str);
		Panel panel1 = new Panel();
		
		// ���� ���������� ����
		panel1.setBackground(Color.RED);
		// �߰�
		add(panel1);
		// ũ��
		setSize(300,300);
		setVisible(true);
		
	}
}


