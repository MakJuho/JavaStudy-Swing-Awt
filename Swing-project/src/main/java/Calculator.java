import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.KeyStroke;


@SuppressWarnings("serial") // Warnning ����
public class Calculator extends JFrame implements ActionListener {

    JPanel jpButton, jpResult; // �г� �ʱ�ȭ
    JMenuBar jmb; // �޴��� �ʱ�ȭ
    JMenu jmEdit, jmHelp; // �޴� �ʱ�ȭ
    JMenuItem mCopy, mPaste, mHelp, mInfo; // �޴� ������ �ʱ�ȭ
    JLabel jlbResult1, jlbResult2; // ���̺� �ʱ�ȭ
    JButton[] jbButton = null; // ��ư�迭 �ʱ�ȭ
    String result="";
    String result1="";
    String result2="";
    String number[] = {" ", " ", " "};
    String[] numStr = { "��", "CE", "C", "/",
            "7", "8", "9", "*",
            "4", "5", "6", "-",
            "1", "2", "3", "+",
            "0", "00", ".", "=" }; // ��ư�� �� ��

    public Calculator(){

        super("���� by ���̳���"); // Ÿ��Ʋ ��
        getContentPane().setLayout(new BorderLayout()); // ��ü ���̾ƿ��� BorderLayout

        /** �޴��� ����*/
        jmb = new JMenuBar();

        //		jmEdit = new JMenu("����(E)");
        //		jmHelp = new JMenu("����(H)");

        //		mCopy = new JMenuItem("����");
        //		mPaste = new JMenuItem("�ٿ��ֱ�");
        //		mHelp = new JMenuItem("���� ����");
        //		mInfo = new JMenuItem("���� ����");

        //		jmEdit.add(mCopy); // jmEdit��� �޴��� mCopy��� �޴������� �߰�
        //		jmEdit.add(mPaste); // jmEdit��� �޴��� mPaste��� �޴������� �߰�
        //		jmHelp.add(mHelp); // jmHelp��� �޴��� mHelp��� �޴������� �߰�
        //		jmHelp.add(mInfo); // jmHelp��� �޴��� mInfo��� �޴������� �߰�

        //		jmb.add(jmEdit); // jmb��� �޴��ٿ� jmEdit��� �޴� �߰�
        //		jmb.add(jmHelp); // jmb��� �޴��ٿ� jmHelp��� �޴� �߰�

        //		setJMenuBar(jmb); // jmb�޴��� �߰�
        /** �޴��� �� */

        /** ���̺� ���� */
        jpResult = new JPanel(new GridLayout(2,1)); // jpResult��� �гο� GrideLayot�� ����, 2 x 1
        jpResult.setBackground(Color.WHITE); // jpResult��� �гο� ��� �������
        jlbResult1 = new JLabel("", JLabel.RIGHT); // jlbResult1��� �� ���� ���̺�, ��������
        jlbResult2 = new JLabel("0", JLabel.RIGHT); // jlbResult2��� �⺻�� 0�� ���̺�, ��������
        jlbResult2.setFont(new Font("����", Font.BOLD, 20)); // jlbResult2 ���̺� ��Ʈ�� ����, ���ϰ�, ũ��20 ����

        jpResult.add(jlbResult1); // jpResult �гο� jlbResult1 ���̺� �߰�
        jpResult.add(jlbResult2); // jpResult �гο� jlbResult2 ���̺� �߰�
        /** ���̺� �� */

        /** ��ư ���� */
        jpButton = new JPanel(new GridLayout(5, 4, 5, 5)); // jpButton��� �г�, GridLayout����, 5 x 4, ������ ���μ��� 5��
        jpButton.setBackground(Color.WHITE); // jpButton �г� ����� ���
        jbButton = new JButton[numStr.length]; // jbButton ��ư �迭 �ʱ�ȭ

        // jbButton�� ǥ���� ���� ����
        for(int i=0; i<numStr.length; i++) {
            jbButton[i] = new JButton(numStr[i]);
            jbButton[i].setFont(new Font("����", Font.BOLD, 20));
            jpButton.add(jbButton[i]);
            jbButton[i].addActionListener(this);
        }

        /** ��ư �� ���� */
        for(int j=0; j<numStr.length; j++) {
            if(j < 3) {
                jbButton[j].setForeground(Color.RED);
            }else if(j==3 || j==7 || j==11 || j==15 || j==19) {
                jbButton[j].setForeground(Color.BLUE);
            }
        }
        jbButton[0].setForeground(Color.RED);
        /** ��ư �� �� */

        /** ��ư ����Ű ���� */
        //		jmEdit.setMnemonic('E');
        //		jmHelp.setMnemonic('H');

        //		mCopy.setAccelerator(KeyStroke.getKeyStroke('C', InputEvent.CTRL_MASK));
        //		mPaste.setAccelerator(KeyStroke.getKeyStroke('V', InputEvent.CTRL_MASK));
        //		mHelp.setAccelerator(KeyStroke.getKeyStroke('H', InputEvent.CTRL_MASK));
        //		mInfo.setAccelerator(KeyStroke.getKeyStroke('I', InputEvent.CTRL_MASK));
        /** ��ư ����Ű �� */

        //		mCopy.addActionListener(this);
        //		mPaste.addActionListener(this);
        //		mHelp.addActionListener(this);
        //		mInfo.addActionListener(this);
        //		/** ��ư �� */


        getContentPane().add("North", jpResult);
        getContentPane().add("Center", jpButton);
        setSize(300, 400);
        getContentPane().setBackground(Color.WHITE);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /** ��ư �̺�Ʈ ���� */
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        String txtButton = e.getActionCommand();

        if(txtButton.equals("1") || txtButton.equals("2") || txtButton.equals("3") || txtButton.equals("4") || txtButton.equals("5") || txtButton.equals("6")
                || txtButton.equals("7") || txtButton.equals("8") || txtButton.equals("9")) {
            if(result2.equals("0")) {
                result2="";
            }
            result2+=txtButton;
            jlbResult2.setText(result2);
        } else if(txtButton.equals("��")) {
            int len = jlbResult2.getText().length();
            if(len==1) {
                result2 = "";
                jlbResult2.setText("0");
            } else {
                if(!"".equals(result2)) {
                    result2 = result2.substring(0, len-1);
                    jlbResult2.setText(result2);
                }
            }
        } else if(txtButton.equals("CE")) {
            result2 = "";
            result="";
            jlbResult2.setText("0");
            number[0] = "0";
        } else if(txtButton.equals("C")) {
            result="";
            result1="";
            result2="";
            jlbResult1.setText("");
            jlbResult2.setText("0");
            number[0] = " ";
            number[1] = " ";
            number[2] = " ";
        } else if(txtButton.equals("0") || txtButton.equals("00")) {
            if(!("".equals(result2))) {
                if(!"0".equals(result2)){
                    result2+=txtButton;
                    jlbResult2.setText(result2);
                }
            } else {
                result2 = "0";
            }
        } else if(txtButton.equals(".")) {
            if("".equals(result2)) {
                result2="0"+txtButton;
            } else {
                if(result2.indexOf(".")==-1) {
                    result2 += txtButton;
                }
            }
            jlbResult2.setText(result2);
        } else if(txtButton.equals("=")) {
            if(!"".equals(result2)) {
                number[2] = result2;
            }
            if("".equals(result1)) {
                if(!number[1].equals(" ")) {
                    result = Cal();
                    if("0���� ���� �� �����ϴ�.".equals(result)) {
                        result="";
                        result1="";
                        result2 = "";
                        number[0] = " ";
                        number[1] = " ";
                        number[2] = " ";
                    } else {
                        number[0] = result;
                        jlbResult2.setText(result);
                    }
                }
                jlbResult1.setText(result1);
            } else {
                if(" ".equals(number[2])) {
                    number[2] = result2;
                }
                result = number[0];

                if("0���� ���� �� �����ϴ�.".equals(result)) {
                    jlbResult2.setText(result);
                    result="";
                    result1="";
                    result2 = "";
                    number[0] = " ";
                    number[1] = " ";
                    number[2] = " ";
                } else {
                    result = Cal();

                    if(!"0���� ���� �� �����ϴ�.".equals(result)) {
                        result1 = "";
                        number[0] = result;
                        jlbResult2.setText(result);
                        jlbResult1.setText(result1);
                        result2 = "";
                    } else {
                        jlbResult2.setText("0���� ���� �� �����ϴ�.");
                        jlbResult1.setText("");
                        result="";
                        result1="";
                        result2 = "";
                        number[0] = " ";
                        number[1] = " ";
                        number[2] = " ";
                    }
                    System.out.println("?");
                }
            }
        } else if(txtButton.equals("/") || txtButton.equals("*") || txtButton.equals("-") || txtButton.equals("+")) {
            if("".equals(result1)) {
                if("".equals(result2)) {
                    if("".equals(result)) {
                        result1 = "0" + txtButton;
                        number[0] = "0";
                    } else {
                        result1 = result + txtButton;
                    }
                } else {
                    if(!"".equals(result)) {
                        result1 = result + txtButton;
                    }
                    result1 = result2 + txtButton;
                    number[0] = result2;
                }
                number[1] = txtButton;
            } else {
                if("".equals(result2)) {
                    result1 = result1.substring(0, result1.length()-1) + txtButton;
                    number[1] = txtButton;
                } else {
                    result1 += result2 + txtButton;
                    number[2] = result2;
                    result = Cal();
                    number[1] = txtButton;
                    jlbResult2.setText(result);
                    number[0] = result;
                }
            }
            if(number[1].equals("/") && (number[2].equals(" 0") || number[2].equals("0"))) {

            } else {
                result2 = "";
                jlbResult1.setText(result1);
            }

        }
    }
    /** ��ư �̺�Ʈ �� */

