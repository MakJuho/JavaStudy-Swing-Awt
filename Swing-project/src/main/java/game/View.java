import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;


public class View extends JPanel
				implements MouseListener, ActionListener
{
	final int WIDTH_COUNT;
	final int HEIGHT_COUNT;
	
	int[][] mData;
	int mStartNumber;
	int mNextNumber;
	
	Random mRandom = new Random();
	
	
	Timer mTimer = new Timer(1000, this);
	int mTime = 20;
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(mTimer == arg0.getSource())
		{
			mTime--;
			if(mTime <= 0)
			{
				mTimer.stop();
				JOptionPane.showMessageDialog(this, "GameOver", "info", JOptionPane.INFORMATION_MESSAGE);
			}
			repaint();
		}
	}
	
	public void mixNumber(int count)
	{
		int dx = 0;
		int dy = 0;
		
		for(int i=0; i<count; i++)
		{
			int dir = mRandom.nextInt(4);
			
			switch(dir)
			{
			case 0:
				if(checkMove(dx, dy, dx-1, dy))
				{
					dx--;
				}
				break;
			case 1:
				if(checkMove(dx, dy, dx+1, dy))
				{
					dx++;
				}
				break;
			case 2:
				if(checkMove(dx, dy, dx, dy-1))
				{
					dy--;
				}
				break;
			case 3:
				if(checkMove(dx, dy, dx, dy+1))
				{
					dy++;
				}
				break;
				default:
					break;
			}
		}
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub

		//paintComponent(g);
		super.paint(g);
		
		drawMap(g);
		drawNumber(g);
		
		String msg = "time: " + mTime;
		g.setFont(g.getFont().deriveFont(15.0f));
		g.drawString(msg, 510, 20);
	}

	public boolean checkMove(int sx, int sy, int dx, int dy)
	{
		if(sx < 0 || sy < 0 || dx < 0 || dy < 0)
		{
			return false;
		}
		if(WIDTH_COUNT <= sx || HEIGHT_COUNT <= sy || WIDTH_COUNT <= dx || HEIGHT_COUNT <= dy)
		{
			return false;
		}
		
		int tmp = mData[dy][dx];
		
		mData[dy][dx] = mData[sy][sx];
		mData[sy][sx] = tmp;
		
		return true;
	}
	
	public View()
	{
		WIDTH_COUNT = 5;
		HEIGHT_COUNT = 5;
		
		mData = new int[HEIGHT_COUNT][WIDTH_COUNT];

		mStartNumber = 1;
		mNextNumber = 1;
		for(int y=0; y<HEIGHT_COUNT; y++)
		{
			for(int x=0; x<WIDTH_COUNT; x++)
			{
				mData[y][x] = mNextNumber;
				mNextNumber++;
			}
		}
		
		mixNumber(1000);
		
		addMouseListener(this);
		mTimer.start();
	}
	
	public void drawNumber(Graphics g)
	{
		int xpos;
		int ypos;
		
		for(int y=0; y<HEIGHT_COUNT; y++)
		{
			for(int x=0; x<WIDTH_COUNT; x++)
			{
				xpos = x * 100 + 40;
				ypos = y * 100 + 60;
				
				String msg = "" + mData[y][x];
				
				g.setFont(g.getFont().deriveFont(30.0f));
				g.drawString(msg, xpos, ypos);
			}
		}
	}
	
	public void drawMap(Graphics g)
	{
		int xpos, ypos;
		
		for(int y=0; y<HEIGHT_COUNT; y++)
		{
			for(int x=0; x<WIDTH_COUNT; x++)
			{
				xpos = x * 100;
				ypos = y * 100;
				g.drawRect(xpos, ypos, 100, 100);
			}
		}
	}
	
	public void ClickNumber(int x, int y)
	{
		if(mData[y][x] == mStartNumber)
		{
			mData[y][x] = mNextNumber;
			mNextNumber++;
			mStartNumber++;
		
			repaint();
		}
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) 
	{
		// TODO Auto-generated method stub
		for(int y=0; y<HEIGHT_COUNT; y++)
		{
			for(int x=0; x<WIDTH_COUNT; x++)
			{
				Rectangle r = new Rectangle(x*100, y*100, 100, 100);
				if(r.contains(e.getX(), e.getY()))
				{
					ClickNumber(x, y);
				}
			}
		}
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
