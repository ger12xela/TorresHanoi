package frondend;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Disco7 extends Grafidisco {

	/**
	 * Create the panel.
	 */
	public Disco7() {
		this.setTama�o(3);
	}
	@Override
	public void paintComponent(Graphics h) {
		super.paintComponent(h); // llamamos al metodo paint de la super clase
		
		this.setBackground(Color.white);
		
		h.setColor(Color.green);
		h.fillRoundRect(30, 0, this.getWidth()-60, this.getHeight(), 20, 30);
		
	}



}
