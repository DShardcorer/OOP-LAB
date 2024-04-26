package hust.soict.globalict.test.cart;

import hust.soict.globalict.aims.cart.*;
import hust.soict.globalict.aims.media.*;

public class CartTest {
	 public static void main(String[] args) {
	        // Create a Cart object
	        Cart anOrder = new Cart();

	        // Create DigitalVideoDisc objects

	        anOrder.output();
	        
	        anOrder.searchByTitle("the lion king");
	        anOrder.searchById(4);
	 }
}
