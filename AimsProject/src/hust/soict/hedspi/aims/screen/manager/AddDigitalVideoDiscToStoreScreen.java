package hust.soict.hedspi.aims.screen.manager;

import hust.soict.hedspi.aims.store.Store;

public class AddDigitalVideoDiscToStoreScreen extends AddItemToStoreScreen {
	
	public AddDigitalVideoDiscToStoreScreen(Store store) {
		super(store);
		this.setTitle("Add DVD");
	}

	public static void main(String[] args) {
		new AddDigitalVideoDiscToStoreScreen(store);
	}

}
