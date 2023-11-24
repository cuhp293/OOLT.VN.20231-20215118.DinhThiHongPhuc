package hust.soict.hedspi.aims.cart;

import java.util.Scanner;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = 
            new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered <= MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added.");
        } else {
            System.out.println("The cart is almost full.");
        }  
    }

    // Add a DVD list 
    public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList) {
        for (int i = 0 ; i < dvdList.length ; i++){
            this.addDigitalVideoDisc(dvdList[i]);
        }
    }

    // Add 2 DVDs
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        this.addDigitalVideoDisc(dvd1);
        this.addDigitalVideoDisc(dvd2);
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].equals(disc)) {
                for (int j = i; j < qtyOrdered; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                i--;
                qtyOrdered--; // reduce the number of elements in the array
                System.out.println("The disc has been removed.");
            }
        }
    }

    public void displayCartItems() {
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.printf("%-3d %-20s %8f\n", i + 1, itemsOrdered[i].getTitle(), itemsOrdered[i].getCost());
        }
        System.out.println("Total Cost \t" + totalCost());
    }

    public float totalCost() {
        float total = 0;
        for (int i = 0; i < qtyOrdered; i++)
            total += itemsOrdered[i].getCost();
        return total;
    }

    // Print the list of ordered items of a cart
	public void printCart() {
		System.out.println("******************************CART******************************");
		System.out.println("Ordered Items:");

        for (int i = 0; i < qtyOrdered; i++)
            System.out.print((i+1) + ". " + itemsOrdered[i].toString());
        System.out.println("Total cost: " + totalCost());
        System.out.println("****************************************************************");
	}
	
	// Search for DVDs in the cart by ID and display the result
	public void searchByID() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter ID: ");
		int id = scanner.nextInt();
		for (int i = 0; i < qtyOrdered; i++) {
			if (itemsOrdered[i].getId() == id) {
				System.out.println("Search by id: " + id + ": " + itemsOrdered[i].toString());
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
		for (int i = 0; i < qtyOrdered; i++) {
			if (itemsOrdered[i].isMatch(title)) {
				System.out.println("Search by title: " + title + ": " + itemsOrdered[i].toString());
				return;
			}
		}
		System.out.println("No match is found!");
	}
}
