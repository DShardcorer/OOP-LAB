package Lab01;

import javax.swing.JOptionPane;

public class ShowTwoNumbers {
    public static void main(String[] args) {
        String strNum1, strNum2;
        String strNotification = "You've just entered:";
        
        strNum1 = JOptionPane.showInputDialog("Input the first number: ");    
        strNotification += strNum1 + " and ";
        strNum2 = JOptionPane.showInputDialog("Input the second number: ");
        strNotification += strNum2;
        JOptionPane.showMessageDialog(null, strNotification, "Show two numbers", JOptionPane.INFORMATION_MESSAGE);
}
}