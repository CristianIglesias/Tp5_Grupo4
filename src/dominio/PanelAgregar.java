package dominio;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelAgregar extends JPanel {
	private JTextField txtNombre;
	private DefaultListModel<Peliculas> dlModel;
	private JComboBox<Categorias> comboBox;
	private JButton btnAceptar;
	private ComboBoxModel<Categorias> dlmComboBox;

	public PanelAgregar() {
		setLayout(null);
		
		JLabel lblId = new JLabel("ID");
		lblId.setBounds(59, 50, 46, 14);
		add(lblId);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(59, 92, 46, 14);
		add(lblNombre);
		
		JLabel lblValor = new JLabel(String.valueOf(Peliculas.ProximoID));
		lblValor.setBounds(137, 50, 46, 14);
		add(lblValor);
		
		JLabel lblGenero = new JLabel("Genero");
		lblGenero.setBounds(59, 129, 46, 14);
		add(lblGenero);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(134, 89, 128, 20);
		add(txtNombre);
		txtNombre.setColumns(10);
		
		comboBox = new JComboBox<Categorias>();
		comboBox.setToolTipText("");
		comboBox.setBounds(137, 126, 125, 20);
		
		//comboBox.addItem(new Categorias(-1,"Seleccione Item"));
		comboBox.addItem(new Categorias("Terror"));
		comboBox.addItem(new Categorias("Accion"));
		comboBox.addItem(new Categorias("Suspenso"));
		comboBox.addItem(new Categorias("Romantica"));
		//comboBox.setModel(dlmComboBox);
		comboBox.setSelectedIndex(-1);
		add(comboBox);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtNombre.getText().length()==0 || comboBox.getSelectedIndex()==-1) {
					JOptionPane.showMessageDialog(null,"No se pudo Agregar la pelicula");
					
				}
				else {
					dlModel.addElement(new Peliculas(txtNombre.getText(),(Categorias)comboBox.getSelectedItem()));
					txtNombre.setText("");
					comboBox.setSelectedIndex(-1);
				}
				
				lblValor.setText(String.valueOf(Peliculas.ProximoID));
			}
		});
		btnAceptar.setBounds(137, 165, 89, 23);
		add(btnAceptar);

	}
	public void setDefaultListModel(DefaultListModel<Peliculas> dlm) {
		this.dlModel=dlm;
	}
}
