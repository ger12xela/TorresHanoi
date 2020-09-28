package frondend;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Disco4 extends Grafidisco {

	/**
	 * Create the panel.
	 */
	public Disco4() {
		this.setTamaño(6);
	}
	@Override
	public void paintComponent(Graphics h) {
		super.paintComponent(h); // llamamos al metodo paint de la super clase
		
		this.setBackground(Color.white);
		
		h.setColor(Color.orange);
		h.fillRoundRect(60, 0, this.getWidth()-120, this.getHeight(), 20, 30);
		
	}



}
