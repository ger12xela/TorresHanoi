package frondend;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Disco5 extends JPanel {

	/**
	 * Create the panel.
	 */
	public Disco5() {

	}
	@Override
	public void paintComponent(Graphics h) {
		super.paintComponent(h); // llamamos al metodo paint de la super clase
		
		this.setBackground(Color.white);
		
		h.setColor(Color.magenta);
		h.fillRoundRect(50, 0, this.getWidth()-100, this.getHeight(), 20, 30);
		
	}
}
