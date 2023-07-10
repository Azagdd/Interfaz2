package app;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ButtonGroup;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ej5 extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton rdbtnazul;
	private JRadioButton rdbtnrojo;
	private JRadioButton rdbtnverde;
	private JRadioButton rdbtnmagenta;
	private JPanel panelcolor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ej5 frame = new Ej5();
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
	public Ej5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][58.00][][39.00][205.00,grow][]", "[][24.00,grow][][grow][23.00,grow][grow][grow][]"));
		
		JLabel lblTitulo = new JLabel("Selecciona un color");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblTitulo, "cell 1 1 4 1,grow");
		
		rdbtnazul = new JRadioButton("Azul");
		rdbtnazul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiocolor(Color.blue);
			}
		});
		rdbtnazul.setSelected(true);
		buttonGroup.add(rdbtnazul);
		contentPane.add(rdbtnazul, "cell 2 3");
		
		
		rdbtnrojo = new JRadioButton("Rojo");
		rdbtnrojo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiocolor(Color.red);
			}
		});
		buttonGroup.add(rdbtnrojo);
		contentPane.add(rdbtnrojo, "cell 2 4");
		
		panelcolor = new JPanel();
		panelcolor.setBackground(new Color(0, 0, 255));
		contentPane.add(panelcolor, "cell 5 2 1 6,grow");
		
		rdbtnverde = new JRadioButton("Verde");
		rdbtnverde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiocolor(Color.green);
			}
		});
		buttonGroup.add(rdbtnverde);
		contentPane.add(rdbtnverde, "cell 2 5");
		
		rdbtnmagenta = new JRadioButton("Magenta");
		rdbtnmagenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambiocolor(Color.magenta);
			}
		});
		buttonGroup.add(rdbtnmagenta);
		contentPane.add(rdbtnmagenta, "cell 2 6");
	}
	
	protected void cambiocolor(Color color) {
		panelcolor.setBackground(color);
}
}