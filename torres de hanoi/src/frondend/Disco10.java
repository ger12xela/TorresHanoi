package frondend;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Disco10 extends Grafidisco {

	public Disco10() {
		this.setTamaño(0);

	}
	
	@Override
	public void paintComponent(Graphics h) {
		super.paintComponent(h); // llamamos al metodo paint de la super clase
		
		this.setBackground(Color.white);
		
		h.setColor(Color.cyan);
		h.fillRoundRect(0, 0, this.getWidth(), this.getHeight(), 20, 30);
		
		
	}


}
