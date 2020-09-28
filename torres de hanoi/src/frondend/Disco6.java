package frondend;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Disco6 extends Grafidisco {

	/**
	 * Create the panel.
	 */
	public Disco6() {
		this.setTamaño(4);
	}
	@Override
	public void paintComponent(Graphics h) {
		super.paintComponent(h); // llamamos al metodo paint de la super clase
		
		this.setBackground(Color.white);
		
		h.setColor(Color.lightGray);
		h.fillRoundRect(40, 0, this.getWidth()-80, this.getHeight(), 20, 30);
		
	}


}
