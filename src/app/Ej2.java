package app;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ej2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtNota1;
	private JTextField txtNota2;
	private JTextField txtNota3;
	private JLabel lblNota2;
	private JLabel lblNota3;
	private JButton btnCalcular;
	private JLabel lblPromedio;
	private JLabel lblResultado;
	private JLabel lblprom;
	private JLabel lblres;

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ej2 frame = new Ej2();
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
	public Ej2() {
		setTitle("CALCULO DE PROMEDIO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setOpaque(false);

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][34.00px][85.00px,grow][46.00][85.00px,grow][45.00][83.00px,grow][leading]", "[-11.00px][41.00px][17.00][30.00px][][27.00px][][grow][26.00][grow][24.00,grow][]"));
		
		JLabel lbltitulo = new JLabel("CALCULAR PROMEDIO");
		lbltitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lbltitulo.setOpaque(true);
		lbltitulo.setForeground(new Color(255, 255, 255));
		lbltitulo.setBackground(new Color(0, 0, 0));
		contentPane.add(lbltitulo, "cell 0 1 8 1,grow");
		
		JLabel lblNombre = new JLabel("Nombre:");
		contentPane.add(lblNombre, "cell 1 3,alignx left,aligny center");
		
		txtNombre = new JTextField();
		contentPane.add(txtNombre, "cell 2 3 5 1,grow");
		txtNombre.setColumns(10);
		
		JLabel lblNota1 = new JLabel("Nota 1:");
		lblNota1.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNota1, "cell 1 5,alignx left,aligny center");
		
		txtNota1 = new JTextField();
		contentPane.add(txtNota1, "cell 2 5,alignx leading,growy");
		txtNota1.setColumns(10);
		
		lblNota2 = new JLabel("Nota 2:");
		contentPane.add(lblNota2, "cell 3 5,alignx left");
		
		txtNota2 = new JTextField();
		contentPane.add(txtNota2, "cell 4 5,grow");
		txtNota2.setColumns(10);
		
		lblNota3 = new JLabel("Nota 3:");
		contentPane.add(lblNota3, "cell 5 5,alignx left");
		
		txtNota3 = new JTextField();
		contentPane.add(txtNota3, "cell 6 5,grow");
		txtNota3.setColumns(10);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				media();
			}
		});
		contentPane.add(btnCalcular, "cell 6 7");
		
		lblPromedio = new JLabel("Promedio:");
		lblPromedio.setFont(new Font("Arial", Font.BOLD, 14));
		contentPane.add(lblPromedio, "cell 1 8,alignx left");
		
		lblprom = new JLabel("");
		lblprom.setFont(new Font("Arial", Font.PLAIN, 12));
		contentPane.add(lblprom, "cell 2 8 4 1");
		
		lblResultado = new JLabel("Resultado:");
		lblResultado.setFont(new Font("Arial", Font.BOLD, 14));
		contentPane.add(lblResultado, "cell 1 10,alignx left");
		
		lblres = new JLabel("");
		lblres.setFont(new Font("Arial", Font.PLAIN, 12));
		contentPane.add(lblres, "cell 2 10 3 1");
	}	
	
	protected void media() {
		double nota1= Double.parseDouble(txtNota1.getText());
		double nota2= Double.parseDouble(txtNota2.getText());
		double nota3= Double.parseDouble(txtNota3.getText());
		double Res=(nota1+nota2+nota3)/3;
		this.lblprom.setText(String.format("%.2f",Res));
		if (Res>=5) {
			this.lblres.setText(String.format("Ha aprobado la asignatura"));
	} else {
		this.lblres.setText(String.format("Toca recuperar"));
		}

	}
}