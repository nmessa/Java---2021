/**
 * @(#)GraphicsDemo.java
 *
 * GraphicsDemo application
 *
 * @nmessa 
 * @version 1.00 2017/1/8
 */
import javax.swing.*; //for JFrame
import java.awt.*; //for Graphics and Container

public class GraphicsDemo {
    
    public static void main(String[] args) {
    	JFrame win;
    	Container contentPane;
    	Graphics g;
    	
    	win = new JFrame("My Graphics");
    	win.setSize(600, 600);
    	win.setLocation(100, 100);
    	win.setVisible(true);
    	
    	contentPane = win.getContentPane();
    	g = contentPane.getGraphics();
    	
    	//Add this line if you do not see the rectangle
    	try {Thread.sleep(200);} catch (Exception e) {}
    	
    	g.drawRect(50, 50, 300, 200); //x, y, width, height
    	g.drawLine(0,0,600,600);
    	g.drawRoundRect(200, 280, 200, 100, 30, 30);
    	g.drawOval(100, 400, 200, 150);
    }
}
