package app;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ej6 extends JFrame {

	private JPanel contentPane;
	private JComboBox comboBox;
	private JLabel lblciudad;
	private JButton btnAceptar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ej6 frame = new Ej6();
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
	public Ej6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][64.00][26.00][][175.00,grow][]", "[][grow][][][][][][][grow]"));
		
		JLabel lbl1 = new JLabel("Ciudad:");
		lbl1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbl1.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lbl1, "cell 2 1,growx");
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Adamuz", "Cabra", "Cordoba", "Lucena", "Montalbán", "Montilla", "Monturque"}));
		contentPane.add(comboBox, "cell 3 1 2 1,growx");
		
		JLabel lblseleccion = new JLabel("Has seleccionado:");
		contentPane.add(lblseleccion, "cell 1 5");
		
		lblciudad = new JLabel("");
		contentPane.add(lblciudad, "cell 2 5 2 1");
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aceptar();
			}
		});
		contentPane.add(btnAceptar, "cell 4 8,alignx center");
	}

	protected void aceptar() {
		String aceptar = (String) comboBox.getSelectedItem();
		lblciudad.setText(aceptar);
		
	}

	
}
