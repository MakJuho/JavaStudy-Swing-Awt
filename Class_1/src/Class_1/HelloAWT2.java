package Class_1;

import java.awt.Frame;

public class HelloAWT2 {
	 public static void main(String args[]){

   	  /* 프레임 객체 생성 */
   	  Frame f = new HelloFrame1();

   	  /* 생성된 프레임 객체의 크기를 300,200으로 정의 */
   	  f.setSize(300,200);

   	  /* 생성된 프레임을 보여주기 */
   	  f.setVisible(true);
   	 }
}
