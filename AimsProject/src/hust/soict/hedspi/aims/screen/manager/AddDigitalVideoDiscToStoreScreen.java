package hust.soict.hedspi.aims.screen.manager;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AddDigitalVideoDiscToStoreScreen extends AddItemToStoreScreen {
	
	JPanel createCenter() {
		JPanel panel = super.createCenter();

		JTextField lengthField = new JTextField("Input length: ");
		JTextField directorField = new JTextField("Input director: ");
		panel.add(lengthField);
		panel.add(directorField);

		JButton btnAdd = new JButton("Add DVD to the store");
		panel.add(btnAdd);

		return panel;
	}

}
