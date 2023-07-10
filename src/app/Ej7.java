package app;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ej7 extends JFrame {

	private JPanel contentPane;
	private JTextField txttitulopeli;
	private JButton btnAñadir;
	private JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ej7 frame = new Ej7();
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
	public Ej7() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][120.00,grow][][][][137.00,grow][]", "[][][][][][]"));
		
		JLabel lblEscribe = new JLabel("Escribe el título de una película");
		lblEscribe.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblEscribe, "cell 1 1,growx");
		
		JLabel lblpelis = new JLabel("Películas");
		lblpelis.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblpelis, "cell 5 1,growx");
		
		txttitulopeli = new JTextField();
		contentPane.add(txttitulopeli, "cell 1 3,growx");
		txttitulopeli.setColumns(10);
		
		comboBox = new JComboBox();
		contentPane.add(comboBox, "cell 5 3,growx");
		
		btnAñadir = new JButton("Añadir");
		btnAñadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				añadirpeli();
			}
		});
		contentPane.add(btnAñadir, "cell 1 5,alignx center");
	}

	protected void añadirpeli() {
		String texto=txttitulopeli.getText();
		comboBox.addItem(texto);
		
	}

}
