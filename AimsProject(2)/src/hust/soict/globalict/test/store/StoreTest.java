package hust.soict.globalict.test.store;

import java.util.ArrayList;
import java.util.List;

import hust.soict.globalict.aims.media.Book;
import hust.soict.globalict.aims.media.CompactDisc;
import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.media.Media;

public class StoreTest {
	public static void main(String[] args) {
	// Create a Cart object
	List<Media> aStore = new ArrayList<Media>();

    // Create DigitalVideoDisc objects
    DigitalVideoDisc dvd1 = new DigitalVideoDisc(0, null, null, 0, null, 0);
    CompactDisc cd1 = new CompactDisc(0, null, null, 0, null, 0, null, null);
    Book bk1= new Book(1, null, null, 0, null);
    // Add DVDs to the cart
    aStore.add(dvd1);
    aStore.add(cd1);
    aStore.add(bk1);
    
    for(Media m: aStore) {
    	System.out.println(m.toString());
    }
	}    
}
