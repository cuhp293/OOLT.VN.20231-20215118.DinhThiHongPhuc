package hust.soict.hedspi.aims.screen.manager;

import hust.soict.hedspi.aims.store.Store;

public class AddCompactDiscToStoreScreen extends AddItemToStoreScreen {
	
	public AddCompactDiscToStoreScreen(Store store) {
		super(store);
		this.setTitle("Add CD");
	}

	public static void main(String[] args) {
		new AddCompactDiscToStoreScreen(store);
	}

}
