package hust.soict.globalict.test.screen.customer.store;

import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.screen.customer.controller.ViewStoreController;
import hust.soict.globalict.aims.store.Store;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TestViewStoreScreen extends Application{
	private static Store store;
	
	@Override
	public void start(Stage primaryStage) throws Exception{
		final String STORE_FXML_FILE_PATH = "/hust/soict/globalict/aims/screen/customer/view/Store.fxml";
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(STORE_FXML_FILE_PATH));
		ViewStoreController viewStoreController = new ViewStoreController(store);
		fxmlLoader.setController(viewStoreController);
		Parent root = fxmlLoader.load();
		
		primaryStage.setTitle("Store");
		primaryStage.setScene(new Scene(root));
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		store = new Store();
		
		DigitalVideoDisc disc1 = new DigitalVideoDisc(101, "The Matrix", "Science Fiction", 19.99f, "Lana Wachowski, Lilly Wachowski", 136);
		DigitalVideoDisc disc2 = new DigitalVideoDisc(102, "Inception", "Action", 14.99f, "Christopher Nolan", 148);
		DigitalVideoDisc disc3 = new DigitalVideoDisc(103, "The Godfather", "Crime", 9.99f, "Francis Ford Coppola", 175);
		DigitalVideoDisc disc4 = new DigitalVideoDisc(104, "Pulp Fiction", "Drama", 12.49f, "Quentin Tarantino", 154);
		DigitalVideoDisc disc5 = new DigitalVideoDisc(105, "The Shawshank Redemption", "Drama", 11.99f, "Frank Darabont", 142);
		store.addMedia(disc1);
		store.addMedia(disc2);
		store.addMedia(disc3);
		store.addMedia(disc4);
		store.addMedia(disc5);
		launch(args);
	}

}
