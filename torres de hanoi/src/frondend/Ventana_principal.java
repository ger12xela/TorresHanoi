package frondend;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import backend.Disco;
import backend.Torre;

import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class Ventana_principal extends JFrame {
	
	int contadorMovimientos;
	Torre torrepila1;
	Torre torrepila2;
	Torre torrepila3;
	
	// otras variables
	int objetivo; 
	double objetivominimo;
	boolean detener;

	private JPanel contentPane;

	JPanel panelIzquierdo = new JPanel();
	JPanel panelCentro = new JPanel();
	JPanel torre1 = new JPanel();
	JPanel torre2 = new JPanel();
	JPanel torre3 = new JPanel();
	JPanel panelDerecho = new JPanel();
	JPanel panelabajo = new JPanel();
	
	private JPanel tituloTorreA = new JPanel();
	private JPanel tituloTorreB = new JPanel();
	private JPanel tituloTorreC = new JPanel();
		
	
	//arreglos JPanel
	JPanel[] arregloTorre1 = {
			new JPanel(),
			new JPanel(),
			new JPanel(),
			new JPanel(),
			new JPanel(),
			new JPanel(),
			new JPanel(),
			new JPanel(),
			new JPanel(),
			new JPanel(),};
	JPanel[] arregloTorre2 = {
			new JPanel(),
			new JPanel(),
			new JPanel(),
			new JPanel(),
			new JPanel(),
			new JPanel(),
			new JPanel(),
			new JPanel(),
			new JPanel(),
			new JPanel(),};
	JPanel[] arregloTorre3 = {
			new JPanel(),
			new JPanel(),
			new JPanel(),
			new JPanel(),
			new JPanel(),
			new JPanel(),
			new JPanel(),
			new JPanel(),
			new JPanel(),
			new JPanel(),};

	// Arreglo Disco
	JPanel matrizDisco [] = {
			new Disco1(), // es el mas grande de los discos
			new Disco2(),
			new Disco3(),
			new Disco4(),
			new Disco5(),
			new Disco6(),
			new Disco7(),
			new Disco8(),
			new Disco9(),
			new Disco10(),
			};
	
	// ComboBox
	JComboBox comboBoxNumeroDiscos = new JComboBox();

	// varios 
	
	private JLabel LabeltorreA = new JLabel("Torre A");
	private JLabel LabeltorreB = new JLabel("Torre B");
	private JLabel LabeltorreC = new JLabel("Torre C");
	private final JLabel lblNewLabelNumeroMinimo = new JLabel("Numero minimo de movimientos");
	private final JLabel lblNewLabelNumeroMovimientos = new JLabel("Numero de movimientos");
	private JTextField textFieldNumeroMInimo;
	private JTextField textFieldNumeroMovimeientos;
	private final JButton btnNewButton_1 = new JButton("Acerca de ");

	public Ventana_principal() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 919, 623);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		

		
		panelIzquierdo.setPreferredSize(new Dimension(100,60));
		contentPane.add(panelIzquierdo, BorderLayout.WEST);
		panelCentro.setBorder(new LineBorder(Color.BLACK, 2));
		
		contentPane.add(panelCentro, BorderLayout.CENTER);
		panelCentro.setLayout(new GridLayout(0, 3, 0, 0));
		torre1.setBorder(new LineBorder(Color.BLACK));
		
		panelCentro.add(torre1);
		torre1.setLayout(new GridLayout(11, 1, 0, 0));
		
		
		torre1.add(tituloTorreA);
		
		torre1.add(arregloTorre1[9]);
		arregloTorre1[9].setLayout(new BorderLayout(0, 0));
		
		torre1.add(arregloTorre1[8]);
		arregloTorre1[8].setLayout(new BorderLayout(0, 0));
		
		torre1.add(arregloTorre1[7]);
		arregloTorre1[7].setLayout(new BorderLayout(0, 0));
		
		torre1.add(arregloTorre1[6]);
		arregloTorre1[6].setLayout(new BorderLayout(0, 0));
		
		torre1.add(arregloTorre1[5]);
		arregloTorre1[5].setLayout(new BorderLayout(0, 0));
		
		torre1.add(arregloTorre1[4]);
		arregloTorre1[4].setLayout(new BorderLayout(0, 0));
		
		torre1.add(arregloTorre1[3]);
		arregloTorre1[3].setLayout(new BorderLayout(0, 0));
		
		torre1.add(arregloTorre1[2]);
		arregloTorre1[2].setLayout(new BorderLayout(0, 0));
		
		torre1.add(arregloTorre1[1]);
		arregloTorre1[1].setLayout(new BorderLayout(0, 0));
		
		torre1.add(arregloTorre1[0]);
		arregloTorre1[0].setLayout(new BorderLayout(0, 0));
		torre2.setBorder(new LineBorder(Color.BLACK));
		
		panelCentro.add(torre2);
		torre2.setLayout(new GridLayout(11, 1, 0, 0));
		
		torre2.add(tituloTorreB);
		
		torre2.add(arregloTorre2[9]);
		
		torre2.add(arregloTorre2[8]);
		
		torre2.add(arregloTorre2[7]);
		
		torre2.add(arregloTorre2[6]);
		
		torre2.add(arregloTorre2[5]);
		
		torre2.add(arregloTorre2[4]);
		
		torre2.add(arregloTorre2[3]);
		
		torre2.add(arregloTorre2[2]);
		
		torre2.add(arregloTorre2[1]);
		
		torre2.add(arregloTorre2[0]);
		torre3.setBorder(new LineBorder(Color.BLACK));
		
		panelCentro.add(torre3);
		torre3.setLayout(new GridLayout(11, 1, 0, 0));
		
		torre3.add(tituloTorreC);
		
		torre3.add(arregloTorre3[9]);
		
		torre3.add(arregloTorre3[8]);
		
		torre3.add(arregloTorre3[7]);
		
		torre3.add(arregloTorre3[6]);
		
		torre3.add(arregloTorre3[5]);
		
		torre3.add(arregloTorre3[4]);
		
		torre3.add(arregloTorre3[3]);
		
		torre3.add(arregloTorre3[2]);
		
		torre3.add(arregloTorre3[1]);
		
		torre3.add(arregloTorre3[0]);
		
		// cambiando el titulo de las torres
		
		for (int i = 0; i < arregloTorre1.length; i++) {
			arregloTorre1[i].setBackground(Color.WHITE);
		}	
		
		tituloTorreA.setBackground(new Color(176, 224, 230));
		tituloTorreA.setLayout(new FlowLayout());
		tituloTorreA.add(LabeltorreA);
		LabeltorreA.setFont(new Font("Agency FB", Font.BOLD, 22));

		for (int i = 0; i < arregloTorre2.length; i++) {
			arregloTorre2[i].setLayout(new BorderLayout(0, 0));
			arregloTorre2[i].setBackground(Color.WHITE);
		}
		tituloTorreB.setBackground(new Color(176, 224, 230));
		tituloTorreB.setLayout(new FlowLayout());
		tituloTorreB.add(LabeltorreB);
		LabeltorreB.setFont(new Font("Agency FB", Font.BOLD, 22));

		
		for (int i = 0; i < arregloTorre3.length; i++) {
			arregloTorre3[i].setLayout(new BorderLayout(0, 0));
			arregloTorre3[i].setBackground(Color.WHITE);

		}
		tituloTorreC.setBackground(new Color(176, 224, 230));
		tituloTorreC.setLayout(new FlowLayout());
		tituloTorreC.add(LabeltorreC);
		LabeltorreC.setFont(new Font("Agency FB", Font.BOLD, 22));

		
		panelDerecho.setPreferredSize(new Dimension(100,60));
		contentPane.add(panelDerecho, BorderLayout.EAST);
		
		panelabajo.setPreferredSize(new Dimension(100,200));
		contentPane.add(panelabajo, BorderLayout.SOUTH);
		

		
		JButton btnIncio = new JButton("Inicio");
		btnIncio.setBounds(195, 138, 89, 23);
		btnIncio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				contadorMovimientos = 0 ;
				verificar();

			}
		});
		panelabajo.setLayout(null);
		panelabajo.add(btnIncio);
		
		JButton borrar = new JButton("Reiniciar");
		borrar.setBounds(319, 138, 89, 23);
		borrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reiniciar();

			}
		});
		panelabajo.add(borrar);
		
		JLabel lblNewLabel = new JLabel("Numero Discos");
		lblNewLabel.setBounds(495, 142, 88, 14);
		panelabajo.add(lblNewLabel);
		
		comboBoxNumeroDiscos.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		comboBoxNumeroDiscos.setBounds(688, 139, 67, 20);
		panelabajo.add(comboBoxNumeroDiscos);
		lblNewLabelNumeroMinimo.setBounds(495, 92, 161, 14);
		
		panelabajo.add(lblNewLabelNumeroMinimo);
		lblNewLabelNumeroMovimientos.setBounds(495, 117, 161, 14);
		
		panelabajo.add(lblNewLabelNumeroMovimientos);
		
		textFieldNumeroMInimo = new JTextField();
		textFieldNumeroMInimo.setBackground(Color.WHITE);
		textFieldNumeroMInimo.setEditable(false);
		textFieldNumeroMInimo.setBounds(688, 89, 86, 20);
		panelabajo.add(textFieldNumeroMInimo);
		textFieldNumeroMInimo.setColumns(10);
		
		textFieldNumeroMovimeientos = new JTextField();
		textFieldNumeroMovimeientos.setBackground(Color.WHITE);
		textFieldNumeroMovimeientos.setEditable(false);
		textFieldNumeroMovimeientos.setBounds(688, 114, 86, 20);
		panelabajo.add(textFieldNumeroMovimeientos);
		textFieldNumeroMovimeientos.setColumns(10);
		
		JButton ButtonA_B = new JButton("B");
		ButtonA_B.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				moverDeA_B();
			}
		});
		ButtonA_B.setBounds(139, 15, 45, 31);
		panelabajo.add(ButtonA_B);
		
		JButton ButtonA_C = new JButton("C");
		ButtonA_C.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				moverDeA_C();
			}
		});
		ButtonA_C.setBounds(239, 15, 45, 31);
		panelabajo.add(ButtonA_C);
		
		JButton ButtonB_A = new JButton("A");
		ButtonB_A.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				moverDeB_A();
			}
		});
		ButtonB_A.setBounds(363, 15, 45, 31);
		panelabajo.add(ButtonB_A);
		
		JButton ButtonB_C = new JButton("C");
		ButtonB_C.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				moverDeB_C();
			}
		});
		ButtonB_C.setBounds(478, 15, 45, 31);
		panelabajo.add(ButtonB_C);
		
		JButton ButtonC_A = new JButton("A");
		ButtonC_A.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				moverDeC_A();
			}
		});
		ButtonC_A.setBounds(597, 15, 45, 31);
		panelabajo.add(ButtonC_A);
		
		JButton ButtonC_B = new JButton("B");
		ButtonC_B.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				moverDeC_B();
			}
		});
		ButtonC_B.setBounds(729, 15, 45, 31);
		panelabajo.add(ButtonC_B);
		
		JButton btnNewButton = new JButton("instrucciones");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				istrucciones();
			}
		});
		btnNewButton.setBounds(10, 138, 115, 23);
		panelabajo.add(btnNewButton);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AcercaDe();
			}
		});
		btnNewButton_1.setBounds(10, 166, 115, 23);
		
		panelabajo.add(btnNewButton_1);
		

		
	}
	private void AcercaDe() {
		JOptionPane.showMessageDialog(null, "Proyecto matematica del computo segundo semestres 2020"
				+ "\n\n Universidad de san carlor de Guatemala"
				+ "\n centro universitario de occidente"
				+ "\n\n creado por: Gerson Joselito Reynoso Batz"
				+ "\n Carnet: 201831010 "
				+ ""," Acerca de... ", JOptionPane.DEFAULT_OPTION);
		
	}
	
	private void istrucciones() {
		JOptionPane.showMessageDialog(null, "El objetivo del juego es trasladar la pila a otro de los postes siguiendo ciertas reglas,"
				+ " como que no se puede colocar un disco más grande encima de un disco más pequeño."
				+ "\n\n puede escojer la cantidad de discos en el apartado numero discos para luego precionar el boton (inicio) "
				+ "\n\n para trasladar un disco a otra torre puede precionar el boton debajo de la misma, con la letra "
				+ "correspondiente a la sieguiente torre "," Instucciones ", JOptionPane.WARNING_MESSAGE);
		
	}
	private void moverDeA_B(){
		try {
			if (torrepila1.getContadorDico() > 0) {
				Disco disco = new Disco();
				disco.setDisco(torrepila1.Regreso());
				
				if (torrepila2.getContadorDico() >0) {
					JPanel temp = disco.getDisco();
					JPanel temp2 = torrepila2.Regreso();
					

					if (((Grafidisco) temp).getTamaño() <= ((Grafidisco) temp2).getTamaño() ) {
						return;
					}
				}
				torrepila1.Pop();
				torrepila2.Pus(disco);

				MostrarTorreA();
				MostrarTorreB();
				PresentarCantidadMovimientos();	
				
			}
		} catch (Exception e) {
			System.out.println("error"+ e.getMessage());
		}
	}
	
	private void moverDeA_C() {
		try {
			if (torrepila1.getContadorDico() > 0) {
				Disco disco = new Disco();
				disco.setDisco(torrepila1.Regreso());
				
				if (torrepila3.getContadorDico() >0) {
					JPanel temp = disco.getDisco();
					JPanel temp2 = torrepila3.Regreso();
					

					if (((Grafidisco) temp).getTamaño() <= ((Grafidisco) temp2).getTamaño() ) {
						return;
					}
				}
				torrepila1.Pop();
				torrepila3.Pus(disco);

				MostrarTorreA();
				MostrarTorreC();
				PresentarCantidadMovimientos();	
				
				if(torrepila3.getContadorDico() == objetivo && contadorMovimientos==objetivominimo ) {
					JOptionPane.showMessageDialog(null, "Estoy Seguro que eres de la san Carlos, \n"
							+ "lo lograste en el minimo de movimientos \n\n"
							+ "prueba cambiar y subir la cantidad de discos"," Felicidades ", JOptionPane.WARNING_MESSAGE);
					reiniciar();
				}else if (torrepila3.getContadorDico() == objetivo && contadorMovimientos != objetivominimo) {
					JOptionPane.showMessageDialog(null, "lo lograste, \n\n"
							+ "ahora intenta hacerlo en el minimo de movimientos que se te indica"
						," Felicidades ", JOptionPane.WARNING_MESSAGE);
					reiniciar();
				}
				
			}
		} catch (Exception e) {
			System.out.println("error"+ e.getMessage());
		}
	}

	private void moverDeB_A() {
		try {
			if (torrepila2.getContadorDico() > 0) {
				Disco disco = new Disco();
				disco.setDisco(torrepila2.Regreso());
				
				if (torrepila1.getContadorDico() >0) {
					JPanel temp = disco.getDisco();
					JPanel temp2 = torrepila1.Regreso();
					

					if (((Grafidisco) temp).getTamaño() <= ((Grafidisco) temp2).getTamaño() ) {
						return;
					}
				}
				torrepila2.Pop();
				torrepila1.Pus(disco);

				MostrarTorreA();
				MostrarTorreB();
				PresentarCantidadMovimientos();	
				
			}
		} catch (Exception e) {
			System.out.println("error"+ e.getMessage());
		}
	}
	
	private void moverDeB_C() {
		try {
			if (torrepila2.getContadorDico() > 0) {
				Disco disco = new Disco();
				disco.setDisco(torrepila2.Regreso());
				
				if (torrepila3.getContadorDico() >0) {
					JPanel temp = disco.getDisco();
					JPanel temp2 = torrepila3.Regreso();
					

					if (((Grafidisco) temp).getTamaño() <= ((Grafidisco) temp2).getTamaño() ) {
						return;
					}
				}
				torrepila2.Pop();
				torrepila3.Pus(disco);

				MostrarTorreA();
				MostrarTorreC();
				PresentarCantidadMovimientos();	
				
				if(torrepila3.getContadorDico() == objetivo && contadorMovimientos==objetivominimo ) {
					JOptionPane.showMessageDialog(null, "Estoy Seguro que eres de la san Carlos, \n"
							+ "lo lograste en el minimo de movimientos \n\n"
							+ "prueba cambiando la cantidad de discos"," Felicidades ", JOptionPane.WARNING_MESSAGE);
					reiniciar();
				}else if (torrepila3.getContadorDico() == objetivo && contadorMovimientos != objetivominimo) {
					JOptionPane.showMessageDialog(null, "lo lograste, \n\n"
							+ "ahora intenta hacerlo en el minimo de movimientos que se te indica"
						," Felicidades ", JOptionPane.WARNING_MESSAGE);
					reiniciar();
				}
				
			}
		} catch (Exception e) {
			System.out.println("error"+ e.getMessage());
		}
	}
	
	private void moverDeC_A() {
		try {
			if (torrepila3.getContadorDico() > 0) {
				Disco disco = new Disco();
				disco.setDisco(torrepila3.Regreso());
				
				if (torrepila1.getContadorDico() >0) {
					JPanel temp = disco.getDisco();
					JPanel temp2 = torrepila1.Regreso();
					

					if (((Grafidisco) temp).getTamaño() <= ((Grafidisco) temp2).getTamaño() ) {
						return;
					}
				}
				torrepila3.Pop();
				torrepila1.Pus(disco);

				MostrarTorreA();
				MostrarTorreB();
				PresentarCantidadMovimientos();	
				
			}
		} catch (Exception e) {
			System.out.println("error"+ e.getMessage());
		}
	}
	
	private void moverDeC_B() {
		try {
			if (torrepila3.getContadorDico() > 0) {
				Disco disco = new Disco();
				disco.setDisco(torrepila3.Regreso());
				
				if (torrepila2.getContadorDico() >0) {
					JPanel temp = disco.getDisco();
					JPanel temp2 = torrepila2.Regreso();
					

					if (((Grafidisco) temp).getTamaño() <= ((Grafidisco) temp2).getTamaño() ) {
						return;
					}
				}
				torrepila3.Pop();
				torrepila2.Pus(disco);

				MostrarTorreA();
				MostrarTorreB();
				PresentarCantidadMovimientos();	
				
			}
		} catch (Exception e) {
			System.out.println("error"+ e.getMessage());
		}
	}
	
	
	private void limpiar(){
		contadorMovimientos = 0;
		objetivominimo = 0;
		comboBoxNumeroDiscos.setSelectedItem(String.valueOf(objetivo));

	}
	
	private void PresentarCantidadMovimientos() {
		contadorMovimientos ++;
		if (contadorMovimientos > objetivominimo) {
			JOptionPane.showMessageDialog(null, "has superado la cantidad minima de momimientos puesdes seguir o iniciar de nuevo "," atencion", JOptionPane.WARNING_MESSAGE);
		}
		textFieldNumeroMovimeientos.setText(String.valueOf(contadorMovimientos));
	}
	
	public void reiniciar() {
		try {
			if (!textFieldNumeroMInimo.getText().equals("")) {
				limpiar();
				verificar();
			}
		} catch (Exception e) {
			System.out.println("error"+ e.getMessage());

		}
	}

	
	
	public void verificar(){

		try {
			
			torrepila1 = new Torre();
			torrepila2 = new Torre();
			torrepila3 = new Torre();
			
			objetivo = Integer.parseInt(comboBoxNumeroDiscos.getSelectedItem().toString());
			
			objetivominimo = Math.pow(2, objetivo) -1;
			textFieldNumeroMovimeientos.setText(String.valueOf(contadorMovimientos));
			textFieldNumeroMInimo.setText(String.valueOf(String.format("%.0f",objetivominimo)));		
			
			contentPane.updateUI();
			
			for (int i = objetivo; i >= 1; i--) {
				Disco disco = new Disco();
				
				disco.setDisco(matrizDisco[i-1]);
				
				torrepila1.Pus(disco);
			}
			
			MostrarTorreA();
			MostrarTorreB();
		 	MostrarTorreC();
			
			
		} catch (Exception e) {
			System.out.println("error "+ e.getMessage());
		}

		
	}
	
	private void MostrarTorreA() {
		for (int i = 0; i < arregloTorre1.length; i++) {
			arregloTorre1[i].removeAll();
		}
		
		Disco k; 
		int niveltorre = (torrepila1.getContadorDico());
		
		if (torrepila1.getContadorDico()>0) {
			
			for(k = torrepila1.getCabeza(); k.getAbajo() != null; k = k.getAbajo()) {
				arregloTorre1[niveltorre].add(k.getDisco());
				niveltorre --;  
			}
			if (k.getAbajo()== null) {
				arregloTorre1[niveltorre].add(k.getDisco());
			}
		}
		contentPane.updateUI();
		
	}
	private void MostrarTorreB() {
		for (int i = 0; i < arregloTorre2.length; i++) {
			arregloTorre2[i].removeAll();
		}
		
		Disco k; 
		int niveltorre = (torrepila2.getContadorDico());
		
		if (torrepila2.getContadorDico()>0) {
			
			for(k = torrepila2.getCabeza(); k.getAbajo() != null; k = k.getAbajo()) {
				arregloTorre2[niveltorre].add(k.getDisco());
				niveltorre --;  
			}
			if (k.getAbajo()== null) {
				arregloTorre2[niveltorre].add(k.getDisco());
			}
		}
		contentPane.updateUI();
		
	}
	private void MostrarTorreC() {
		for (int i = 0; i < arregloTorre3.length; i++) {
			arregloTorre3[i].removeAll();
		}
		
		Disco k; 
		int niveltorre = (torrepila3.getContadorDico());
		
		if (torrepila3.getContadorDico()>0) {
			
			for(k = torrepila3.getCabeza(); k.getAbajo() != null; k = k.getAbajo()) {
				arregloTorre3[niveltorre].add(k.getDisco());
				niveltorre --;  
			}
			if (k.getAbajo()== null) {
				arregloTorre3[niveltorre].add(k.getDisco());
			}
		}
		contentPane.updateUI();
		
	}
	
	
	public void remover() {
		MostrarTorreB();
		contentPane.updateUI();
	}
}
