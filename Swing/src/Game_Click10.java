

import java.awt.event.*;
import javax.swing.*;

class Game_Click10 extends JFrame{

    int c=0;
    JLabel[] la=new JLabel[10]; // 10개 라벨 생성

    Game_Click10(){

        this.setTitle("Mini Game");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);


        for(int i=0; i<10; i++){

            // 빈 라벨 생성
            la[i]= new JLabel("");
            // 라벨에 숫자 대입
            la[i].setText(""+i);
            // 라벨 사이즈 지정
            la[i].setSize(15,15);

            // Math.random 0.0 <= x <= 1.0의 난수 발생
            int x=(int)(Math.random()*300); // 0.0 <= x <= 300.0
            int y=(int)(Math.random()*300);

            la[i].setLocation(x,y); // Label 위치 지정
            la[i].addMouseListener(new MyMouseListener()); // Label 마우스 클릭 Event

            this.add(la[i]);
        }

        this.setSize(400,400);
        this.setVisible(true);
    }

    // extends와 implements의 차이점
    // extends : 부모클래스에서 선언/정의를 모두하며 자식은 메소드/변수를 그대로 사용할 수 있음.
    // implements : 부모 객체는 선언만 하며 정의(내용)은 자식에서 오버라이딩 해야함.
    class MyMouseListener implements MouseListener{
        @Override
        public void mouseClicked(MouseEvent e) {
            JLabel a =(JLabel)e.getSource();

            System.out.println("e.getSource():"+e.getSource());
            System.out.println("la[c]:"+la[c]);

            if(la[c]==a){

                a.setVisible(false);
                c++; // 0 1 2 3 4

            }
        }
        // MouseListener 인터페이스의 나머지 4개 메소드도 모두 구현해야 실행됨.
        @Override
        public void mousePressed(MouseEvent e) {
        }
        @Override
        public void mouseReleased(MouseEvent e) {
        }
        @Override
        public void mouseEntered(MouseEvent e) {
        }
        @Override
        public void mouseExited(MouseEvent e) {
        }
    }
    public static void main(String[] args) {
        new Game_Click10();
    }

}


