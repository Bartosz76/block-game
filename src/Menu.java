import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Menu extends MouseAdapter{
	
	public void mousePressed(MouseEvent r) {
		
	}
	
	public void mouseReleased(MouseEvent r) {
		
	}
	
	public void tick() {
		
	}
	
	public void render(Graphics g) {
		
		Font fnt = new Font("arial", 1, 50);
		Font fnt2 = new Font("arial", 1, 30);
		
		g.setFont(fnt);
		g.setColor(Color.DARK_GRAY);
		g.drawString("Menu", 240, 70);
		
		g.setFont(fnt2);
		g.drawRect(210, 150, 200, 64);
		g.drawString("Play", 275, 190);
		
		g.drawRect(210, 250, 200, 64);
		g.drawString("Help", 275, 290);
	
		g.drawRect(210, 350, 200, 64);
		g.drawString("Exit", 275, 390);
		
	}

}
