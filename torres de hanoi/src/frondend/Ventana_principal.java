package frondend;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana_principal extends JFrame {

	private JPanel contentPane;

	JPanel panelIzquierdo = new JPanel();
	JPanel panelCentro = new JPanel();
	JPanel torre1 = new JPanel();
	JPanel torre2 = new JPanel();
	JPanel torre3 = new JPanel();
	JPanel panelDerecho = new JPanel();
	JPanel panelabajo = new JPanel();
	
	// peneles de torres
	JPanel cabeza = new JPanel();
	JPanel piso10t1 = new JPanel();
	JPanel piso9t1 = new JPanel();
	JPanel piso8t1 = new JPanel();
	JPanel piso7t1 = new JPanel();
	JPanel piso6t1 = new JPanel();
	JPanel piso5t1 = new JPanel();
	JPanel piso4t1 = new JPanel();
	JPanel piso3t1 = new JPanel();
	JPanel piso2t1 = new JPanel();
	JPanel piso1t1 = new JPanel();
	
	//panel torre 2
	private final JPanel cabeza2 = new JPanel();
	private final JPanel piso10t2 = new JPanel();
	private final JPanel piso9t2 = new JPanel();
	private final JPanel piso8t2 = new JPanel();
	private final JPanel piso7t2 = new JPanel();
	private final JPanel piso6t2 = new JPanel();
	private final JPanel piso5t2 = new JPanel();
	private final JPanel piso4t2 = new JPanel();
	private final JPanel piso3t2 = new JPanel();
	private final JPanel piso2t2 = new JPanel();
	private final JPanel piso1t2 = new JPanel();
	
	//panel torre 3
	private final JPanel cabeza3 = new JPanel();
	private final JPanel piso10t3 = new JPanel();
	private final JPanel piso9t3 = new JPanel();
	private final JPanel piso8t3 = new JPanel();
	private final JPanel piso7t3 = new JPanel();
	private final JPanel piso6t3 = new JPanel();
	private final JPanel piso5t3 = new JPanel();
	private final JPanel piso4t3 = new JPanel();
	private final JPanel piso3t3 = new JPanel();
	private final JPanel piso2t3 = new JPanel();
	private final JPanel piso1t3 = new JPanel();
	
	
	//arreglos JPanel
	JPanel[] arregloTorre1 = new JPanel[10];
	JPanel[] arregloTorre2 = new JPanel[10];
	JPanel[] arregloTorre3 = new JPanel[10];
	

	public Ventana_principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		//relenando arreglos
		arregloTorre1[0] = piso1t1;
		arregloTorre1[1] = piso2t1;
		arregloTorre1[2] = piso3t1;
		arregloTorre1[3] = piso4t1;
		arregloTorre1[4] = piso5t1;
		arregloTorre1[5] = piso6t1;
		arregloTorre1[6] = piso7t1;
		arregloTorre1[7] = piso8t1;
		arregloTorre1[8] = piso9t1;
		arregloTorre1[9] = piso10t1;
		
		//rellenando arreglo 2
		arregloTorre2[0] = piso1t2;
		arregloTorre2[1] = piso2t2;
		arregloTorre2[2] = piso3t2;
		arregloTorre2[3] = piso4t2;
		arregloTorre2[4] = piso5t2;
		arregloTorre2[5] = piso6t2;
		arregloTorre2[6] = piso7t2;
		arregloTorre2[7] = piso8t2;
		arregloTorre2[8] = piso9t2;
		arregloTorre2[9] = piso10t2;
		
		
		//rellenando arreglo 3
		arregloTorre1[0] = piso1t3;
		arregloTorre1[1] = piso2t3;
		arregloTorre1[2] = piso3t3;
		arregloTorre1[3] = piso4t3;
		arregloTorre1[4] = piso5t3;
		arregloTorre1[5] = piso6t3;
		arregloTorre1[6] = piso7t3;
		arregloTorre1[7] = piso8t3;
		arregloTorre1[8] = piso9t3;
		arregloTorre1[9] = piso10t3;
		
		panelIzquierdo.setPreferredSize(new Dimension(100,60));
		contentPane.add(panelIzquierdo, BorderLayout.WEST);
		
		contentPane.add(panelCentro, BorderLayout.CENTER);
		panelCentro.setLayout(new GridLayout(0, 3, 0, 0));
		
		panelCentro.add(torre1);
		torre1.setLayout(new GridLayout(11, 1, 0, 0));
		
		torre1.add(cabeza);
		
		panelCentro.add(torre2);
		torre2.setLayout(new GridLayout(11, 1, 0, 0));
		
		torre2.add(cabeza2);
		
		torre2.add(piso10t2);
		
		torre2.add(piso9t2);
		
		torre2.add(piso8t2);
		
		torre2.add(piso7t2);
		
		torre2.add(piso6t2);
		
		torre2.add(piso5t2);
		
		torre2.add(piso4t2);
		
		torre2.add(piso3t2);
		
		torre2.add(piso2t2);
		
		torre2.add(piso1t2);
		
		panelCentro.add(torre3);
		torre3.setLayout(new GridLayout(11, 1, 0, 0));
		
		torre3.add(cabeza3);
		
		torre3.add(piso10t3);
		
		torre3.add(piso9t3);
		
		torre3.add(piso8t3);
		
		torre3.add(piso7t3);
		
		torre3.add(piso6t3);
		
		torre3.add(piso5t3);
		
		torre3.add(piso4t3);
		
		torre3.add(piso3t3);
		
		torre3.add(piso2t3);
		
		torre3.add(piso1t3);
		
		panelDerecho.setPreferredSize(new Dimension(100,60));
		contentPane.add(panelDerecho, BorderLayout.EAST);
		
		panelabajo.setPreferredSize(new Dimension(100,200));
		contentPane.add(panelabajo, BorderLayout.SOUTH);
		
		torre1.add(piso10t1);
		piso10t1.setLayout(new BorderLayout(0, 0));
		
		torre1.add(piso9t1);
		piso9t1.setLayout(new BorderLayout(0, 0));
		
		torre1.add(piso8t1);
		piso8t1.setLayout(new BorderLayout(0, 0));
		
		torre1.add(piso7t1);
		piso7t1.setLayout(new BorderLayout(0, 0));
		
		torre1.add(piso6t1);
		piso6t1.setLayout(new BorderLayout(0, 0));
		
		torre1.add(piso5t1);
		piso5t1.setLayout(new BorderLayout(0, 0));
		
		torre1.add(piso4t1);
		piso4t1.setLayout(new BorderLayout(0, 0));
		
		torre1.add(piso3t1);
		piso3t1.setLayout(new BorderLayout(0, 0));
		
		torre1.add(piso2t1);
		piso2t1.setLayout(new BorderLayout(0, 0));
		
		torre1.add(piso1t1);
		piso1t1.setLayout(new BorderLayout(0, 0));
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				verificar();

			}
		});
		panelabajo.add(btnNewButton);
		
		JButton borrar = new JButton("New button");
		borrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				remover();

			}
		});
		panelabajo.add(borrar);
		cabeza.setLayout(new BorderLayout(0, 0));
		

		
	}
	public void verificar(){
		Disco1 discoTipo1 = new Disco1();
		Disco2 discoTipo2 = new Disco2();
		Disco3 discoTipo3 = new Disco3();
		Disco4 discoTipo4 = new Disco4();
		Disco5 discoTipo5 = new Disco5();
		Disco6 discoTipo6 = new Disco6();
		Disco7 discoTipo7 = new Disco7();
		Disco8 discoTipo8 = new Disco8();
		Disco9 discoTipo9 = new Disco9();
		Disco10 discoTipo10 = new Disco10();
		piso1t1.add(discoTipo5);// agregamso el disco al panel
		piso2t1.add(discoTipo9);
		piso3t1.add(discoTipo8);
		piso4t1.add(discoTipo7);
		piso5t1.add(discoTipo6);
		piso6t1.add(discoTipo10);
		piso7t1.add(discoTipo4);
		piso8t1.add(discoTipo3);
		piso9t1.add(discoTipo2);
		piso10t1.add(discoTipo1);
		contentPane.updateUI();
	}
	public void remover() {
		piso2t1.removeAll();
		piso1t1.removeAll();
		contentPane.updateUI();
	}
	

}
