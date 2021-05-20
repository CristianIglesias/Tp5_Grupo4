package dominio;

import javax.swing.JPanel;

import java.util.Iterator;
import java.util.TreeSet;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;

	public class PanelListar extends JPanel {
	private DefaultListModel <Peliculas>dlModelListar;
	private JList<Peliculas> list;

	public PanelListar(DefaultListModel <Peliculas>dlm) {
		this.dlModelListar= dlm;
		dibujarControles();
	}
	public void dibujarControles() {
		setLayout(null);
		
		
		JLabel lblPeliculas = new JLabel("Peliculas");
		lblPeliculas.setBounds(38, 108, 70, 14);
		add(lblPeliculas);
		
		list = new JList<Peliculas>();
		list.setBounds(143, 31, 203, 166);
		ordenarListModel();
		list.setModel(dlModelListar);
		add(list);
	}
	public void setDefaultListModel(DefaultListModel<Peliculas> dlm) {
		this.dlModelListar=dlm;
	}
	private void ordenarListModel() {
		TreeSet <Peliculas> aux= new TreeSet<Peliculas>();
		for(int i=0;i<dlModelListar.size();i++) {
			aux.add((Peliculas)dlModelListar.elementAt(i));
		}
		dlModelListar.removeAllElements();
		Iterator<Peliculas> iterator= aux.iterator();
		while(iterator.hasNext()) {
			dlModelListar.addElement((Peliculas)iterator.next());
		}
	}
}
