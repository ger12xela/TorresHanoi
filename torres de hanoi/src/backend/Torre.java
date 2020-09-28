package backend;

import javax.swing.JPanel;

public class Torre {
	
	private int contadorDisco;
	private Disco cabeza;
	
	public void Pus(Disco N) {
		contadorDisco ++;
		if (cabeza == null) {
			cabeza = N;
		}else {
			N.setAbajo(cabeza);
			cabeza.setArriba(N);
			cabeza = N;
		}
	}
	
	public void Pop() {
		if (contadorDisco > 0 ) {
			contadorDisco --;
			cabeza = cabeza.getAbajo();
		}
	}
	
	// regresa el panel de la cabeza (peek)
	public JPanel Regreso() {
		return cabeza.getDisco();
	}
	public int getContadorDico() {
		return contadorDisco;
	}
	public void setContadorDico(int contadorDico) {
		this.contadorDisco = contadorDico;
	}
	public Disco getCabeza() {
		return cabeza;
	}
	public void setCabeza(Disco cabeza) {
		this.cabeza = cabeza;
	}

}
