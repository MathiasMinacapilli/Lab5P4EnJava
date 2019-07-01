package CapaPresentacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class AgregarUsuarioBotonPulsado implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane optpane = new JOptionPane();
		String nombre = optpane.showInputDialog(optpane, "Ingresa el nombre:", null);
		System.out.println("Se ingresó el nombre: "+nombre);
	}

}
