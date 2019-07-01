
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Manejador implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		
	}
}

public class VentanaPrincipal extends JFrame {

	public VentanaPrincipal() {
		super("Bienvenido");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		JLabel etiqueta = new JLabel("Nombre: ");
		JTextField texto = new JTextField(20);
		JButton boton = new JButton("Saludar");
		JLabel etiqueta_resultado = new JLabel("");
		cp.add(etiqueta);
		cp.add(texto);
		cp.add(boton);
		cp.add(etiqueta_resultado);
		
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				etiqueta_resultado.setText("Has pulsado el botón ");			
			}
		});
        
		setVisible(true);
	}
}
