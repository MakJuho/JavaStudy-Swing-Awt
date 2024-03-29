import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class Ex6 extends JFrame{
    GamePanel panel;
    ImageIcon icon = new ImageIcon("C:\\Users\\Admin\\IdeaProjects\\Swing\\src\\images\\airplane.png");
    Image img = icon.getImage() ;
    Image newimg = img.getScaledInstance(40, 40,  java.awt.Image.SCALE_SMOOTH ) ;
    ImageIcon icon2 = new ImageIcon( newimg );
    Ex6(){
        this.setTitle("버블 게임");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new GamePanel();
        this.add(panel);

        this.setLocationRelativeTo(null);
        this.setSize(300,300);
        this.setVisible(true);
        panel.requestFocus();//게임 패널에 포커스를 맞춤
    }

    class GamePanel extends JPanel{
        GamePanel(){
            this.setLayout(null);
            this.addMouseListener(new MouseListener(){
                @Override
                public void mouseClicked(MouseEvent me) {
                }

                @Override
                public void mousePressed(MouseEvent me) {
                    //클릭한 곳의 위치를 알아내고, 그 위치에 대한 스레드 객체를 생성하고 실행
                    int x=me.getX();
                    int y=me.getY();
                    BalloonThread bt= new BalloonThread(x,y);
                    bt.start();
                }

                @Override
                public void mouseReleased(MouseEvent me) {
                }

                @Override
                public void mouseEntered(MouseEvent me) {
                }

                @Override
                public void mouseExited(MouseEvent me) {
                }
            });
        }
    }
    class BalloonThread extends Thread{
        int x,y;
        //마우스 리스너를 통해 입력된 좌표를 받는다.
        BalloonThread(int x, int y){
            this.x=x;
            this.y=y;
        }

        public void run(){
            //좌표에 대한 이미지를 생성한다.
            JLabel la= new JLabel(icon2);
            la.setSize(30,30);
            la.setLocation(x, y);
            la.setOpaque(true);
            panel.add(la);

            while(true){
                int x=la.getX();
                int y=la.getY()-5;//5픽셀씩 위로 올라간다.

                //레이블이 프레임 밖으로 나가면 스레드를 종료
                if(la.getHeight()+30<=0)
                    return;
                    //아니면 계속 올라간다.
                else
                    la.setLocation(x, y);
                try{
                    sleep(20);//0.02초에 5픽셀이동
                }
                catch(Exception e){
                    return;
                }
            }
        }
    }
    public static void main(String[] args) {
        new Ex6();
    }
}

