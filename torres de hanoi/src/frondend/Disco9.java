package frondend;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Disco9 extends Grafidisco {

	
	public Disco9() {
		this.setTamaño(1);
	}
	@Override
	public void paintComponent(Graphics h) {
		super.paintComponent(h); // llamamos al metodo paint de la super clase
		
		this.setBackground(Color.white);
		
		h.setColor(Color.blue);
		h.fillRoundRect(10, 0, this.getWidth()-20, this.getHeight(), 20, 30);
		
	}

}
