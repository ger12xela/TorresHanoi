package frondend;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Disco2 extends Grafidisco {

	/**
	 * Create the panel.
	 */
	public Disco2() {
		this.setTama�o(8);
	}
	@Override
	public void paintComponent(Graphics h) {
		super.paintComponent(h); // llamamos al metodo paint de la super clase
		
		this.setBackground(Color.white);
		
		h.setColor(Color.red);
		h.fillRoundRect(80, 0, this.getWidth()-160, this.getHeight(), 20, 30);
		
	}


}
