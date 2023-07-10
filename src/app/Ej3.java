package app;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ej3 extends JFrame {

	private JPanel contentPane;
	private JButton btnDeshabilitar;
	private JButton btnCentral;
	private JButton btnHabilita;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ej3 frame = new Ej3();
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
	public Ej3() {
		setTitle("Habilitar/Deshabilitar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 121);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][130.00][94.00][133.00][]", "[55.00]"));
		
		btnDeshabilitar = new JButton("Deshabilita Central");
		btnDeshabilitar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				deshabilita();
			}
		});
		contentPane.add(btnDeshabilitar, "cell 1 0,grow");
		
		btnCentral = new JButton("Central");
		contentPane.add(btnCentral, "cell 2 0,grow");
		
		btnHabilita = new JButton("Habilita Central");
		btnHabilita.setEnabled(false);
		btnHabilita.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				habilita();
			}
		});
		contentPane.add(btnHabilita, "cell 3 0,grow");
	}

	protected void habilita() {
		btnCentral.setEnabled(true);
		btnDeshabilitar.setEnabled(true);
		btnHabilita.setEnabled(false);
		
		
	}

	protected void deshabilita() {
		btnCentral.setEnabled(false);
		btnDeshabilitar.setEnabled(false);
		btnHabilita.setEnabled(true);
		
		
	}

}
