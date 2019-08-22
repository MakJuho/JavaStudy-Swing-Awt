package Class_1;

import java.awt.Frame;
 
// Frame 상속해서 
public class FrameTest extends Frame
{
    public FrameTest()
    {
        super("두 번째 프레임입니다.");
        setBounds(100, 100, 300, 300);
        setVisible(true);
    }
}
