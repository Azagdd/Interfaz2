package app;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class Ej8 extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldcantidad;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JButton btncalcular;
	private JRadioButton rtbnYen2;
	private JRadioButton rtbnEur2;
	private JRadioButton rtbnDol2;
	private JRadioButton rtbnYen1;
	private JRadioButton rtbneur1;
	private JRadioButton rtbndol1;
	private Double resultado;
	private JLabel lblResultado;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ej8 frame = new Ej8();
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
	public Ej8() {
		setTitle("Conversión de monedas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][][218.00,grow][]", "[][][][][][][][24.00][]"));
		
		JLabel lblNewLabel = new JLabel("Conversión de monedas");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblNewLabel, "cell 0 0 5 1,alignx center");
		
		JLabel lbl1 = new JLabel("De:");
		contentPane.add(lbl1, "cell 2 2");
		
		rtbndol1 = new JRadioButton("Dólares");
		rtbndol1.setSelected(true);
		buttonGroup.add(rtbndol1);
		contentPane.add(rtbndol1, "flowx,cell 3 2,growx");
		
		rtbneur1 = new JRadioButton("Euros");
		buttonGroup.add(rtbneur1);
		contentPane.add(rtbneur1, "cell 3 2,growx");
		
		rtbnYen1 = new JRadioButton("Yenes");
		buttonGroup.add(rtbnYen1);
		contentPane.add(rtbnYen1, "cell 3 2,growx");
		
		JLabel lbl2 = new JLabel("Cantidad:");
		contentPane.add(lbl2, "cell 2 3");
		
		textFieldcantidad = new JTextField();
		contentPane.add(textFieldcantidad, "cell 3 3,growx");
		textFieldcantidad.setColumns(10);
		
		btncalcular = new JButton("Calcular");
		btncalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				convertir();
			}
		});
		contentPane.add(btncalcular, "cell 3 5,alignx center");
		
		JLabel lbl3 = new JLabel("A:");
		contentPane.add(lbl3, "cell 2 6");
		
		rtbnDol2 = new JRadioButton("Dólares");
		rtbnDol2.setSelected(true);
		buttonGroup_1.add(rtbnDol2);
		contentPane.add(rtbnDol2, "flowx,cell 3 6,growx");
		
		rtbnEur2 = new JRadioButton("Euros");
		buttonGroup_1.add(rtbnEur2);
		contentPane.add(rtbnEur2, "cell 3 6,growx");
		
		rtbnYen2 = new JRadioButton("Yenes");
		buttonGroup_1.add(rtbnYen2);
		contentPane.add(rtbnYen2, "cell 3 6,growx");
		
		JLabel lbl4 = new JLabel("Resultado:");
		contentPane.add(lbl4, "cell 2 7,alignx right");
		
		lblResultado = new JLabel("");
		contentPane.add(lblResultado, "cell 3 7,growx");
	}

	protected void convertir() {
		double calcular=Double.parseDouble(textFieldcantidad.getText());
		double resultado=0;
		if(rtbndol1.isSelected()) {
		if ( rtbneur1.isSelected()) {
		resultado=calcular*0.91;
		lblResultado.setText(String.format("%.2f €", resultado));
		}else if(rtbnYen1.isSelected()) {
		resultado=calcular*142.32;
		lblResultado.setText(String.format("%.2f JPY", resultado));
		} else {
		resultado=calcular;
		lblResultado.setText(String.format("%.2f $", resultado));

		}

		}

		else if (rtbneur1.isSelected()) {
		if(rtbnDol2.isSelected()) {
		resultado=calcular*1.1;
		lblResultado.setText(String.format("%.2f $", resultado));
		} else if (rtbnYen2.isSelected()) {
		resultado=calcular*155.88;

		lblResultado.setText(String.format("%.2f JPY", resultado));
		}else {
		resultado=calcular;

		lblResultado.setText(String.format("%.2f €", resultado));
		}
	}

		else if (rtbnYen1.isSelected()) {
		if(rtbnDol2.isSelected()) {
		resultado=calcular*0.007;
		lblResultado.setText(String.format("%.2f $", resultado));

		} else if (rtbnEur2.isSelected()) {
		resultado=calcular*0.0064;
		lblResultado.setText(String.format("%.2f €", resultado));

		}else {
		resultado=calcular;
		lblResultado.setText(String.format("%.2f JPY", resultado));

			}

		}
	}
}

