import java.awt.*;
import javax.swing.*;
public class GSME extends JFrame{
	int x=50;
	int y=50;
	boolean right=true;
	Image ball=Toolkit.getDefaultToolkit().getImage("pic/2.png");
	Image desk=Toolkit.getDefaultToolkit().getImage("pic/1.png");
	//画窗口
	public void paint(Graphics g) {
		System.out.println("被画了一次");
		g.drawImage(desk,10,20,null);
		g.drawImage(ball,x,y,null);
		if(right)
		{x=x+2;}else
		{x=x-2;}
		if(x<20)
		{right=true;} if
		(x>360)
		{right=false;}
			
	}
	//加载窗口
	void launchFrame() {
	setSize(405,250);
	setLocation(150,150);
	setVisible(true);
	
	//重新画窗口
	while(true) {
		repaint();
		try {
			Thread.sleep(40);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	}	
	
	public static void main(String[] args) {
		GSME s=new GSME();
		s.launchFrame();
	}

}
