package hust.soict.globalict.aims.cart;

import java.util.ArrayList;
import java.util.List;
import hust.soict.globalict.aims.media.Media;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Cart {
    public static final int MAX_NUMBER_ORDERED = 20;
    private ObservableList<Media> itemsOrdered = FXCollections.observableArrayList();
    
    // Getter
    public ObservableList<Media> getItemsOrdered() {
        return itemsOrdered;
    }

    // Add media to the cart
    public void addMedia(Media media) {
        itemsOrdered.add(media);
    }
    
    // Remove media from the cart
    public void removeMedia(Media media) {
        boolean found = itemsOrdered.remove(media);
        if (!found) {
            System.out.println("Item not found.");
        }
    }
    
    // Calculate the total cost of items in the cart
    public float totalCost() {
        float sum = 0;
        for (Media media : itemsOrdered) {
            sum += media.getCost();
        }
        return sum;
    }

    // Output the cart contents
    public void output() {
        System.out.println("************CART************");
        System.out.println("Ordered items:");
        for (int i = 0; i < itemsOrdered.size(); i++) {
            System.out.println((i + 1) + "." + itemsOrdered.get(i).toString());
        }
        System.out.println("Total cost: " + totalCost() + "$");
        System.out.println("****************************");
    }

    // Search for media by ID
    public void searchById(int id) {
        boolean found = false;
        for (Media media : itemsOrdered) {
            if (media.getId() == id) {
                System.out.println(media.toString());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Item not found.");
        }
    }

    // Search for media by title
    public void searchByTitle(String title) {
        boolean found = false;
        for (Media media : itemsOrdered) {
            if (media.getTitle().equalsIgnoreCase(title)) {
                System.out.println(media.toString());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Item not found.");
        }
    }
}
