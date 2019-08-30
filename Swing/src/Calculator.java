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


@SuppressWarnings("serial") // Warnning 무시
public class Calculator extends JFrame implements ActionListener {

    JPanel jpButton, jpResult; // 패널 초기화
    JMenuBar jmb; // 메뉴바 초기화
    JMenu jmEdit, jmHelp; // 메뉴 초기화
    JMenuItem mCopy, mPaste, mHelp, mInfo; // 메뉴 아이템 초기화
    JLabel jlbResult1, jlbResult2; // 레이블 초기화
    JButton[] jbButton = null; // 버튼배열 초기화
    String result="";
    String result1="";
    String result2="";
    String number[] = {" ", " ", " "};
    String[] numStr = { "←", "CE", "C", "/",
            "7", "8", "9", "*",
            "4", "5", "6", "-",
            "1", "2", "3", "+",
            "0", "00", ".", "=" }; // 버튼에 들어갈 값

    public Calculator(){

        super("계산기 by 세이나린"); // 타이틀 바
        getContentPane().setLayout(new BorderLayout()); // 전체 레이아웃을 BorderLayout

        /** 메뉴바 시작*/
        jmb = new JMenuBar();

        //		jmEdit = new JMenu("편집(E)");
        //		jmHelp = new JMenu("도움말(H)");

        //		mCopy = new JMenuItem("복사");
        //		mPaste = new JMenuItem("붙여넣기");
        //		mHelp = new JMenuItem("도움말 보기");
        //		mInfo = new JMenuItem("계산기 정보");

        //		jmEdit.add(mCopy); // jmEdit라는 메뉴에 mCopy라는 메뉴아이템 추가
        //		jmEdit.add(mPaste); // jmEdit라는 메뉴에 mPaste라는 메뉴아이템 추가
        //		jmHelp.add(mHelp); // jmHelp라는 메뉴에 mHelp라는 메뉴아이템 추가
        //		jmHelp.add(mInfo); // jmHelp라는 메뉴에 mInfo라는 메뉴아이템 추가

        //		jmb.add(jmEdit); // jmb라는 메뉴바에 jmEdit라는 메뉴 추가
        //		jmb.add(jmHelp); // jmb라는 메뉴바에 jmHelp라는 메뉴 추가

        //		setJMenuBar(jmb); // jmb메뉴바 추가
        /** 메뉴바 끝 */

        /** 레이블 시작 */
        jpResult = new JPanel(new GridLayout(2,1)); // jpResult라는 패널에 GrideLayot을 적용, 2 x 1
        jpResult.setBackground(Color.WHITE); // jpResult라는 패널에 흰색 배경적용
        jlbResult1 = new JLabel("", JLabel.RIGHT); // jlbResult1라는 값 없는 레이블, 우측정렬
        jlbResult2 = new JLabel("0", JLabel.RIGHT); // jlbResult2라는 기본값 0인 레이블, 우측정렬
        jlbResult2.setFont(new Font("굴림", Font.BOLD, 20)); // jlbResult2 레이블에 폰트는 굴림, 진하게, 크게20 적용

        jpResult.add(jlbResult1); // jpResult 패널에 jlbResult1 레이블 추가
        jpResult.add(jlbResult2); // jpResult 패널에 jlbResult2 레이블 추가
        /** 레이블 끝 */

        /** 버튼 시작 */
        jpButton = new JPanel(new GridLayout(5, 4, 5, 5)); // jpButton라는 패널, GridLayout적용, 5 x 4, 간격은 가로세로 5씩
        jpButton.setBackground(Color.WHITE); // jpButton 패널 배경은 흰색
        jbButton = new JButton[numStr.length]; // jbButton 버튼 배열 초기화

        // jbButton에 표기할 값들 적용
        for(int i=0; i<numStr.length; i++) {
            jbButton[i] = new JButton(numStr[i]);
            jbButton[i].setFont(new Font("굴림", Font.BOLD, 20));
            jpButton.add(jbButton[i]);
            jbButton[i].addActionListener(this);
        }

        /** 버튼 색 시작 */
        for(int j=0; j<numStr.length; j++) {
            if(j < 3) {
                jbButton[j].setForeground(Color.RED);
            }else if(j==3 || j==7 || j==11 || j==15 || j==19) {
                jbButton[j].setForeground(Color.BLUE);
            }
        }
        jbButton[0].setForeground(Color.RED);
        /** 버튼 색 끝 */

        /** 버튼 단축키 시작 */
        //		jmEdit.setMnemonic('E');
        //		jmHelp.setMnemonic('H');

        //		mCopy.setAccelerator(KeyStroke.getKeyStroke('C', InputEvent.CTRL_MASK));
        //		mPaste.setAccelerator(KeyStroke.getKeyStroke('V', InputEvent.CTRL_MASK));
        //		mHelp.setAccelerator(KeyStroke.getKeyStroke('H', InputEvent.CTRL_MASK));
        //		mInfo.setAccelerator(KeyStroke.getKeyStroke('I', InputEvent.CTRL_MASK));
        /** 버튼 단축키 끝 */

        //		mCopy.addActionListener(this);
        //		mPaste.addActionListener(this);
        //		mHelp.addActionListener(this);
        //		mInfo.addActionListener(this);
        //		/** 버튼 끝 */


        getContentPane().add("North", jpResult);
        getContentPane().add("Center", jpButton);
        setSize(300, 400);
        getContentPane().setBackground(Color.WHITE);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /** 버튼 이벤트 시작 */
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
        } else if(txtButton.equals("←")) {
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
                    if("0으로 나눌 수 없습니다.".equals(result)) {
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

                if("0으로 나눌 수 없습니다.".equals(result)) {
                    jlbResult2.setText(result);
                    result="";
                    result1="";
                    result2 = "";
                    number[0] = " ";
                    number[1] = " ";
                    number[2] = " ";
                } else {
                    result = Cal();

                    if(!"0으로 나눌 수 없습니다.".equals(result)) {
                        result1 = "";
                        number[0] = result;
                        jlbResult2.setText(result);
                        jlbResult1.setText(result1);
                        result2 = "";
                    } else {
                        jlbResult2.setText("0으로 나눌 수 없습니다.");
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
    /** 버튼 이벤트 끝 */

    /** 계산 메소드 시작 */
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
                    num = "0으로 나눌 수 없습니다.";
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
    /** 계산 메소드 끝 */

    public static void main(String[] args) {
        new Calculator();
    }
}
