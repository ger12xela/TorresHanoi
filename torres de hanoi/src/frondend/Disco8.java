package frondend;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Disco8 extends Grafidisco {

	public Disco8() {
		this.setTamaño(2);
	}
	
	@Override
	public void paintComponent(Graphics h) {
		super.paintComponent(h); // llamamos al metodo paint de la super clase
		
		this.setBackground(Color.white);
		
		h.setColor(Color.darkGray);
		h.fillRoundRect(20, 0, this.getWidth()-40, this.getHeight(), 20, 30);
		
	}

}
