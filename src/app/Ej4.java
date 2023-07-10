package app;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ej4 extends JFrame {

	private JPanel contentPane;
	private JCheckBox chckbxJuegos;
	private JCheckBox chckbxTecnologia;
	private JCheckBox chckbxDeportes;
	private JCheckBox chckbxCocina;
	private JTextArea textSelect;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ej4 frame = new Ej4();
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
	public Ej4() {
		setTitle("Habilitar/Deshabilitar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setOpaque(false);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][100.00][244.00,grow][]", "[22.00][11.00][34.00][35.00][34.00][32.00][42.00]"));
		
		JLabel lblHobbies = new JLabel("Hobbies:");
		lblHobbies.setHorizontalAlignment(SwingConstants.LEFT);
		contentPane.add(lblHobbies, "cell 1 0,grow");
		
		JLabel lblSeleccionado = new JLabel("Has seleccionado:");
		lblSeleccionado.setHorizontalAlignment(SwingConstants.LEFT);
		contentPane.add(lblSeleccionado, "cell 2 0,alignx left,growy");
		
		chckbxDeportes = new JCheckBox("Deportes");
		contentPane.add(chckbxDeportes, "cell 1 2");
		
		chckbxTecnologia = new JCheckBox("Tecnología");
		contentPane.add(chckbxTecnologia, "cell 1 3");
		
		textSelect = new JTextArea();
		contentPane.add(textSelect, "cell 2 2 1 4,grow");
		
		chckbxJuegos = new JCheckBox("Juegos");
		contentPane.add(chckbxJuegos, "cell 1 4");
		
		chckbxCocina = new JCheckBox("Cocina");
		contentPane.add(chckbxCocina, "cell 1 5");
		
		JButton btnNewButton = new JButton("Comprobar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seleccionados();
			}
		});
		contentPane.add(btnNewButton, "cell 2 6,alignx left,aligny bottom");
	}

	protected void seleccionados() {
		textSelect.setText("");
		 if (chckbxDeportes.isSelected()) {
			 this.textSelect.setText(chckbxDeportes.getText());
		 } 
		 if (chckbxTecnologia.isSelected()) {
			 this.textSelect.setText(textSelect.getText()+"\n"+chckbxTecnologia.getText());
		 } 
		 if (chckbxJuegos.isSelected()) {
			 this.textSelect.setText(textSelect.getText()+"\n"+chckbxJuegos.getText());
		 }
		 if (chckbxCocina.isSelected()) {
			 this.textSelect.setText(textSelect.getText()+"\n"+chckbxCocina.getText()); 
		}
			 if (!chckbxDeportes.isSelected() && !chckbxTecnologia.isSelected() &&	//Se realiza así en vez de con un else ya que  
					 !chckbxJuegos.isSelected()	&& !chckbxCocina.isSelected())
				 this.textSelect.setText("No has seleccionado nada");
		 

	}
}
