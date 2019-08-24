
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

/**
 * Created by Yonggu on 2016. 4. 23..
 */
public class StopWatch extends JFrame{
    // ���� ��ü
    private static StopWatch frame = new StopWatch();

    private JPanel rootPanel; // ���� �г�
    private JLabel xBtn; // �ݱ� ��ư
    private JLabel timeText; // �ð� ǥ�� ��
    private JLabel start, pause, stop; // ���� ��ư��

    private TimeThread timeTh; // �ð� ������
    private long time = 0l, preTime = 0l; // �ð� ����� ���� ������

    private int moveX, moveY; // ������ �̵��� �ʱ� ��ǥ

    private Color commonColor = Color.red; // Ŭ���� �� ���ϴ� ����

    public StopWatch(){
// ������ ����
        setSize(400, 300);
        setLayout(new BorderLayout());
        setUndecorated(true);
        setResizable(false);
        consistComponent();
    }

    // ����ƽ �Լ��� ������ ����
    private static void visibleFrame(){
        frame.setVisible(true);
    }

    private void consistComponent(){
// ��Ʈ �г� ����, ��� ����
        rootPanel = new JPanel(new BorderLayout());
        rootPanel.setBackground(Color.black);

// ���� ��ư���� �ִ� �г� ����
        Panel southPanel = createSouthPanel();
        rootPanel.add(southPanel, "South");

// �ð��� ǥ���ϴ� ���� �ִ� �г� ����
        Panel centerPanel = createCenterPanel();
        rootPanel.add(centerPanel, "Center");

// �ݱ� ��ư�� �ִ� �г� ����
        Panel northPanel = createNorthPanel();
        rootPanel.add(northPanel, "North");

// ��Ʈ �г� ����
        setContentPane(rootPanel);
    }

    private Panel createNorthPanel(){
        GridBagConstraints constraints2 = new GridBagConstraints();
        constraints2.anchor = GridBagConstraints.EAST;
        constraints2.gridx = 0; constraints2.gridy = 0;
        constraints2.weightx = 1; constraints2.weighty = 1;

        Panel barPanel= new Panel(new GridBagLayout());
        xBtn = new JLabel(" X ");
        xBtn.setForeground(Color.white);
        xBtn.setOpaque(true);
        xBtn.setBackground(Color.gray);
        xBtn.setFont(new Font("Gothic", Font.BOLD, 30));
        xBtn.addMouseListener(myMouse);

        barPanel.addMouseMotionListener(myMotion);
        barPanel.addMouseListener(myMouse);
        barPanel.add(xBtn, constraints2);

        return barPanel;
    }

    private Panel createCenterPanel(){
        GridBagLayout gridLayout = new GridBagLayout();
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.CENTER;
        constraints.weightx = 1;
        constraints.weighty = 1;
        Panel centerPanel = new Panel(gridLayout);

        timeText = new JLabel(toTime(time));
        timeText.setForeground(Color.white);
        timeText.setFont(new Font("Gothic", Font.BOLD, 50));
        constraints.gridx = 0;
        constraints.gridy = 1;
        centerPanel.add(timeText, constraints);

        JLabel title = new JLabel("�ڹ� ���͵� ��ž��ġ");
        title.setForeground(Color.white);
        title.setFont(new Font("Gothic", Font.BOLD, 30));
        constraints.gridx = 0;
        constraints.gridy = 0;
        centerPanel.add(title, constraints);

        centerPanel.addMouseMotionListener(myMotion);
        centerPanel.addMouseListener(myMouse);

        return centerPanel;
    }

    private Panel createSouthPanel(){
// ���� ��ư�� ����
        start = new JLabel("START");
        pause = new JLabel("PAUSE");
        stop= new JLabel("STOP");

        start.setOpaque(true);
        stop.setOpaque(true);
        pause.setOpaque(true);

        start.setBackground(Color.black);
        pause.setBackground(Color.black);
        stop.setBackground(Color.black);

        start.setForeground(Color.white);
        stop.setForeground(Color.white);
        pause.setForeground(Color.white);

        start.addMouseListener(myMouse);
        pause.addMouseListener(myMouse);
        stop.addMouseListener(myMouse);

        Font font = new Font("Gothic", Font.BOLD, 25);
        start.setFont(font);
        stop.setFont(font);
        pause.setFont(font);

        Panel btnPanel = new Panel(new FlowLayout(FlowLayout.CENTER, 20, 20));
        btnPanel.add(start);
        btnPanel.add(pause);
        btnPanel.add(stop);

        btnPanel.addMouseMotionListener(myMotion);
        btnPanel.addMouseListener(myMouse);

        return btnPanel;
    }

    private void start(){
        if(timeTh == null || !timeTh.isAlive()){
            if(time != 0) preTime = System.currentTimeMillis() - time;
            else preTime = System.currentTimeMillis();
            timeTh = new TimeThread();
            timeTh.start();
        }
    }

    private void pause(){
        if(timeTh == null) return;
        if(timeTh.isAlive()) timeTh.interrupt();
    }

    private void stop(){
        if(timeTh.isAlive()) {
            timeTh.interrupt();
        }
        time = 0l;
        timeText.setText(toTime(time));
    }

    private class TimeThread extends Thread{
        public void run() {
            try {
                while (!Thread.currentThread().isInterrupted()) {
                    sleep(10);
                    time = System.currentTimeMillis() - preTime;
                    timeText.setText(toTime(time));
                }
            } catch (Exception e) {
            }
        }
    }



    private MouseMotionListener myMotion = new MouseMotionListener() {
        public void mouseDragged(MouseEvent e) {
            int mx = getX() + e.getX();
            int my = getY() + e.getY();
            setLocation(mx - moveX, my - moveY);
        }

        public void mouseMoved(MouseEvent e) {
        }
    };

    private MyMouse myMouse = new MyMouse();
    private class MyMouse implements MouseListener{
        public void mouseEntered(MouseEvent e) {
            Object o = e.getSource();

            if(o.equals(xBtn)){
                xBtn.setBackground(commonColor);
            }else if(o.equals(start)){
                start.setForeground(commonColor);
            }else if(o.equals(pause)){
                pause.setForeground(commonColor);
            }else if(o.equals(stop)){
                stop.setForeground(commonColor);
            }
        }

        public void mouseClicked(MouseEvent e) {
        }

        public void mouseExited(MouseEvent e) {
            Object o = e.getSource();
            if(o.equals(xBtn)){
                xBtn.setBackground(Color.gray);
            }else if(o.equals(start)){
                start.setForeground(Color.white);
            }else if(o.equals(pause)){
                pause.setForeground(Color.white);
            }else if(o.equals(stop)){
                stop.setForeground(Color.white);
            }
        }

        public void mousePressed(MouseEvent e) {
            Object o = e.getSource();
            if(o.equals(xBtn)){
                System.exit(0);
            }else if(o.equals(start)){
                start();
            }else if(o.equals(pause)){
                pause();
            }else if(o.equals(stop)){
                stop();
            }else{
                moveX = e.getX();
                moveY = e.getY();
            }
        }

        public void mouseReleased(MouseEvent e) {

        }
    }

    private String toTime(long time){
        int m = (int)(time / 1000.0 / 60.0);
        int s = (int)(time % (1000.0 * 60) / 1000.0);
        int ms = (int)(time % 1000 / 10.0);

        return String.format("%02d : %02d : %02d", m, s, ms);
    }

    public static void main(String args[]){
        visibleFrame();
    }
}