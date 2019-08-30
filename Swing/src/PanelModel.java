import javax.swing.*;
import java.awt.*;

public class PanelModel {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Colored Trails");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        JPanel firstPanel = new JPanel();
        firstPanel.setLayout(new GridLayout(4, 4));
        JButton btn;
        for (int i=1; i<=4; i++) {
            for (int j=1; j<=4; j++) {
                btn = new JButton();
                btn.setPreferredSize(new Dimension(500, 100));
                firstPanel.add(btn);
            }
        }

        JPanel secondPanel = new JPanel();
        secondPanel.setLayout(new GridLayout(5, 13));
        for (int i=1; i<=5; i++) {
            for (int j=1; j<=13; j++) {
                btn = new JButton();
                btn.setPreferredSize(new Dimension(100, 100));
                secondPanel.add(btn);
            }
        }

        mainPanel.add(firstPanel);
        mainPanel.add(secondPanel);
        frame.add(mainPanel);

        frame.setSize(400,600);
        frame.setVisible(true);
    }
}