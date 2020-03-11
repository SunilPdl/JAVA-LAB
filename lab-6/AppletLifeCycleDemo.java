import java.applet.Applet;
import java.awt.*; 

public class AppletLifeCycleDemo extends Applet
{
	public void init()
	{
		System.out.println("Initialized");
	}
	public void start()
	{
		System.out.println("Starting applet");
	}
	public void paint(Graphics g)
	{
		g.drawString("Hello", 50 , 50);
	}
	public void stop()
	{
		System.out.println("Stopping applet");
	}
	public void destroy()
	{
		System.out.println("Destroyed");
	}
}
//APPLET code="AppletLifeCycleDemo" width="300" height="300">
//<PARAM name="msg" value="hyyy"></APPLET>