package hust.soict.hedspi.aims.screen.manager;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AddTrackToStoreScreen extends AddItemToStoreScreen {
	
	JPanel createCenter() {
		JPanel panel = super.createCenter();
		
		JTextField lengthField = new JTextField("Input track length: ");

		panel.add(lengthField);

		JButton btnAdd = new JButton("Add Track to the store");
		panel.add(btnAdd);

		return panel;
	}

}
