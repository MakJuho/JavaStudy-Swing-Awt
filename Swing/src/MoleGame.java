import java.util.*;

import javax.swing.*;

import javax.swing.Timer;

import java.awt.*;

import java.awt.event.*;


public class MoleGame extends JFrame
{
    View m_view;

    public MoleGame()
    {
        m_view = new View();

        setTitle("두더지잡기 게임");

        add(m_view);

        setSize(View.garo+15,View.sero+40);

        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //종료버튼활성화

    }

    public static void main(String[] args)
    {
        MoleGame t = new MoleGame();
    }
}



class View extends JPanel implements ActionListener, MouseListener //상속받는다
{
    Timer one;

    Timer two;

    mole m;

    int score;

    int time=5;

    public static final int garo=500, sero=600;



    public View()
    {

        m = new mole(garo,sero);


        addMouseListener(this); //마우스이벤트추가


        one = new Timer(600,this);

        two = new Timer(1000,this);



        one.start();

        two.start();


    }


    public void actionPerformed(ActionEvent e)
    {
        if(one==e.getSource())
        {
            m.next(); //시간마다 두더지 이동

            repaint(); // 다시그린다

        }

        if(two==e.getSource())
        {

            time= m.count(time); //초새는거

            repaint();
        }
        if(time < 1 ){
            one.stop();
            two.stop();
            JOptionPane.showMessageDialog(this,"시간초과^^*","GAME OVER!",JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }

        if(score > 30000 ){
            one.stop();
            two.stop();
            JOptionPane.showMessageDialog(this,"이기셨습니다.^^*","GAME OVER!",JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }

    }





    public void mousePressed(MouseEvent e)
    {
        int temp;

        temp= m.check(e.getX(),e.getY());



        score = temp + score;


        repaint();





    }






    public void mouseReleased(MouseEvent e){ }

    public void mouseExited(MouseEvent e){ }

    public void mouseEntered(MouseEvent e){ }

    public void mouseClicked(MouseEvent e){ }


    public void paint(Graphics g)
    {
        paintComponent(g); //초기화


        g.drawRect(2,2,garo,sero); //사각형을 그리는작업

        g.drawString("점수: "+score,10,20); // 점수를 표기

        g.drawString("남은시간: "+time,90,20); // 점수를 표기


        m.paint(g); //여기서의 제너릭으로 표현

    }

}

class mole extends JFrame
{
    Rectangle rec;

    Random ran;

    int cx,cy;

    ImageIcon icon = new ImageIcon("C:\\Users\\Admin\\IdeaProjects\\Swing\\src\\images\\image01.jpg");
    Image img = icon.getImage();

    public mole(int x,int y)
    {
        rec = new Rectangle(10,10,50,50);

        ran = new Random();

        cx = x;

        cy = y;

    }

    public void paint(Graphics g)
    {

//        super.paintComponents(g);
        g.drawImage(img, 0,0,this.getWidth(),this.getHeight(), this );

//        g.drawRect(rec.x,rec.y,rec.width,rec.height);
    }

    public void next()
    {
        rec.x=ran.nextInt(cx)-30;
        rec.y=ran.nextInt(cy)-30;

    }

    public int check(int x, int y)
    {
        int temp=0;

        if(rec.contains(x,y)==true)
        {
            temp = 1000;
        }

        return temp;
    }

    public int count(int time){
        time =  time - 1;
        return time;
    }


}