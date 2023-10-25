package unidad_19_2;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class vista1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	ArrayList<String> peliculas =new ArrayList<>();
	JComboBox comboBox = new JComboBox();
	
	public vista1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 383, 202);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Escribe el titulo de la pelicula");
		lblNewLabel.setBounds(28, 11, 149, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Añadir");
		btnNewButton.setBounds(50, 67, 89, 23);
		btnNewButton.addActionListener(a1);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(28, 36, 138, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		peliculas.add("Harry potter");
		peliculas.add("Batman");
		peliculas.add("Barbie");
		String[] peliculas_inicial = peliculas.toArray(new String[peliculas.size()]);
		comboBox.setModel(new DefaultComboBoxModel(peliculas_inicial));
		comboBox.setBounds(197, 35, 126, 22);
		contentPane.add(comboBox);
	}

	
	ActionListener a1 = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if (textField.getText().length() != 0) {
				 peliculas.add( textField.getText());
				    comboBox.setModel(new DefaultComboBoxModel(peliculas.toArray(new String[peliculas.size()])));
				    JOptionPane.showMessageDialog(null, "Pelicula añadida ");
			}else {
				JOptionPane.showMessageDialog(null, "La pelicula no puede estar en blanco");
			}
		   
		}
	};
}
