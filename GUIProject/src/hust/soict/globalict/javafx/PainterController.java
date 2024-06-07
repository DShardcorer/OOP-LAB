package hust.soict.globalict.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class PainterController {

    @FXML
    private Pane drawingAreaPane;
    @FXML
    private RadioButton eraserRadioButton;

    @FXML
    private RadioButton penRadioButton;
    @FXML
    void clearButtonPressed(ActionEvent event) {
    	drawingAreaPane.getChildren().clear();
    }

    @FXML
    void drawingAreaMouseDragged(MouseEvent event) {
    	Circle newCircle = new Circle(event.getX(), event.getY(), 4, Color.BLACK);
    	drawingAreaPane.getChildren().add(newCircle);
    }
    @FXML
    void drawingAreaMouseClicked(MouseEvent event) {
    	Circle newCircle = new Circle(event.getX(), event.getY(), 4, Color.BLACK);
    	drawingAreaPane.getChildren().add(newCircle);
    }
    @FXML
    void draw(MouseEvent event) {
    	if(penRadioButton.isSelected()) {
        	Circle newCircle = new Circle(event.getX(), event.getY(), 4, Color.BLACK);
        	drawingAreaPane.getChildren().add(newCircle);
    	}else if(eraserRadioButton.isSelected()) {
        	Circle newCircle = new Circle(event.getX(), event.getY(), 8, Color.WHITE);
        	drawingAreaPane.getChildren().add(newCircle);
    	}
    }
}

