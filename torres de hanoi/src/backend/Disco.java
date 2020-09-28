package backend;

import javax.swing.JPanel;

public class Disco {

	private JPanel Disco;
	private Disco arriba;
	private Disco abajo;
	
	
	public JPanel getDisco() {
		return Disco;
	}
	public void setDisco(JPanel Disco) {
		this.Disco = Disco;
	}
	public Disco getArriba() {
		return arriba;
	}
	public void setArriba(Disco arriba) {
		this.arriba = arriba;
	}
	public Disco getAbajo() {
		return abajo;
	}
	public void setAbajo(Disco abajo) {
		this.abajo = abajo;
	}
}
