package CapaPresentacion;

import java.awt.*;
import java.awt.event.*;
import java.util.Set;

import javax.swing.*;

import DataTypes.DataUser;

public class VentanaPrincipal extends JFrame {

	public VentanaPrincipal(Set<DataUser> users) {
		super("Bienvenido");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Panel de usuarios
		JPanel panelUsuarios = new JPanel();
		GridLayout gl = new GridLayout(users.size()+1, 2);
		panelUsuarios.setLayout(gl);
		panelUsuarios.add(new JLabel("Nombre usuario"));
		panelUsuarios.add(new JLabel("Fecha creado"));
		for(DataUser user: users) {
			panelUsuarios.add(new JLabel(user.getName()));
			panelUsuarios.add(new JLabel(user.getDateCreated()));
		}
        
		// Panel de botones
		JPanel panelBotones = new JPanel();
		panelBotones.setLayout(new FlowLayout());
		JButton agregar_usuario_btn = new JButton("Agregar Usuario");
		agregar_usuario_btn.addActionListener(new AgregarUsuarioBotonPulsado());
		panelBotones.add(agregar_usuario_btn);
		panelBotones.add(new JButton("Cancelar"));

		Container cp = getContentPane();
		cp.add(panelUsuarios, BorderLayout.CENTER);
		cp.add(panelBotones, BorderLayout.SOUTH);
		 
		setVisible(true);
	}
	
	public void recargarVentana() {
		
	}
}
