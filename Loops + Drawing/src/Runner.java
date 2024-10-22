import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Runner extends JPanel{
	
	// Practice using Loops, random #s and 
	// methods
	public void paint(Graphics g) {
		
		Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(5));
        
		 
		//1) draw a concentric rectangle that's 10pixels from all sides of the "gray"
		//portion of the GUI
		g2.drawRect(10, 10, 765, 540);
		
		
		//2) Draw a horizontal line to bisect the Rectangle
		g2.drawLine(10, 270, 770, 270);
		
		
		//3) Draw a vertical line to bisect the shape again
		g2.drawLine(765/2, 10, 765/2,550 );
		
		
		//4) small rectangles on top-left
		g2.drawLine(765/4, 10, 765/4, 550/2-10);
		
		
		/* 
		 * int var = 0; 						<---- control variable
		 * while(var < 10){ 					<---- condition to run the loop
		 *   
		 *   //any repeating code
		 *   
		 *   var++;								<---- update control variable
		 *   
		 * }
		 */
		
		// 10, 10, 
		int var = 0;
		while(var < 100) {
			int x1 = (int) (Math.random() * (765/2-10 - 15 + 1) ) + 15;
			int y1 = (int) (Math.random() * (550/2-10 - 15 + 1) ) + 15;
			int x2 = (int) (Math.random() * (765/2-10 - 15 + 1) ) + 15;
			int y2 = (int) (Math.random() * (550/2-10 - 15 + 1) ) + 15;
			
			int red = (int) (Math.random() * (255 + 1) );		
			int green = (int) (Math.random() * (255 + 1) );
			int blue = (int) (Math.random() * (255 + 1) );
			
			g.setColor( new Color(red, green, blue));
			g2.drawLine(x1, y1, x2, y2);
			var++;
		}
		
		int var2 = 0;
		while(var2 < 100) {
			int x1 = (int) (Math.random() * (755/2-10 - 15 + 1) ) + 15;
			int y1 = (int) (Math.random() * (510 - 275 + 1) ) + 275;
			int d = (int) (Math.random() * (200 - 5 + 1) );

			// Find out how close x1 is to the right edge.
			int distanceX = (765-10)/2 - x1;
			// Find out how close y1 is to the bottom edge.
			int distanceY = 540 - y1;
			
			// Make sure circle diameter is not larger than distance to edge.
			if (d >= distanceX) {
				d = distanceX - 5;
			}
			if (d >= distanceY) {
				d = distanceY - 5;
			}
		
			int red = (int) (Math.random() * (255 + 1) );
			int green = (int) (Math.random() * (255 + 1) );
			int blue = (int) (Math.random() * (255 + 1) );
			
			g.setColor( new Color(red, green, blue));
			g2.drawOval(x1, y1, d, d);
			var2++;
		}
		
		//(int)(Math.random()*(max-min+1))+min
		
		int var3 = 0;
		while(var3 < 100) {
			int x1 = (int) (Math.random() * (765-60 - 765/2+5 + 1) ) + 765/2+5;
			int y1 = (int) (Math.random() * (550/2-60 - 15 + 1) ) + 15;
			
			int red = (int) (Math.random() * (255 + 1) );
			int green = (int) (Math.random() * (255 + 1) );
			int blue = (int) (Math.random() * (255 + 1) );
			
			g.setColor( new Color(red, green, blue));
			g2.fillRect(x1, y1, 50, 50);

			var3++;
		}
	
	
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] arg) {
		Runner m = new Runner();
	}
	
	public Runner() {
		JFrame f = new JFrame("Method Use");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(800,600);
		f.add(this);
		f.setVisible(true);
		
	}
}
