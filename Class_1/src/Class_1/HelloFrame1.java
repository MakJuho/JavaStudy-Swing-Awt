package Class_1;

import java.awt.*;
import java.awt.event.*;

public class HelloFrame1 extends Frame implements WindowListener {
	 /* �����ڸ� �����ϰ� Ÿ��Ʋ�� WindowListener�� ����Ѵ�. */
	 public HelloFrame1(){
		  this.setTitle("Hello,AWT");
		  this.addWindowListener(this);
	 }
	 
	 /* paint�� ����Ͽ� ȭ���� 100,100�� ��ġ�� ������ Hello,AWT�� ��´�. */
	 public void paint(Graphics g){
	  g.drawString("Hello,AWT",100,100);
	 }
	 
	  public void windowClosing(WindowEvent e){ 
	        System.out.println("GoodBy...");
	        System.exit(0);
    } 
	  
	    /* ������ �̺�Ʈ �� �������̵� */
	    public void windowActivated(WindowEvent e) { }
	    public void windowClosed(WindowEvent e) { }
	    public void windowDeactivated(WindowEvent e) { }
	    public void windowDeiconified(WindowEvent e) { }
	    public void windowIconified(WindowEvent e) { }
	    public void windowOpened(WindowEvent e) { }
	    
	  
	    
}


