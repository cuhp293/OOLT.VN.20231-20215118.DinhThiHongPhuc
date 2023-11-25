package hust.soict.hedspi.aims.cart;

import java.util.ArrayList;
import java.util.Scanner;

import hust.soict.hedspi.aims.media.Media;

public class Cart {
	
	public static final int MAX_NUMBERS_ORDERED = 20;
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	
	// Add Media
	public void addMedia(Media media) {
		if (itemsOrdered.size() < MAX_NUMBERS_ORDERED) {
			itemsOrdered.add(media);
			System.out.println("The media has been added.");
			return;
		} else {
			System.out.println("The cart is almost full.");
		}
	}
	
	// Remove Media
	public void removeMedia (Media media) {
		if (itemsOrdered.contains(media)) {
			itemsOrdered.remove(media);
			System.out.println("The media has been removed.");
		} else {
			System.out.println("The media is not in the cart.");
		}
	}

    public void displayCartItems() {
        for (Media media : itemsOrdered) {
        	int i = 1;
            System.out.printf("%-3d %-20s %8f\n", i, media.getTitle(), media.getCost());
            i++;
        }
        System.out.println("Total Cost \t" + totalCost());
    }

    public float totalCost() {
        float total = 0;
        for (Media media : itemsOrdered)
            total += media.getCost();
        return total;
    }

    // Print the list of ordered items of a cart
	public void printCart() {
		int i = 1;
		System.out.println("******************************CART******************************");
		System.out.println("Ordered Items:");

        for (Media media : itemsOrdered) {
            System.out.print(i + ". DVD - " + media.toString());
            i++;
        }
        System.out.println("Total cost: " + totalCost());
        System.out.println("****************************************************************");
	}
	
	// Search for DVDs in the cart by ID and display the result
	public void searchByID() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter ID: ");
		int id = scanner.nextInt();
		for (Media media : itemsOrdered) {
			if (media.getId() == (id-1)) {
				System.out.println("Search by id: " + id + ": \n" + media.toString());
				return;
			}
		}
		System.out.println("No match is found!");
	}

	// Search for DVDs in the cart by title and display the result
	public void searchByTitle() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter title: ");
		String title = scanner.nextLine();
		for (Media media : itemsOrdered) {
			if (media.isMatch(title)) {
				System.out.println("Search by title: " + title + ": \n" + media.toString());
				return;
			}
		}
		System.out.println("No match is found!");
	}
}
