package hust.soict.hedspi.aims.screen.manager;

import hust.soict.hedspi.aims.store.Store;

public class AddBookToStoreScreen extends AddItemToStoreScreen {
	
	public AddBookToStoreScreen(Store store) {
		super(store);
		this.setTitle("Add Book");
	}

	public static void main(String[] args) {
		new AddBookToStoreScreen(store);
	}

}
