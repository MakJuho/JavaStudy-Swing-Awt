package Class_1;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.Panel;

public class Checkbox1 extends Frame{
	
	// ���̺��� �ִ� ������
	public Checkbox1(String str) {
		super(str);
		
		// �г� ����
		Panel p = new Panel();
		
		// ġŲ üũ �ڽ� üũ ǥ��
		Checkbox cbx1 = new Checkbox("ġŲ", true);
		
		Checkbox cbx2 = new Checkbox("����", true);
		
		Checkbox cbx3 = new Checkbox("�ܹ���", true);
		
		// �гο� ����
		p.add(cbx1);
		p.add(cbx2);
		p.add(cbx3);
		
		// üũ �ڽ� �׷� ����
		CheckboxGroup group = new CheckboxGroup();
		Checkbox cbx4 = new Checkbox("ġŲ", group, false);
		Checkbox cbx5 = new Checkbox("����", group, true);
		Checkbox cbx6 = new Checkbox("�ܹ���", group, false);
		
		p.add(cbx4);
		p.add(cbx5);
		p.add(cbx6);
		
		add(p);
		setSize(180, 300);
		setVisible(true);
		
		
	}
	
}
