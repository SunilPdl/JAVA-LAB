import java.awt.*;

class NepalFlag extends Canvas
{
	public void paint(Graphics g)
	{
		g.setColor(Color.BLUE);
			int x[] = {100, 100, 350, 130, 310, 100,100};
			int y[] = {50, 500,500, 270, 270, 50,550};
		g.drawPolygon(x, y, 7);

		g.setColor(Color.RED);
			g.fillPolygon(x, y, 6);

		g.setColor(Color.WHITE);
			g.fillOval(120, 370, 77, 77);
			g.drawArc(120, 147, 57, 67, 0, -180);
			g.drawArc(120, 147, 57, 57, 0, -180);
	}

	public static void main(String[] args) 
	{
		NepalFlag nf = new NepalFlag();

		Frame f = new Frame();

			f.setSize(400, 600);
			f.setVisible(true);
			f.add(nf);
	}
}