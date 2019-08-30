import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TestSwing {

    public static void main(String[] args) {
        JFrame fr = new JFrame("?");
        JPanel pn = new JPanel();
        JLabel lbl = new JLabel("왜안되");

        pn.setLayout(new GridLayout(1, 1));
        pn.add(lbl);

        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setContentPane(pn);

        fr.setSize(500, 500);
        fr.setVisible(true);
    }
}