package hust.soict.hedspi.aims.store;

import java.util.ArrayList;
import hust.soict.hedspi.aims.media.Media;

public class Store {
	public static final int MAX_NUMBERS_IN_STORE = 10000;
	private ArrayList<Media> itemsInStore = new ArrayList<Media>();

	// Add Media
	public void addMedia(Media media) {
		if (itemsInStore.size() < MAX_NUMBERS_IN_STORE) {
			itemsInStore.add(media);
			System.out.println("The media has been added.");
			return;
		} else {
			System.out.println("The store is almost full.");
		}
	}
		
	// Remove Media
	public void removeMedia (Media media) {
		if (itemsInStore.contains(media)) {
			itemsInStore.remove(media);
			System.out.println("The media has been removed.");
		} else {
			System.out.println("The media is not in the store.");
		}
	}
}
