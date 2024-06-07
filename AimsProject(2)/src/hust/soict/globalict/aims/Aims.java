package hust.soict.globalict.aims;

import hust.soict.globalict.aims.cart.Cart;
import hust.soict.globalict.aims.media.*;
import hust.soict.globalict.aims.store.Store;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aims {

    // Main menu to choose between viewing store, updating store, seeing the cart,
    // or exiting
    public static void showMenu() {
        System.out.println("AIMS:");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
    }

    // Store menu for interacting with store items
    public static void storeMenu() {
        System.out.println("Store Menu:");
        System.out.println("--------------------------------");
        System.out.println("1. See a media's details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");
    }

    // Media details menu for operations with individual media items
    public static void mediaDetailsMenu() {
        System.out.println("Media Details Menu:");
        System.out.println("--------------------------------");
        System.out.println("1. Add to cart");
        // Only available for CD and DVD types
        System.out.println("2. Play");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");
    }

    // Cart menu for interacting with the shopping cart
    public static void cartMenu() {
        System.out.println("Cart Menu:");
        System.out.println("--------------------------------");
        System.out.println("1. Filter media in cart");
        System.out.println("2. Sort media in cart");
        System.out.println("3. Remove media from cart");
        System.out.println("4. Play a media");
        System.out.println("5. Place order");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4-5");
    }

    public static void main(String[] args) {
        Store store = new Store(); // Initialize store
        Cart cart = new Cart(); // Initialize cart
        Scanner sc = new Scanner(System.in); // Scanner for user input

        boolean running = true; // Main loop flag

        while (running) {
            showMenu(); // Display the main menu
            int op = sc.nextInt();

            switch (op) {
                case 1: // View store
                    //Display all items in store
                    for(Media media : store.getItemsInStore()) {
                        media.toString();
                    }
                    storeMenu(); // Show store menu options
                    int storeOption = sc.nextInt();

                    switch (storeOption) {
                        case 1: // See a media's details
                            System.out.println("Enter media title:");
                            sc.nextLine(); // Clear newline
                            String mediaTitle = sc.nextLine();
                            for(Media media2 : store.getItemsInStore()) {
                                if(media2.getTitle().equalsIgnoreCase(mediaTitle)) {
                                    System.out.println(media2.toString());
                                    break;
                                }
                                mediaDetailsMenu(); // Show media details menu options
                                int mediaOption = sc.nextInt();

                                switch (mediaOption) {
                                    case 1: // Add to cart
                                        cart.addMedia(media2);
                                        System.out.println("Media added to cart.");
                                        break;

                                    case 2: // Play
                                    //if media is dvd or cd then play
                                        if(media2 instanceof CompactDisc) {
                                            ((CompactDisc) media2).play();
                                        } else if (media2 instanceof DigitalVideoDisc) {
                                            ((DigitalVideoDisc) media2).play();
                                        } else {
                                            System.out.println("This type of media cannot be played.");
                                        }
                                        break;

                                    case 0: // Back
                                        break;

                                    default:
                                        System.out.println("Invalid option.");
                                        break;
                                }
                            }
                            break;

                        case 2: // Add a media to cart
                            System.out.println("Enter media title to add to cart:");
                            sc.nextLine(); // Clear newline
                            String addTitle = sc.nextLine();
                            for(Media media2 : store.getItemsInStore()) {
                                if(media2.getTitle().equalsIgnoreCase(addTitle)) {
                                    cart.addMedia(media2);
                                    System.out.println("Media added to cart.");
                                    break;
                                }
                            }
                            break;

                        case 3: // Play a media
                            System.out.println("Enter media title to play:");
                            sc.nextLine(); // Clear newline
                            String playTitle = sc.nextLine();
                            for(Media media2 : store.getItemsInStore()) {
                                if(media2.getTitle().equalsIgnoreCase(playTitle)) {
                                    //if media is type dvd or cd then play
                                    if(media2 instanceof CompactDisc) {
                                        ((CompactDisc) media2).play();
                                    } else if (media2 instanceof DigitalVideoDisc) {
                                        ((DigitalVideoDisc) media2).play();
                                    } else {
                                        System.out.println("This type of media cannot be played.");
                                    }
                                    break;
                                }
                            }
                            break;
                    }
                    break;

                case 2: // Update store
                    updateStore(sc, store);
                    break;

                case 3: 
                    viewCart(sc, cart); 
                    break;

                case 0:
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        sc.close(); // Close the scanner at the end of the program
    }

    // Method to update the store
    private static void updateStore(Scanner sc, Store store) {
        System.out.println("Update Store:");
        System.out.println("1. Add media");
        System.out.println("2. Remove media");
        System.out.println("0. Back to main menu");

        int updateOption = sc.nextInt();

        switch (updateOption) {
            case 1: // Add media
                System.out.println("Enter media type (DVD, CD, Book):");
                sc.nextLine(); // Clear newline
                String mediaType = sc.nextLine();

                switch (mediaType) {
                    case "DVD":
                        System.out.println("Enter DVD details...");
                        //DigitalVideoDisc(int id, String title, String category, float cost, String director, int length)
                        sc.nextLine(); // Clear newline
                        System.out.println("Enter id:");
                        int dvdId = sc.nextInt();
                        System.out.println("Enter title:");
                        String dvdTitle = sc.nextLine();
                        System.out.println("Enter category:");
                        String dvdCategory = sc.nextLine();
                        System.out.println("Enter cost:");
                        float dvdCost = sc.nextFloat();
                        System.out.println("Enter director:");
                        sc.nextLine(); // Clear newline
                        String dvdDirector = sc.nextLine();
                        System.out.println("Enter length:");
                        int dvdLength = sc.nextInt();
                        store.addMedia(new DigitalVideoDisc(dvdId, dvdTitle, dvdCategory, dvdCost, dvdDirector, dvdLength));

                        System.out.println("DVD added to store.");

                        break;

                    case "CD":
                        //CompactDisc(int id, String title, String category, float cost, String director, int length,String artist, List<Track> tracks)
                        System.out.println("Enter CD details...");
                        sc.nextLine(); // Clear newline
                        System.out.println("Enter id:");
                        int cdId = sc.nextInt();
                        System.out.println("Enter title:");
                        String cdTitle = sc.nextLine();
                        System.out.println("Enter category:");
                        String cdCategory = sc.nextLine();
                        System.out.println("Enter cost:");
                        float cdCost = sc.nextFloat();
                        System.out.println("Enter director:");
                        sc.nextLine(); // Clear newline
                        String cdDirector = sc.nextLine();
                        System.out.println("Enter length:");
                        int cdLength = sc.nextInt();
                        System.out.println("Enter artist:");
                        sc.nextLine(); // Clear newline
                        String cdArtist = sc.nextLine();
                        System.out.println("Enter number of tracks:");
                        int numTracks = sc.nextInt();
                        List<Track> cdTracks = new ArrayList<Track>();
                        for (int i = 0; i < numTracks; i++) {
                            System.out.println("Enter track title:");
                            sc.nextLine(); // Clear newline
                            String trackTitle = sc.nextLine();
                            System.out.println("Enter track length:");
                            int trackLength = sc.nextInt();
                            cdTracks.add(new Track(trackTitle, trackLength));
                        }
                        store.addMedia(new CompactDisc(cdId, cdTitle, cdCategory, cdCost, cdDirector, cdLength, cdArtist, cdTracks));
                        break;

                    case "Book":
                        System.out.println("Enter Book details...");
                        // Add Book implementation
                        //Book(int id, String title, String category, float cost, List<String> authors)
                        sc.nextLine(); // Clear newline
                        System.out.println("Enter id:");
                        int bookId = sc.nextInt();
                        System.out.println("Enter title:");
                        String bookTitle = sc.nextLine();
                        System.out.println("Enter category:");
                        String bookCategory = sc.nextLine();
                        System.out.println("Enter cost:");
                        float bookCost = sc.nextFloat();
                        System.out.println("Enter number of authors:");
                        int numAuthors = sc.nextInt();
                        List<String> bookAuthors = new ArrayList<String>();
                        for (int i = 0; i < numAuthors; i++) {
                            System.out.println("Enter author name:");
                            sc.nextLine(); // Clear newline
                            String authorName = sc.nextLine();
                            bookAuthors.add(authorName);
                        }
                        store.addMedia(new Book(bookId, bookTitle, bookCategory, bookCost, bookAuthors));
                        System.out.println("Book added to store.");

                        break;

                    default:
                       System.out.println("Invalid media type.");
                        break;
                }
                break;

            case 2: // Remove media
                System.out.println("Enter media title to remove:");
                sc.nextLine(); // Clear newline
                String removeTitle = sc.nextLine();
                //Find media with corresponding title to remove
                for(Media media : store.getItemsInStore()) {
                    if(media.getTitle().equalsIgnoreCase(removeTitle)) {
                        store.removeMedia(media);
                        System.out.println("Media removed from store.");
                        break;
                    }
                }
                break;

            case 0: // Back to main menu
                break;

            default:
                System.out.println("Invalid option.");
                break;
        }
    }

    // Method to view and manage the cart
    private static void viewCart(Scanner sc, Cart cart) {
        System.out.println("Cart Items:");
        cart.getItemsOrdered().forEach(System.out::println); // Display all items in the cart

        cartMenu(); // Show cart menu options
        int cartOption = sc.nextInt();

        switch (cartOption) {
            case 1: // Filter media in cart
                System.out.println("Choose filter option:");
                System.out.println("1. By ID");
                System.out.println("2. By title");

                int filterOption = sc.nextInt();

                switch (filterOption) {
                    case 1:
                        System.out.println("Enter ID:");
                        int filterId = sc.nextInt();
                        cart.getItemsOrdered()
                                .stream()
                                .filter(media -> media.getId() == filterId)
                                .forEach(System.out::println);
                        break;

                    case 2:
                        System.out.println("Enter title:");
                        sc.nextLine(); // Clear newline
                        String filterTitle = sc.nextLine();
                        cart.getItemsOrdered()
                                .stream()
                                .filter(media -> media.getTitle().equalsIgnoreCase(filterTitle))
                                .forEach(System.out::println);
                        break;

                    default:
                        System.out.println("Invalid filter option.");
                        break;
                }
                break;

            case 2: // Sort media in cart
                System.out.println("Choose sort option:");
                System.out.println("1. By title");
                System.out.println("2. By cost");

                int sortOption = sc.nextInt();

                switch (sortOption) {
                    case 1:
                        cart.getItemsOrdered().sort((m1, m2) -> m1.getTitle().compareTo(m2.getTitle()));
                        System.out.println("Cart sorted by title.");
                        break;

                    case 2:
                        cart.getItemsOrdered().sort((m1, m2) -> Float.compare(m1.getCost(), m2.getCost()));
                        System.out.println("Cart sorted by cost.");
                        break;

                    default:
                        System.out.println("Invalid sort option.");
                        break;
                }
                break;

            case 3: // Remove media from cart
                System.out.println("Enter media title to remove:");
                sc.nextLine(); // Consume newline
                String removeTitle = sc.nextLine();
                for(Media media : cart.getItemsOrdered()) {
                    if(media.getTitle().equalsIgnoreCase(removeTitle)) {
                        cart.removeMedia(media);
                        System.out.println("Media removed from cart.");
                        break;
                    }
                }
                break;

            case 4: // Play a media from cart
                System.out.println("Enter media title to play:");
                sc.nextLine(); // Consume newline
                String playTitle = sc.nextLine();
                Media playMedia = cart.getItemsOrdered()
                        .stream()
                        .filter(media -> media.getTitle().equalsIgnoreCase(playTitle))
                        .findFirst()
                        .orElse(null);

                if (playMedia == null) {
                    System.out.println("Media not found.");
                } else if (playMedia instanceof Playable) {
                    ((Playable) playMedia).play(); // Play the media if it's playable
                } else {
                    System.out.println("This type of media cannot be played.");
                }
                break;

            case 5: // Place order and clear cart
                // Implement place order functionality

                break;

            case 0: // Back to main menu
                break;

            default:
                System.out.println("Invalid option.");
                break;
        }
    }
}