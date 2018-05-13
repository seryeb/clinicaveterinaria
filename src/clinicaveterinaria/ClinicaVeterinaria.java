package clinicaveterinaria;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JRadioButton;
import javax.swing.JList;

public class ClinicaVeterinaria {
	private JFrame frmClnicaVeterinariaMisif;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClinicaVeterinaria window = new ClinicaVeterinaria();
					window.frmClnicaVeterinariaMisif.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the application.
	 */
	public ClinicaVeterinaria() {
		initialize();
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmClnicaVeterinariaMisif = new JFrame();
		frmClnicaVeterinariaMisif.setTitle("Clínica Veterinaria Misifú");
		frmClnicaVeterinariaMisif.setResizable(false);
		frmClnicaVeterinariaMisif.setBounds(100, 100, 875, 675);
		frmClnicaVeterinariaMisif.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmClnicaVeterinariaMisif.getContentPane().setLayout(new GridLayout(2, 0, 0, 0));
		
		JPanel superior = new JPanel();
		superior.setBorder(new TitledBorder(null, "Pájaros", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		frmClnicaVeterinariaMisif.getContentPane().add(superior);
		superior.setLayout(null);
		
		JPanel pajaros = new JPanel();
		pajaros.setBounds(0, 0, 291, 307);
		superior.add(pajaros);
		pajaros.setBorder(new TitledBorder(new LineBorder(new Color(184, 207, 229)), "P\u00E1jaros", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(51, 51, 51)));
		pajaros.setLayout(null);
		
		JPanel peces = new JPanel();
		peces.setBounds(289, 0, 291, 307);
		superior.add(peces);
		peces.setBorder(new TitledBorder(new LineBorder(new Color(184, 207, 229)), "Peces", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(51, 51, 51)));
		peces.setLayout(null);
		
		JPanel reptiles = new JPanel();
		reptiles.setLayout(null);
		reptiles.setBorder(new TitledBorder(new LineBorder(new Color(184, 207, 229)), "Reptiles", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(51, 51, 51)));
		reptiles.setBounds(584, 0, 291, 307);
		superior.add(reptiles);
		
		JPanel informacion = new JPanel();
		informacion.setBorder(new TitledBorder(null, "Información", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		frmClnicaVeterinariaMisif.getContentPane().add(informacion);
		informacion.setLayout(null);
	}
}
