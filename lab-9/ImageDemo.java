import java.awt.*;
import javax.swing.JFrame;

public class ImageDemo extends Canvas
{

	public void paint(Graphics g)
	{

		Toolkit t=Toolkit.getDefaultToolkit();  
        Image i=t.getImage("road.jpg");  
        g.drawImage(i,20,30,this); 

	}

	public static void main(String[] args) 
	{
		ImageDemo im = new ImageDemo();
		JFrame f = new JFrame();
		f.add(im);
		f.setSize(300, 400);
		f.setVisible(true);	
	}
}