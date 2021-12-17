/**
 * @(#)GraphicsDemo2.java
 *
 * GraphicsDemo2 application
 *
 * @author 
 * @version 1.00 2017/1/8
 */
import javax.swing.*; //For JFrame
import java.awt.*;	//For Container and Graphics

public class GraphicsDemo2 {
    
    public static void main(String[] args) {
    	
    	JFrame    win;
        Container contentPane;
        Graphics  g;

        win = new JFrame("Rectangles");
        win.setSize(600, 600);
        win.setLocation(100,100);
        win.setVisible(true); 
        
        contentPane = win.getContentPane();
        contentPane.setBackground(Color.WHITE);

		//add this line if you do not see rectangles
        try {Thread.sleep(200);} catch (Exception e) {}
    
        g = contentPane.getGraphics();
        g.setColor(Color.blue);
        g.drawRect(150,150,100,80);

        g.setColor(Color.red);
        g.fillRect(375,150,100,80);
    }
}
