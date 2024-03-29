package Aims;

public class Cart {
	public static final int MAX_NUMBER_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
	private int qtyOrdered;
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered == 20) {
			System.out.println("Cart is full.");
		}else {
			qtyOrdered++;
			itemsOrdered[qtyOrdered - 1] = disc; 
		}
		
	}
	public void removeDigitalVideoDisc (DigitalVideoDisc disc) {
		if(qtyOrdered == 0) {
			System.out.println("No item left.");	
		}else {
			int found = 0;
			for(int i =0; i < qtyOrdered; i++) {
				if(itemsOrdered[i] == disc) {
					itemsOrdered[i]=null;
					found = 1;
					qtyOrdered --;
					break;
				}
			}
			if(found != 1) {
				System.out.println("Couldnt find item.");
			}
			
		}
		
	}
	public float totalCost() {
		float sum = 0;
		for(int i = 0; i<qtyOrdered; i++) {
			sum += itemsOrdered[i].getCost();
		}
		return sum;
	}
}

