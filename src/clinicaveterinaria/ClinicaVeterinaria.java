package clinicaveterinaria;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.AbstractListModel;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JRadioButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JTable;
import javax.swing.JPopupMenu;
import java.awt.Component;

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
	 * Listas
	 */
	
	public class PajaroListModel extends AbstractListModel{
		private ArrayList<Pajaro> listaPajaros = new ArrayList<>();
	    @Override
	    public int getSize() {
	    	return listaPajaros.size();
	    }
	    @Override
	    public Object getElementAt(int index) {
	    	   Pajaro a1 = listaPajaros.get(index);
	    	   return a1.getNombre();
	    }
	    public void addPajaro(Pajaro p){
	        listaPajaros.add(p);
	        this.fireIntervalAdded(this, getSize(), getSize()+1);
	    }
	    public void eliminarPajaro(int index0){
	        listaPajaros.remove(index0);
	        this.fireIntervalRemoved(index0, getSize(), getSize()+1);
	    }
	    public Pajaro getPajaro(int index){
	        return listaPajaros.get(index);
	    }
	}
		
	public class PezListModel extends AbstractListModel{
		private ArrayList<Pez> listaPeces = new ArrayList<>();
	    @Override
	    public int getSize() {
	    	return listaPeces.size();
	    }
	    @Override
	    public Object getElementAt(int index) {
	    	   Pez a2 = listaPeces.get(index);
	    	   return a2.getNombre();
	    }
	    public void addPez(Pez p){
	        listaPeces.add(p);
	        this.fireIntervalAdded(this, getSize(), getSize()+1);
	    }
	    public void eliminarPez(int index0){
	        listaPeces.remove(index0);
	        this.fireIntervalRemoved(index0, getSize(), getSize()+1);
	    }
	    public Pez getPez(int index){
	        return listaPeces.get(index);
	    }
	}
	public class ReptilListModel extends AbstractListModel{
		private ArrayList<Reptil> listaReptiles = new ArrayList<>();
	    @Override
	    public int getSize() {
	    	return listaReptiles.size();
	    }
	    @Override
	    public Object getElementAt(int index) {
	    	   Reptil a3 = listaReptiles.get(index);
	    	   return a3.getNombre();
	    }
	    public void addReptil(Reptil p){
	        listaReptiles.add(p);
	        this.fireIntervalAdded(this, getSize(), getSize()+1);
	    }
	    public void eliminarReptil(int index0){
	        listaReptiles.remove(index0);
	        this.fireIntervalRemoved(index0, getSize(), getSize()+1);
	    }
	    public Reptil getReptil(int index){
	        return listaReptiles.get(index);
	    }
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmClnicaVeterinariaMisif = new JFrame();
		frmClnicaVeterinariaMisif.setTitle("Tienda de Mascotas Misif\u00FA");
		frmClnicaVeterinariaMisif.setResizable(false);
		frmClnicaVeterinariaMisif.setBounds(100, 100, 875, 675);
		frmClnicaVeterinariaMisif.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmClnicaVeterinariaMisif.getContentPane().setLayout(new GridLayout(2, 0, 0, 0));
		
		JPanel superior = new JPanel();
		superior.setBorder(new TitledBorder(null, "PÃ¡jaros", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		frmClnicaVeterinariaMisif.getContentPane().add(superior);
		superior.setLayout(null);
		
		JPanel pajaros = new JPanel();
		pajaros.setBounds(0, 0, 291, 307);
		superior.add(pajaros);
		pajaros.setBorder(new TitledBorder(new LineBorder(new Color(184, 207, 229)), "P\u00E1jaros", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(51, 51, 51)));
		pajaros.setLayout(null);
		

		PajaroListModel pajaro_model = new PajaroListModel();
		
		
		JButton anadirPajaroBoton = new JButton("+");
		anadirPajaroBoton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				JTextField nombreC = new JTextField();
				JTextField codigoC = new JTextField();
				JTextField especieC = new JTextField();
				JTextField alimentacionC = new JTextField();
				JTextField observacionesC = new JTextField();
				JTextField generoC = new JTextField();
				
				Object[] message = {
				    "Nombre:", nombreC,
				    "Código:", codigoC,
				    "Especie:", especieC,
				    "Alimentación:", alimentacionC,
				    "Observaciones:", observacionesC,
				    "Género:", generoC,
				};
				int option = JOptionPane.showConfirmDialog(frmClnicaVeterinariaMisif, message, "Indique los valores del pájaro", JOptionPane.OK_CANCEL_OPTION);
				if (option == JOptionPane.OK_OPTION)
				{
					Pajaro p = new Pajaro(nombreC.getText(), codigoC.getText(), especieC.getText(), alimentacionC.getText(), observacionesC.getText(),generoC.getText());
					pajaro_model.addPajaro(p);
					
				}
			}
		});
		anadirPajaroBoton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		anadirPajaroBoton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		anadirPajaroBoton.setBounds(105, 25, 49, 41);
		pajaros.add(anadirPajaroBoton);
		
		JList listaPajaros = new JList();
		listaPajaros.setBounds(32, 86, 234, 199);
		pajaros.add(listaPajaros);
		listaPajaros.setModel(pajaro_model);
		
		JButton eliminarPajaroBoton = new JButton("-");
		eliminarPajaroBoton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				int selection = listaPajaros.getSelectedIndex();
				if (selection!=-1) {
				   pajaro_model.eliminarPajaro(selection);
				}
			}
		});
		eliminarPajaroBoton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		eliminarPajaroBoton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		eliminarPajaroBoton.setBounds(164, 25, 49, 41);
		pajaros.add(eliminarPajaroBoton);
		

		
		JPanel peces = new JPanel();
		peces.setBounds(293, 0, 291, 307);
		superior.add(peces);
		peces.setBorder(new TitledBorder(new LineBorder(new Color(184, 207, 229)), "Peces", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(51, 51, 51)));
		peces.setLayout(null);
				
		JPanel reptiles = new JPanel();
		reptiles.setLayout(null);
		reptiles.setBorder(new TitledBorder(new LineBorder(new Color(184, 207, 229)), "Reptiles", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(51, 51, 51)));
		reptiles.setBounds(584, 0, 291, 307);
		superior.add(reptiles);
		
		JPanel informacion = new JPanel();
		informacion.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Informaci\u00F3n", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		frmClnicaVeterinariaMisif.getContentPane().add(informacion);
		informacion.setLayout(null);
		
		JLabel label = new JLabel("Nombre:");
		label.setBounds(29, 41, 63, 28);
		informacion.add(label);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
