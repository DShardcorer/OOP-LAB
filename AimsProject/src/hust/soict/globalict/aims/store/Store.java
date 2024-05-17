package hust.soict.globalict.aims.store;

import java.util.ArrayList;
import java.util.List;

import hust.soict.globalict.aims.media.*;


public class Store {
	public static int MAX_NUMBER_IN_STORE = 40;
	private List<Media> itemsInStore = new ArrayList<Media>();
	public Store() {
		super();
	}

	public Store(List<Media> itemsInStore) {
		super();
		this.itemsInStore = itemsInStore;
	}
	public List<Media> getItemsInStore() {
		return itemsInStore;
	}
	public void addMedia(Media media) {
		itemsInStore.add(media);
	}
	
	public void removeMedia(Media media) {
		int found = 0;
		for(int i = 0; i< itemsInStore.size();i++) {
			if(itemsInStore.get(i) == media) {
				itemsInStore.remove(i);
				found = 1;
			}
		}
		if(found == 0) {
			System.out.println("Item not found.");
		}
	}

}
