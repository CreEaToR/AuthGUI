import java.awt.Graphics;
import javax.swing.JApplet;


public class TicTacToe extends JApplet {
	

	public void paint(Graphics grid){
		
		grid.drawLine(1, 15000, 50, 1);
		grid.drawLine(1, 15000, 125, 1);
		grid.drawLine(15000, 1, 1, 125);
		grid.drawLine(15000, 1, 1, 50);
		grid.drawOval(1, 1, 40, 40);
		grid.drawOval(150, 1, 40, 40);
		grid.drawOval(150, 150, 40, 40);
		grid.drawLine(125, 1, 50, 50);
		grid.drawLine(60, 1, 125, 50);
		grid.drawLine(50,50,125,125);
		grid.drawLine(50,125,125, 50);
		grid.drawLine(125, 125, 50, 200);
		grid.drawLine(50,125,100,200);
	}
	
}