import java.awt.Color;
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
		g.setColor(Color.DARK_GRAY);
		g.drawRect(210, 150, 200, 64);
		
		g.setColor(Color.DARK_GRAY);
		g.drawRect(210, 250, 200, 64);
		
		g.setColor(Color.DARK_GRAY);
		g.drawRect(210, 350, 200, 64);
		
	}

}
