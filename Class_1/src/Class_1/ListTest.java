package Class_1;

import java.awt.Frame;
import java.awt.List;
import java.awt.Panel;

public class ListTest extends Frame {

	Panel p;
	List list;
	
	public ListTest(String str) {
		super(str);
		
		// �г� ����
		p = new Panel();
		
		list = new List(4, true);
		list.add("ġŲ");
		list.add("����");
		list.add("�ܹ���");
		list.add("����");
		
		p.add(list);
		
		add(p);
		setSize(300, 100);
		setVisible(true);
	}
}
