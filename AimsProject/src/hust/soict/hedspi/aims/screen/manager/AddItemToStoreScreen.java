package hust.soict.hedspi.aims.screen.manager;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AddItemToStoreScreen extends JFrame {
	
	JPanel createCenter() {
		JPanel center = new JPanel();
		center.setLayout(new BoxLayout(center, BoxLayout.Y_AXIS));

		JTextField titleField = new JTextField("Input title : ");
		JTextField authorField = new JTextField("Input author : ");
		JTextField costField = new JTextField("Input cost : ");

		center.add(titleField);
		center.add(authorField);
		center.add(costField);

		return center;
	}
	
	protected JTextField createTextField(String text) {
		JTextField textField = new JTextField(text);
		textField.setMaximumSize(new Dimension(500, 30));
		textField.setBorder(BorderFactory.createCompoundBorder(
				BorderFactory.createLineBorder(Color.DARK_GRAY),
				BorderFactory.createEmptyBorder(0, 20, 0, 0)));
		textField.setMargin(new Insets(10, 10, 10, 10));
		return textField;
	}

}
