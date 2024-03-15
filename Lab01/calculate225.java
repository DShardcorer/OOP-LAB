package Lab01;
//Write a program to calculate sum, difference, product, and quotient of 2 double numbers which
import javax.swing.JOptionPane;

public class calculate225 {
    public static void main(String[] args) {
        String strNum1, strNum2;
        String strResult = "";
        strNum1 = JOptionPane.showInputDialog("Input the first number: ");
        strNum2 = JOptionPane.showInputDialog("Input the second number: ");
        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);
        strResult += "Sum of " + strNum1 + " and " + strNum2 + " is " + (num1 + num2) + "\n";
        strResult += "Difference of " + strNum1 + " and " + strNum2 + " is " + Math.abs(num1 - num2) + "\n"
                + "Product of " + strNum1 + " and " + strNum2 + " is " + (num1 * num2) + "\n"
                + "Quotient of " + strNum1 + " and " + strNum2 + " is " + (num1 / num2);
        JOptionPane.showMessageDialog(null,strResult, "Result", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }
}
