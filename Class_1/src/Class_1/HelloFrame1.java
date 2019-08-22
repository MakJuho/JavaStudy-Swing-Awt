package Class_1;

import java.awt.*;
import java.awt.event.*;

public class HelloFrame1 extends Frame implements WindowListener {
	 /* 생성자를 정의하고 타이틀과 WindowListener를 등록한다. */
	 public HelloFrame1(){
		  this.setTitle("Hello,AWT");
		  this.addWindowListener(this);
	 }
	 
	 /* paint를 사용하여 화면의 100,100의 위치에 무조건 Hello,AWT를 찍는다. */
	 public void paint(Graphics g){
	  g.drawString("Hello,AWT",100,100);
	 }
	 
	  public void windowClosing(WindowEvent e){ 
	        System.out.println("GoodBy...");
	        System.exit(0);
    } 
	  
	    /* 나머지 이벤트 빈 오버라이딩 */
	    public void windowActivated(WindowEvent e) { }
	    public void windowClosed(WindowEvent e) { }
	    public void windowDeactivated(WindowEvent e) { }
	    public void windowDeiconified(WindowEvent e) { }
	    public void windowIconified(WindowEvent e) { }
	    public void windowOpened(WindowEvent e) { }
	    
	  
	    
}


