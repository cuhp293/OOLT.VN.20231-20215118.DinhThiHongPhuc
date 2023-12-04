package hust.soict.hedspi.aims.screen.manager;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AddCompactDiscToStoreScreen extends AddItemToStoreScreen {
	
	JPanel createCenter() {
		JPanel panel = super.createCenter();

		JTextField lengthField = new JTextField("Input length: ");
		JTextField directorField = new JTextField("Input director: ");
		JTextField artistField = new JTextField("Input artist: ");

		panel.add(lengthField);
		panel.add(directorField);
		panel.add(artistField);

		JButton btnAdd = new JButton("Add CD to the store");
		panel.add(btnAdd);

		return panel;
	}

}
