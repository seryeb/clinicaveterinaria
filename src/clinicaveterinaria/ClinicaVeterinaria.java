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
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ClinicaVeterinaria {
	private JFrame frmClnicaVeterinariaMisif;
	private JTextField nombreCampo;
	private JTextField especieCampo;
	private JTextField alimentacionCampo;
	private JTextField codigoCampo;
	private JTextField observacionesCampo;
	
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
		// Carga de datos de ejemplo de animales
		Pajaro paj1 = new Pajaro("Tucán Zoo", "PA0001", "Ramphastidae", "Basada en semillas", "Pertenece al Zoo. Prohibida su venta","Macho");
		Pajaro paj2 = new Pajaro("Canario Doméstico 1", "PA0002", "Serinus canaria domestica", "Basada en semillas", "Criado en tienda","Macho");
		Pajaro paj3 = new Pajaro("Loro Peron", "PA0003", "Psitacoideos", "Basada en semillas", "Criada en tienda","Hembra");
		Pez pez1 = new Pez("Arowana Crimson Red", "PE0001", "Scleropages Formosus", "Pienso específico para peces ornamentales", "Criada en tienda","Hembra");
		Pez pez2 = new Pez("Barbo Arcoiris", "PE0002", "Notropis chrosomus", "Pienso específico para peces ornamentales", "Criada en tienda","Macho");
		Pez pez3 = new Pez("LIMIA ALETA NEGRA", "PE0003", "Limia perugiae", "Pienso específico para peces ornamentales", "Adquirida proveedor","Hembra");
		Reptil rep1 = new Reptil("CAMALEON ALFOMBRA", "RE0001", "chamaeleo Lateralis", "Insectos", "Adquirida proveedor","Hembra");
		Reptil rep2 = new Reptil("Tortuga Alligator", "RE0002", "Macroclemys temmicki", "Insectos", "Criada en tienda","Hembra");
		Reptil rep3 = new Reptil("Tortuga Alligator", "RE0003", "Macroclemys temmicki", "Insectos", "Criada en tienda","Macho");
		
		// Definición JFrame
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
		pajaros.setBounds(0, 0, 291, 323);
		superior.add(pajaros);
		pajaros.setBorder(new TitledBorder(new LineBorder(new Color(184, 207, 229)), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(51, 51, 51)));
		pajaros.setLayout(null);
				
		JPanel peces = new JPanel();
		peces.setBounds(290, 0, 291, 323);
		superior.add(peces);
		peces.setBorder(new TitledBorder(new LineBorder(new Color(184, 207, 229)), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(51, 51, 51)));
		peces.setLayout(null);
		
		JLabel pecesTituloEtiqueta = new JLabel("Peces");
		pecesTituloEtiqueta.setFont(new Font("Tahoma", Font.BOLD, 19));
		pecesTituloEtiqueta.setBounds(10, 25, 98, 41);
		peces.add(pecesTituloEtiqueta);
		
					
		JPanel reptiles = new JPanel();
		reptiles.setLayout(null);
		reptiles.setBorder(new TitledBorder(new LineBorder(new Color(184, 207, 229)), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(51, 51, 51)));
		reptiles.setBounds(578, 0, 291, 323);
		superior.add(reptiles);
		
		JLabel reptilesTituloEtiqueta = new JLabel("Reptiles");
		reptilesTituloEtiqueta.setFont(new Font("Tahoma", Font.BOLD, 19));
		reptilesTituloEtiqueta.setBounds(10, 25, 98, 41);
		reptiles.add(reptilesTituloEtiqueta);
		
		JPanel informacion = new JPanel();
		informacion.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		frmClnicaVeterinariaMisif.getContentPane().add(informacion);
		informacion.setLayout(null);
		
		JLabel nombreEtiqueta = new JLabel("Nombre:");
		nombreEtiqueta.setFont(new Font("Tahoma", Font.BOLD, 12));
		nombreEtiqueta.setBounds(24, 41, 55, 28);
		informacion.add(nombreEtiqueta);
		
		nombreCampo = new JTextField();
		nombreCampo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		nombreCampo.setBounds(121, 45, 210, 24);
		informacion.add(nombreCampo);
		nombreCampo.setColumns(10);
		
		JLabel especieEtiqueta = new JLabel("Especie:");
		especieEtiqueta.setFont(new Font("Tahoma", Font.BOLD, 12));
		especieEtiqueta.setBounds(24, 80, 55, 28);
		informacion.add(especieEtiqueta);
		
		especieCampo = new JTextField();
		especieCampo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		especieCampo.setColumns(10);
		especieCampo.setBounds(121, 84, 529, 24);
		informacion.add(especieCampo);
		
		JLabel alimentacionEtiqueta = new JLabel("Alimentaci\u00F3n:");
		alimentacionEtiqueta.setFont(new Font("Tahoma", Font.BOLD, 12));
		alimentacionEtiqueta.setBounds(24, 119, 87, 28);
		informacion.add(alimentacionEtiqueta);
		
		alimentacionCampo = new JTextField();
		alimentacionCampo.setHorizontalAlignment(SwingConstants.LEFT);
		alimentacionCampo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		alimentacionCampo.setColumns(10);
		alimentacionCampo.setBounds(121, 123, 529, 56);
		informacion.add(alimentacionCampo);
		
		JLabel codigoEtiqueta = new JLabel("C\u00F3digo:");
		codigoEtiqueta.setFont(new Font("Tahoma", Font.BOLD, 12));
		codigoEtiqueta.setBounds(372, 41, 55, 28);
		informacion.add(codigoEtiqueta);
		
		codigoCampo = new JTextField();
		codigoCampo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		codigoCampo.setColumns(10);
		codigoCampo.setBounds(437, 45, 213, 24);
		informacion.add(codigoCampo);
		
		JLabel observacionesEtiqueta = new JLabel("Observaciones:");
		observacionesEtiqueta.setFont(new Font("Tahoma", Font.BOLD, 12));
		observacionesEtiqueta.setBounds(24, 202, 96, 28);
		informacion.add(observacionesEtiqueta);
		
		observacionesCampo = new JTextField();
		observacionesCampo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		observacionesCampo.setColumns(10);
		observacionesCampo.setBounds(121, 202, 529, 86);
		informacion.add(observacionesCampo);
		
		JLabel tipoEtiqueta = new JLabel("Tipo:");
		tipoEtiqueta.setFont(new Font("Tahoma", Font.BOLD, 12));
		tipoEtiqueta.setBounds(674, 41, 55, 28);
		informacion.add(tipoEtiqueta);
		
		JRadioButton pajaroRadioBoton = new JRadioButton("P\u00E1jaro");
		pajaroRadioBoton.setEnabled(false);
		pajaroRadioBoton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		pajaroRadioBoton.setBounds(731, 45, 109, 23);
		informacion.add(pajaroRadioBoton);
		
		JRadioButton pezRadioBoton = new JRadioButton("Pez");
		pezRadioBoton.setEnabled(false);
		pezRadioBoton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		pezRadioBoton.setBounds(731, 71, 109, 23);
		informacion.add(pezRadioBoton);
		
		JRadioButton reptilRadioBoton = new JRadioButton("Reptil");
		reptilRadioBoton.setEnabled(false);
		reptilRadioBoton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		reptilRadioBoton.setBounds(731, 96, 109, 23);
		informacion.add(reptilRadioBoton);
		
		// Botón de grupo para el animal
		ButtonGroup animalBG = new ButtonGroup();
		animalBG.add(pajaroRadioBoton);
		animalBG.add(pezRadioBoton);
		animalBG.add(reptilRadioBoton);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(674, 136, 142, 2);
		informacion.add(separator);
		
		JLabel generoEtiqueta = new JLabel("G\u00E9nero:");
		generoEtiqueta.setFont(new Font("Tahoma", Font.BOLD, 12));
		generoEtiqueta.setBounds(674, 151, 55, 28);
		informacion.add(generoEtiqueta);
		
		JRadioButton machoRadioBoton = new JRadioButton("Macho");
		machoRadioBoton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		machoRadioBoton.setBounds(731, 151, 109, 23);
		informacion.add(machoRadioBoton);
		
		JRadioButton hembraRadioBoton = new JRadioButton("Hembra");
		hembraRadioBoton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		hembraRadioBoton.setBounds(731, 177, 109, 23);
		informacion.add(hembraRadioBoton);
		
		// Botón de grupo para el género
		ButtonGroup generoBG = new ButtonGroup();
		generoBG.add(machoRadioBoton);
		generoBG.add(hembraRadioBoton);
				
		JButton GuardarCambiosBoton = new JButton("Guardar cambios");
		GuardarCambiosBoton.setEnabled(false);
		GuardarCambiosBoton.setFont(new Font("Tahoma", Font.BOLD, 12));
		GuardarCambiosBoton.setBounds(674, 249, 142, 39);
		informacion.add(GuardarCambiosBoton);
		
		JLabel informacionTituloEtiqueta = new JLabel("Informaci\u00F3n");
		informacionTituloEtiqueta.setFont(new Font("Tahoma", Font.BOLD, 19));
		informacionTituloEtiqueta.setBounds(24, -7, 142, 41);
		informacion.add(informacionTituloEtiqueta);
		
		// Lista para objetos Pajaro
		PajaroListModel pajaro_model = new PajaroListModel();
		
		// Botón añadir pájaro
		JButton anadirPajaroBoton = new JButton("+");
		anadirPajaroBoton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				JTextField nombreC = new JTextField();
				JTextField codigoC = new JTextField();
				JTextField especieC = new JTextField();
				JTextField alimentacionC = new JTextField();
				JTextField observacionesC = new JTextField();
				JComboBox generoC = new JComboBox();
				generoC.setModel(new DefaultComboBoxModel(new String[] {"Macho", "Hembra"}));
				
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
					Pajaro p = new Pajaro(nombreC.getText(), codigoC.getText(), especieC.getText(), alimentacionC.getText(), observacionesC.getText(),(String)generoC.getSelectedItem());
					pajaro_model.addPajaro(p);
					
				}
			}
		});
		
		anadirPajaroBoton.setFont(new Font("Tahoma", Font.BOLD, 19));
		anadirPajaroBoton.setBounds(128, 11, 65, 64);
		pajaros.add(anadirPajaroBoton);
		
		// Lista de los pájaros
		JList listaPajaros = new JList();
		// Seleccionar un pájaro
		listaPajaros.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int selection = listaPajaros.getSelectedIndex();
				if (selection!=-1) {
				     Pajaro p = pajaro_model.getPajaro(selection);
				     nombreCampo.setText(p.getNombre());
				     codigoCampo.setText(p.getCodigo());
				     especieCampo.setText(p.getEspecie());
				     alimentacionCampo.setText(p.getAlimentacion());
				     observacionesCampo.setText(p.getObservaciones());
				     if (p.getGenero() == "Macho") {
				    	 machoRadioBoton.setSelected(true);
				     } else {
				    	 hembraRadioBoton.setSelected(true);
				     }
				     pajaroRadioBoton.setSelected(true);
				}
			}
		});
		listaPajaros.setBounds(28, 86, 238, 199);
		pajaros.add(listaPajaros);
		listaPajaros.setModel(pajaro_model);
		
		// Botón eliminar pájaros
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
		eliminarPajaroBoton.setFont(new Font("Tahoma", Font.BOLD, 19));
		eliminarPajaroBoton.setBounds(201, 11, 65, 64);
		pajaros.add(eliminarPajaroBoton);
		
		JLabel pajarosTituloEtiqueta = new JLabel("P\u00E1jaros");
		pajarosTituloEtiqueta.setFont(new Font("Tahoma", Font.BOLD, 19));
		pajarosTituloEtiqueta.setBounds(28, 25, 98, 41);
		pajaros.add(pajarosTituloEtiqueta);
		
		// Lista para objetos Pez
		PezListModel pez_model = new PezListModel();
		// Botón añadir Pez
		JButton anadirPezBoton = new JButton("+");
		anadirPezBoton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				JTextField nombreC = new JTextField();
				JTextField codigoC = new JTextField();
				JTextField especieC = new JTextField();
				JTextField alimentacionC = new JTextField();
				JTextField observacionesC = new JTextField();
				JComboBox generoC = new JComboBox();
				generoC.setModel(new DefaultComboBoxModel(new String[] {"Macho", "Hembra"}));
				
				Object[] message = {
				    "Nombre:", nombreC,
				    "Código:", codigoC,
				    "Especie:", especieC,
				    "Alimentación:", alimentacionC,
				    "Observaciones:", observacionesC,
				    "Género:", generoC,
				};
				int option = JOptionPane.showConfirmDialog(frmClnicaVeterinariaMisif, message, "Indique los valores del pez", JOptionPane.OK_CANCEL_OPTION);
				if (option == JOptionPane.OK_OPTION)
				{
					Pez p = new Pez(nombreC.getText(), codigoC.getText(), especieC.getText(), alimentacionC.getText(), observacionesC.getText(),(String)generoC.getSelectedItem());
					pez_model.addPez(p);
					
				}
			}
		});
		
		anadirPezBoton.setFont(new Font("Tahoma", Font.BOLD, 19));
		anadirPezBoton.setBounds(128, 11, 65, 64);
		peces.add(anadirPezBoton);
		
		// Lista de los peces
		JList listaPeces = new JList();
		// Seleccionar un pez
		listaPeces.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int selection = listaPeces.getSelectedIndex();
				if (selection!=-1) {
				     Pez p = pez_model.getPez(selection);
				     nombreCampo.setText(p.getNombre());
				     codigoCampo.setText(p.getCodigo());
				     especieCampo.setText(p.getEspecie());
				     alimentacionCampo.setText(p.getAlimentacion());
				     observacionesCampo.setText(p.getObservaciones());
				     if (p.getGenero() == "Macho") {
				    	 machoRadioBoton.setSelected(true);
				     } else {
				    	 hembraRadioBoton.setSelected(true);
				     }
				     pezRadioBoton.setSelected(true);
				}
			}
		});
		listaPeces.setBounds(28, 86, 238, 199);
		peces.add(listaPeces);
		listaPeces.setModel(pez_model);
		
		// Botón eliminar peces
		JButton eliminarPezBoton = new JButton("-");
		eliminarPezBoton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				int selection = listaPeces.getSelectedIndex();
				if (selection!=-1) {
				   pez_model.eliminarPez(selection);
				}
			}
		});
		eliminarPezBoton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		eliminarPezBoton.setFont(new Font("Tahoma", Font.BOLD, 19));
		eliminarPezBoton.setBounds(201, 11, 65, 64);
		peces.add(eliminarPezBoton);
		
		// Lista para objetos Reptil
		ReptilListModel reptil_model = new ReptilListModel();
		// Botón añadir Reptil
		JButton anadirReptilBoton = new JButton("+");
		anadirReptilBoton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				JTextField nombreC = new JTextField();
				JTextField codigoC = new JTextField();
				JTextField especieC = new JTextField();
				JTextField alimentacionC = new JTextField();
				JTextField observacionesC = new JTextField();
				JComboBox generoC = new JComboBox();
				generoC.setModel(new DefaultComboBoxModel(new String[] {"Macho", "Hembra"}));
				
				Object[] message = {
				    "Nombre:", nombreC,
				    "Código:", codigoC,
				    "Especie:", especieC,
				    "Alimentación:", alimentacionC,
				    "Observaciones:", observacionesC,
				    "Género:", generoC,
				};
				int option = JOptionPane.showConfirmDialog(frmClnicaVeterinariaMisif, message, "Indique los valores del reptil", JOptionPane.OK_CANCEL_OPTION);
				if (option == JOptionPane.OK_OPTION)
				{
					Reptil p = new Reptil(nombreC.getText(), codigoC.getText(), especieC.getText(), alimentacionC.getText(), observacionesC.getText(),(String)generoC.getSelectedItem());
					reptil_model.addReptil(p);
					
				}
			}
		});
		
		anadirReptilBoton.setFont(new Font("Tahoma", Font.BOLD, 19));
		anadirReptilBoton.setBounds(128, 11, 65, 64);
		reptiles.add(anadirReptilBoton);
		
		// Lista de los reptiles
		JList listaReptiles = new JList();
		// Seleccionar un reptil
		listaReptiles.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int selection = listaReptiles.getSelectedIndex();
				if (selection!=-1) {
				     Reptil p = reptil_model.getReptil(selection);
				     nombreCampo.setText(p.getNombre());
				     codigoCampo.setText(p.getCodigo());
				     especieCampo.setText(p.getEspecie());
				     alimentacionCampo.setText(p.getAlimentacion());
				     observacionesCampo.setText(p.getObservaciones());
				     if (p.getGenero() == "Macho") {
				    	 machoRadioBoton.setSelected(true);
				     } else {
				    	 hembraRadioBoton.setSelected(true);
				     }
				     reptilRadioBoton.setSelected(true);
				}
			}
		});
		listaReptiles.setBounds(28, 86, 238, 199);
		reptiles.add(listaReptiles);
		listaReptiles.setModel(reptil_model);
		
		// Botón eliminar reptiles
		JButton eliminarReptilBoton = new JButton("-");
		eliminarReptilBoton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				int selection = listaReptiles.getSelectedIndex();
				if (selection!=-1) {
				   reptil_model.eliminarReptil(selection);
				}
			}
		});
		eliminarReptilBoton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		eliminarReptilBoton.setFont(new Font("Tahoma", Font.BOLD, 19));
		eliminarReptilBoton.setBounds(201, 11, 65, 64);
		reptiles.add(eliminarReptilBoton);

		
		// Los anhadimos a las listas
		pajaro_model.addPajaro(paj1);
		pajaro_model.addPajaro(paj2);
		pajaro_model.addPajaro(paj3);
		pez_model.addPez(pez1);
		pez_model.addPez(pez2);
		pez_model.addPez(pez3);
		reptil_model.addReptil(rep1);
		reptil_model.addReptil(rep2);
		reptil_model.addReptil(rep3);
		
		// Listeners para saber si modificamos un animal en Informacion (Keypress/MouseClick)
		nombreCampo.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				GuardarCambiosBoton.setEnabled(true);;
			}
		});
		codigoCampo.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				GuardarCambiosBoton.setEnabled(true);;
			}
		});
		especieCampo.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				GuardarCambiosBoton.setEnabled(true);;
			}
		});
		alimentacionCampo.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				GuardarCambiosBoton.setEnabled(true);;
			}
		});
		observacionesCampo.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				GuardarCambiosBoton.setEnabled(true);;
			}
		});
		machoRadioBoton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				GuardarCambiosBoton.setEnabled(true);;
			}
		});
		hembraRadioBoton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				GuardarCambiosBoton.setEnabled(true);;
			}
		});
	
		// Acción del botón Guardar Cambios
		GuardarCambiosBoton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int selectionPajaros = listaPajaros.getSelectedIndex();
				int selectionPeces = listaPeces.getSelectedIndex();
				int selectionReptiles = listaReptiles.getSelectedIndex();
				Animal p = new Animal(null, null, null, null, null, null);
				if (pajaroRadioBoton.isSelected()) {
					Pajaro p1 = pajaro_model.getPajaro(selectionPajaros);
					p=p1;
				}else if(pezRadioBoton.isSelected()){
					Pez p2 = pez_model.getPez(selectionPeces);
					p=p2;
				}else {
					Reptil p3 = reptil_model.getReptil(selectionReptiles);
					p=p3;					
				}
					if (nombreCampo.getText() != p.getNombre()) {
						p.setNombre(nombreCampo.getText());
					}
					if (codigoCampo.getText() != p.getCodigo()) {
						p.setCodigo(codigoCampo.getText());
					}
					if (especieCampo.getText() != p.getEspecie()) {
						p.setEspecie(especieCampo.getText());
					}
					if (alimentacionCampo.getText() != p.getAlimentacion()) {
						p.setAlimentacion(alimentacionCampo.getText());
					}
					if (observacionesCampo.getText() != p.getObservaciones()) {
						p.setObservaciones(observacionesCampo.getText());
					}
					if (machoRadioBoton.isSelected() && p.getGenero() == "Hembra") {
						p.setGenero("Macho");
					}
					if (hembraRadioBoton.isSelected() && p.getGenero() == "Macho") {
						p.setGenero("Hembra");
					}
				GuardarCambiosBoton.setEnabled(false);
			}
		});
		
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
