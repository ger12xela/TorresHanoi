package frondend;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Disco1 extends Grafidisco {

	/**
	 * Create the panel.
	 */
	public Disco1() {
		this.setTama�o(9);

	}
	
	// el disco 1 es el mas peque�o
	
	@Override
	public void paintComponent(Graphics h) {
		super.paintComponent(h); // llamamos al metodo paint de la super clase
		
		this.setBackground(Color.white);
		
		h.setColor(Color.yellow);
		h.fillRoundRect(90, 0, this.getWidth()-180, this.getHeight(), 20, 30);
		
	}

	


}
