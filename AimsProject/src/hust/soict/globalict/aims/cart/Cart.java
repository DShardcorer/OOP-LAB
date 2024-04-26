package hust.soict.globalict.aims.cart;

import java.util.ArrayList;
import java.util.List;

import hust.soict.globalict.aims.media.Media;

public class Cart {
	public static final int MAX_NUMBER_ORDERED = 20;
	private List<Media> itemsOrdered = new ArrayList<Media>();
	
	
	// Getter and setter
	public List<Media> getItemsOrdered() {
		return itemsOrdered;
	}
	public void addMedia(Media media) {
		itemsOrdered.add(media);
	}
	
	public void removeMedia(Media media) {
		int found = 0;
		for(int i = 0; i< itemsOrdered.size();i++) {
			if(itemsOrdered.get(i) == media) {
				itemsOrdered.remove(i);
				found = 1;
			}
		}
		if(found == 0) {
			System.out.println("Item not found.");
		}
	}
	
	public float totalCost() {
		float sum = 0;
		for(int i = 0; i<itemsOrdered.size(); i++) {
			sum += itemsOrdered.get(i).getCost();
		}
		return sum;
	}
	public void output() {
		System.out.println("************CART************");
		System.out.println("Ordered items:");
		for(int i =0; i< itemsOrdered.size(); i++) {
			System.out.println((i+1)+"." + itemsOrdered.get(i).toString());
		}
		System.out.println("Total cost:" + totalCost() +"$");
		System.out.println("****************************");
	}
	public void searchById(int id) {
		int found = 0;
		for(int i =0; i< itemsOrdered.size(); i++) {
			if(itemsOrdered.get(i).getId() == id) {
				System.out.println(itemsOrdered.get(i).toString());
				found = 1;
				break;
			}
		}
		if(found == 0) {
			System.out.println("Item not found.");
		}
	}
	public void searchByTitle(String title) {
		int found = 0;
		for(int i =0; i< itemsOrdered.size(); i++) {
			if(itemsOrdered.get(i).getTitle().equalsIgnoreCase(title)) {
				System.out.println(itemsOrdered.get(i).toString());
				found = 1;
				break;
			}
		}
		if(found == 0) {
			System.out.println("Item not found.");
		}
	}
}

