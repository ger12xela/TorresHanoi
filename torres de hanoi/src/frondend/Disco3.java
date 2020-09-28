package frondend;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Disco3 extends Grafidisco {

	/**
	 * Create the panel.
	 */
	public Disco3() {
		this.setTamaño(7);
	}
	@Override
	public void paintComponent(Graphics h) {
		super.paintComponent(h); // llamamos al metodo paint de la super clase
		
		this.setBackground(Color.white);
		
		h.setColor(Color.pink);
		h.fillRoundRect(70, 0, this.getWidth()-140, this.getHeight(), 20, 30);
		
	}
	



}
