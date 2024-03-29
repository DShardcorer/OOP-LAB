package Aims;

public class Aims {
    public static void main(String[] args) {
        // Create a Cart object
        Cart anOrder = new Cart();

        // Create DigitalVideoDisc objects
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Inception", "Sci-Fi", "Christopher Nolan", 148, 24.99f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Forrest Gump", "Drama", "Robert Zemeckis", 142, 14.99f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("The Shawshank Redemption", "Drama", "Frank Darabont", 142, 9.99f);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("The Dark Knight", "Action", "Christopher Nolan", 152, 19.99f);

        // Add DVDs to the cart
        anOrder.addDigitalVideoDisc(dvd1);
        anOrder.addDigitalVideoDisc(dvd2);
        anOrder.addDigitalVideoDisc(dvd3);
        anOrder.addDigitalVideoDisc(dvd4);
        anOrder.addDigitalVideoDisc(dvd5);
        anOrder.removeDigitalVideoDisc(dvd5);   

        // Calculate total cost and display
        float totalCost = anOrder.totalCost();
        System.out.println("Total cost of the items in the cart: $" + totalCost);
    }
}
