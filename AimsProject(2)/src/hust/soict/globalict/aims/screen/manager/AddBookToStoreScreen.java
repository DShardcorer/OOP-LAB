package hust.soict.globalict.aims.screen.manager;

import javax.swing.*;
import java.awt.*;

public class AddBookToStoreScreen extends AddItemToStoreScreen {

    @Override
    JPanel createForm() {
        JPanel panel = new JPanel(new GridLayout(5, 2));

        panel.add(new JLabel("Title:"));
        panel.add(new JTextField());

        panel.add(new JLabel("Author:"));
        panel.add(new JTextField());

        panel.add(new JLabel("Category:"));
        panel.add(new JTextField());

        panel.add(new JLabel("Cost:"));
        panel.add(new JTextField());

        panel.add(new JButton("Add Book"));
        panel.add(new JButton("Cancel"));

        return panel;
    }

    public static void main(String[] args) {
        new AddBookToStoreScreen();
    }
}
