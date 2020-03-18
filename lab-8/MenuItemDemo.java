import java.awt.*;

public class MenuItemDemo
{

    MenuItemDemo(){  
        Frame f= new Frame("Menu ");  
        MenuBar mb=new MenuBar();  
        Menu menu=new Menu("Menu1"); 
        Menu menu2=new Menu("Menu2");  
        Menu submenu=new Menu("Sub Menu");  
        MenuItem i1=new MenuItem("Item 1");  
        MenuItem i2=new MenuItem("Item 2");  
        MenuItem i3=new MenuItem("Item 3");  
        MenuItem i4=new MenuItem("Item 4");  
        MenuItem i5=new MenuItem("Item 5");  
        MenuItem i6=new MenuItem("Item 6");  
        MenuItem i7=new MenuItem("Item 7");  
        MenuItem i8=new MenuItem("Item 8");  

        menu.add(i1);  
        menu.add(i2);  
        menu.add(i3); 
        menu2.add(i6);  
        menu2.add(i7);  
        menu2.add(i8);  
        submenu.add(i4);  
        submenu.add(i5);  
        menu.add(submenu);  
        mb.add(menu); 
        mb.add(menu2);  
        f.setMenuBar(mb);  
        f.setSize(500,500);  
        f.setLayout(null);  
        f.setVisible(true);  
}  
public static void main(String args[])  
{  
new MenuItemDemo();  
}  
}