package app;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ej9 extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton rdbtnNo;
	private JButton btnsiguiente;
	private JRadioButton rdbtnaceptar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ej9 frame = new Ej9();
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
	public Ej9() {
		setTitle("Panel de Scroll");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][233.00,grow][]", "[][21.00][20.00][grow][][][][13.00]"));
		
		JLabel lbltitulo = new JLabel("Aceptar las condiciones del servicio");
		lbltitulo.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lbltitulo, "cell 1 0,alignx left");
		
		JLabel lbltitulo2 = new JLabel("Acuerdo de licencia");
		lbltitulo2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		contentPane.add(lbltitulo2, "cell 1 1");
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, "cell 0 2 2 2,grow");
		
		JTextPane txtpntexto = new JTextPane();
		txtpntexto.setEditable(false);
		txtpntexto.setText("Usamos cookies y tecnologías similares para proporcionar y mejorar el contenido en los Productos de Meta. También las utilizamos para ofrecer una experiencia más segura (a este fin, empleamos información que recibimos de cookies dentro y fuera de Instagram) y para proporcionar y mejorar los Productos de Meta para las personas que tienen una cuenta.\r\n\r\nCookies necesarias: son imprescindibles para usar los Productos de Meta y son necesarias para que nuestros sitios funcionen del modo previsto.\r\nCookies de otras empresas: utilizamos estas cookies para mostrarte anuncios fuera de los Productos de Meta y proporcionar funciones, como mapas y vídeos, en los Productos de Meta. Estas cookies son opcionales.\r\nTú decides qué cookies opcionales usamos. Obtén más información sobre las cookies y cómo las usamos, y revisa o cambia tus preferencias cuando quieras en nuestra Política de cookies.\r\n\r\n");
		scrollPane.setViewportView(txtpntexto);
		
		rdbtnaceptar = new JRadioButton("Aceptar Condiciones de Servicio");
		rdbtnaceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		rdbtnaceptar.setSelected(true);
		buttonGroup.add(rdbtnaceptar);
		contentPane.add(rdbtnaceptar, "cell 1 4");
		
		rdbtnNo = new JRadioButton("No aceptar");
		buttonGroup.add(rdbtnNo);
		contentPane.add(rdbtnNo, "cell 1 5");
		
		btnsiguiente = new JButton("Siguiente");
		btnsiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aceptar();
			}
		});
		contentPane.add(btnsiguiente, "cell 1 6,alignx center");
	}

	protected void aceptar() {
			if (rdbtnaceptar.isSelected()) {
			JOptionPane.showMessageDialog(contentPane, "Pasa por caja", " Ha aceptado las condiciones ", JOptionPane.INFORMATION_MESSAGE);
			} else if (rdbtnNo.isSelected()) {
			int respuesta=JOptionPane.showConfirmDialog(contentPane, "¿Está seguro?", " No ha aceptado las condiciones", JOptionPane.YES_NO_OPTION);
			if (respuesta==JOptionPane.YES_OPTION) {
				JOptionPane.showMessageDialog(contentPane, " La próxima vez será", " Una pena ", JOptionPane.INFORMATION_MESSAGE);
			} else if (respuesta==JOptionPane.NO_OPTION) {
				JOptionPane.showMessageDialog(contentPane, " Pasa por caja...", " Vas a aceptar las condiciones ", JOptionPane.INFORMATION_MESSAGE);
			}
		}

	}
}