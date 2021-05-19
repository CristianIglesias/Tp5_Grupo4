package dominio;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class Programa extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	
	//Controles declarados en la clase.
	private JMenuBar menuBar ;
	private JMenu mnNewMenu;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_1;
	private JPanel Agregar;
	private JLabel LbliD;
	private JLabel lbl_ID;
	private JLabel lblNombre;
	private JLabel lblGenero ;
	private JTextField txtNom;
	
	public Programa() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Peliculas");
		mnNewMenu.setFont(new Font("Segoe UI", Font.BOLD, 12));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Agregar");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Listar");
		mnNewMenu.add(mntmNewMenuItem_1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel Agregar = new JPanel();
		Agregar.setBounds(10, 11, 245, 149);
		contentPane.add(Agregar);
		Agregar.setLayout(null);
		
		JLabel Lbl_ID_estatico = new JLabel("ID");
		Lbl_ID_estatico.setBounds(21, 20, 86, 23);
		Agregar.add(Lbl_ID_estatico);
		
		JLabel lbl_ID = new JLabel();///asdadasdadadasdadasdasd
		lbl_ID.setBounds(145, 17, 62, 29);
		Agregar.add(lbl_ID);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(21, 57, 86, 23);
		Agregar.add(lblNombre);
		
		JLabel lblGenero = new JLabel("Genero");
		lblGenero.setBounds(22, 93, 86, 23);
		Agregar.add(lblGenero);
		
		txtNombre = new JTextField();
		txtNombre.setText("de Pelicula\r\n\r\n");
		txtNombre.setBounds(125, 56, 86, 20);
		Agregar.add(txtNombre);
		txtNombre.setColumns(10);
		
		JComboBox comboBoxGenero = new JComboBox();
		comboBoxGenero.setToolTipText("");
		comboBoxGenero.setBounds(101, 91, 120, 20);
		Agregar.add(comboBoxGenero);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(25, 123, 89, 23);
		Agregar.add(btnAceptar);
	}

}
