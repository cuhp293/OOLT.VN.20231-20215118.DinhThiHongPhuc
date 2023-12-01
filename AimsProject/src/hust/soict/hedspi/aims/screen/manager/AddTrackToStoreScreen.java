package hust.soict.hedspi.aims.screen.manager;

import javax.swing.JFrame;

import hust.soict.hedspi.aims.media.CompactDisc;

public class AddTrackToStoreScreen extends JFrame {
	
	private static CompactDisc CD;

	public AddTrackToStoreScreen(CompactDisc CD) {
		super();
		this.CD = CD;
		
		this.setTitle("Add Track");
		this.setSize(600, 300);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new AddTrackToStoreScreen(CD);
	}

}
