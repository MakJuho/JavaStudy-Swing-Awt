package Class_1;

import java.awt.Dialog;
import java.awt.Frame;

public class ModelessDialog extends Frame {
	public ModelessDialog() {
		super("���̾�α� �׽�Ʈ");
		
		//��ü ����
		Dialog d = new Dialog(this, "������� ���̾�α�");
		
		//��ġ�� ũ�� ����
		setBounds(0, 0, 400, 400);
		
		//â�� ȭ�鿡 ���̰� ��
		setVisible(true);
		
		//ũ�� ����
		d.setSize(200,200);
		
		// ���̾�α׸� ȭ�鿡 ���̰� ��
		d.setVisible(true);
	}
}
