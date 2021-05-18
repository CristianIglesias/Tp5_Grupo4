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
	private JTextField textField;


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
		
		JLabel lblNeLabel = new JLabel("Ne label");
		lblNeLabel.setBounds(21, 20, 86, 23);
		Agregar.add(lblNeLabel);
		
		JLabel lblNeLabel_1 = new JLabel("Ne label");
		lblNeLabel_1.setBounds(145, 17, 62, 29);
		Agregar.add(lblNeLabel_1);
		
		JLabel lblNeLabel_2 = new JLabel("Ne label");
		lblNeLabel_2.setBounds(21, 57, 86, 23);
		Agregar.add(lblNeLabel_2);
		
		JLabel lblNeLabel_3 = new JLabel("Ne label");
		lblNeLabel_3.setBounds(22, 93, 86, 23);
		Agregar.add(lblNeLabel_3);
		
		textField = new JTextField();
		textField.setBounds(125, 56, 86, 20);
		Agregar.add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(101, 91, 120, 20);
		Agregar.add(comboBox);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(25, 123, 89, 23);
		Agregar.add(btnNewButton);
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
