import java.awt.*;
import javax.swing.*;

public class GSME extends JFrame{
	private int x=50;
	private boolean right=true;
	private Image ball=Toolkit.getDefaultToolkit().getImage("pic/2.png");
	private Image desk=Toolkit.getDefaultToolkit().getImage("pic/1.png");

	public void paint(Graphics g) {
		System.out.println("������һ��");
		g.drawImage(desk,10,20,null);
		int y;
		y = 50;
		g.drawImage(ball,x, y,null);
		if(right)
		{x=x+2;}else
		{x=x-2;}
		if(x<20)
		{right=true;} if
		(x>360)
		{right=false;}
			
	}

	private void launchFrame() {
	setSize(405,250);
	setLocation(150,150);
	setVisible(true);


		do {
			repaint();
			try {
				Thread.sleep(40);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} while (true);
	}	
	
	public static void main(String[] args) {
		GSME s=new GSME();
		s.launchFrame();
	}

}