    /** ��� �޼ҵ� ���� */
    public String Cal() {
        String num = "";
        String testNum1 = "";
        String testNum2 = "";

        if(number[0].indexOf(".")!=-1) {
            int index1 = number[0].indexOf(".");

            testNum1 = number[0].substring(index1, number[0].length());

            if(testNum1.replaceAll("0", "").equals(".")){
                number[0] = number[0].substring(0, index1);
            }
        }

        if(number[2].indexOf(".")!=-1) {
            int index2 = number[2].indexOf(".");

            testNum2 = number[2].substring(index2, number[2].length());

            if(testNum2.replaceAll("0", "").equals(".")){
                number[2] = number[2].substring(0, index2);
            }
        }
        if(number[1].equals("*")) {
            if(number[0].indexOf(".")!=-1 || number[2].indexOf(".")!=-1) {
                num = (Double.parseDouble(number[0]) * Double.parseDouble(number[2])) + "";
            } else {
                if("".equals(number[2])){
                    num = result2;
                } else {
                    if(!"".equals(result)) {
                        number[0] = result;
                    }
                    num = (Long.parseLong(number[0]) * Long.parseLong(number[2])) + "";
                    result = num;
                    number[0] = result;
                }
            }
        } else if(number[1].equals("+")) {
            if(number[0].indexOf(".")!=-1 || number[2].indexOf(".")!=-1) {
                num = (Double.parseDouble(number[0]) + Double.parseDouble(number[2])) + "";
            } else {
                if("".equals(number[2])){
                    num = result2;
                } else {
                    if(!"".equals(result)) {
                        number[0] = result;
                    }
                    num = (Long.parseLong(number[0]) + Long.parseLong(number[2])) + "";
                    result = num;
                    number[0] = result;
                }
            }
        } else if(number[1].equals("-")) {
            if(number[0].indexOf(".")!=-1 || number[2].indexOf(".")!=-1) {
                num = (Double.parseDouble(number[0]) - Double.parseDouble(number[2])) + "";
            } else {
                if("".equals(number[2])){
                    num = result2;
                } else {
                    if(!"".equals(result)) {
                        number[0] = result;
                    }
                    num = (Long.parseLong(number[0]) - Long.parseLong(number[2])) + "";
                    result = num;
                    number[0] = result;
                }
            }
        } else if(number[1].equals("/")) {
            number[2].trim();
            if(number[0].indexOf(".")!=-1 || number[2].indexOf(".")!=-1) {
                num = (Double.parseDouble(number[0]) / Double.parseDouble(number[2])) + "";
            } else {
                if(number[2].equals("0")) {
                    num = "0���� ���� �� �����ϴ�.";
                    result2 = "";
                } else {
                    if("".equals(number[2])){
                        num = result2;
                    } else {
                        if(!"".equals(result)) {
                            number[0] = result;
                        }
                        num = (Double.parseDouble(number[0]) / Double.parseDouble(number[2])) + "";

                        if(num.indexOf(".")!=-1) {
                            int index3 = num.indexOf(".");
                            String testNum3 = num.substring(index3, num.length());
                            if(testNum3.replaceAll("0", "").equals(".")){
                                num = num.substring(0, index3);
                            }
                        }
                        result = num;
                        number[0] = result;
                    }
                }
            }
        }
        return num;
    }
    /** ��� �޼ҵ� �� */

    public static void main(String[] args) {
        new Calculator();
    }
}
