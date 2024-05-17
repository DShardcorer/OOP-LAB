package other;

import java.awt.*;  // Importing AWT components
import java.awt.event.ActionEvent;  // Importing event handling classes
import java.awt.event.ActionListener;  // Importing ActionListener

// Class that creates a basic AWT GUI counter with a button
public class AWTCounter extends Frame implements ActionListener {
    // Components for the GUI
    private Label lblCount;  // A label to display text
    private TextField tfCount;  // A text field to display the counter value
    private Button btnCount;  // A button to increment the counter
    private int count = 0;  // Counter's value, initialized to 0
    
    // Constructor to setup the GUI components and event handling
    public AWTCounter() {
        setLayout(new FlowLayout());  // Setting a simple flow layout
        
        lblCount = new Label("Counter");  // Creating a label
        add(lblCount);  // Adding the label to the Frame
        
        tfCount = new TextField("0", 10);  // Text field to display the counter, initialized to "0"
        tfCount.setEditable(false);  // Set to read-only (user cannot edit it manually)
        add(tfCount);  // Adding the text field to the Frame
        
        btnCount = new Button("Count");  // Creating a button with the label "Count"
        add(btnCount);  // Adding the button to the Frame
        
        // Registering this instance as the ActionEvent listener for the button
        btnCount.addActionListener(this);
        
        // Setting up the Frame's title, size, and making it visible
        setTitle("AWT Counter");
        setSize(250, 100);  // Setting width and height of the Frame
        setVisible(true);  // Making the Frame visible
    }
    
    // Main method to create an instance of the application
    public static void main(String[] args) {
        new AWTCounter();  // Creating an instance of the counter app
    }
    
    /** 
     * The ActionEvent handler - Called when the button is clicked. 
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        ++count;  // Incrementing the counter
        // Displaying the counter's value on the TextField
        tfCount.setText(Integer.toString(count));  // Converting the count to string
    }
}
