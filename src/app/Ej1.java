package app;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Ej1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField txtContraseña;
	private JLabel lblContraseña;
	private JButton btnNewButton;
	private JLabel lblMensaje;
	private static final String Usuario="Aza"; 
	private static final String Contraseña="123456";
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ej1 frame = new Ej1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ej1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 46, 0, 0, 5, 202, 49, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 34, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblUsuario = new JLabel("Usuario   ");
		lblUsuario.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblUsuario = new GridBagConstraints();
		gbc_lblUsuario.anchor = GridBagConstraints.EAST;
		gbc_lblUsuario.gridwidth = 4;
		gbc_lblUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsuario.gridx = 1;
		gbc_lblUsuario.gridy = 1;
		contentPane.add(lblUsuario, gbc_lblUsuario);
		
		txtUsuario = new JTextField();
		GridBagConstraints gbc_txtUsuario = new GridBagConstraints();
		gbc_txtUsuario.gridwidth = 2;
		gbc_txtUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_txtUsuario.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtUsuario.gridx = 5;
		gbc_txtUsuario.gridy = 1;
		contentPane.add(txtUsuario, gbc_txtUsuario);
		txtUsuario.setColumns(10);
		
		lblContraseña = new JLabel("Contraseña   ");
		lblContraseña.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblContraseña = new GridBagConstraints();
		gbc_lblContraseña.anchor = GridBagConstraints.EAST;
		gbc_lblContraseña.gridwidth = 4;
		gbc_lblContraseña.insets = new Insets(0, 0, 5, 5);
		gbc_lblContraseña.gridx = 1;
		gbc_lblContraseña.gridy = 3;
		contentPane.add(lblContraseña, gbc_lblContraseña);
		
		txtContraseña = new JPasswordField();
		GridBagConstraints gbc_txtContraseña = new GridBagConstraints();
		gbc_txtContraseña.insets = new Insets(0, 0, 5, 5);
		gbc_txtContraseña.gridwidth = 2;
		gbc_txtContraseña.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtContraseña.gridx = 5;
		gbc_txtContraseña.gridy = 3;
		contentPane.add(txtContraseña, gbc_txtContraseña);
		txtContraseña.setColumns(10);
		
		btnNewButton = new JButton("Aceptar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				logincorrecto();
			}
		});
		
		lblMensaje = new JLabel("");
		lblMensaje.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblMensaje = new GridBagConstraints();
		gbc_lblMensaje.gridwidth = 2;
		gbc_lblMensaje.insets = new Insets(0, 0, 5, 5);
		gbc_lblMensaje.gridx = 5;
		gbc_lblMensaje.gridy = 4;
		contentPane.add(lblMensaje, gbc_lblMensaje);
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 11));
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton.anchor = GridBagConstraints.EAST;
		gbc_btnNewButton.gridx = 6;
		gbc_btnNewButton.gridy = 5;
		contentPane.add(btnNewButton, gbc_btnNewButton);
	}

	protected void logincorrecto() {
		if (txtUsuario.getText().equals(Usuario) && txtContraseña.getText().equals(Contraseña)) {
		JOptionPane.showMessageDialog(contentPane, "Usuario/Contraseña correctos", "Incio de sesión", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(contentPane, "Usuario/contraseña incorrectos", "Inicio de sesión", JOptionPane.INFORMATION_MESSAGE);
		}
		
	}
}
