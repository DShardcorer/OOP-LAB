package hust.soict.globalict.lab01.JavaBasics;

import javax.swing.JOptionPane;
public class linearsolve226 {
    public static double linear1solver(double a, double b)
    //ax + b = 0
    {
        return -b/a;
    }
    public static double[] linear2solver(double a1, double b1, double c1, double a2, double b2, double c2)
    //a1x + b1y = c1
    //a2x + b2y = c2
    {
        double D = a1*b2 - a2*b1;
        double Dx = c1*b2 - c2*b1;
        double Dy = a1*c2 - a2*c1;
        double[] result = new double[2];
        result[0] = Dx/D;
        result[1] = Dy/D;
        return result;
    }
    public static double seconddegree1solver(double a, double b, double c)
    //ax^2 + bx + c = 0
    {
        double delta = b*b - 4*a*c;
        if (delta < 0) {
            return -1;
        }
        else if (delta == 0) {
            return -b/(2*a);
        }
        else {
            return (-b + Math.sqrt(delta))/(2*a);
        }
    }

    public static void main(String[] args) {
        //Choose what type of equation to solve
        JOptionPane.showMessageDialog(null, "Linear equation with 1 variable (1), Linear system with 2 variables (2), Second Degree equation with 1 variable(3)", "Choose", JOptionPane.INFORMATION_MESSAGE);
        String strType = JOptionPane.showInputDialog("Choose the according number: ");
        int type = Integer.parseInt(strType);
        if (type == 1) {
            String strA = JOptionPane.showInputDialog("Input a in ax + b = 0: ");
            String strB = JOptionPane.showInputDialog("Input b: ");
            double a = Double.parseDouble(strA);
            double b = Double.parseDouble(strB);
            JOptionPane.showMessageDialog(null, "The solution is: " + linear1solver(a, b), "Result", JOptionPane.INFORMATION_MESSAGE);
        }else if (type == 2) {
            String strA1 = JOptionPane.showInputDialog("Input a1 in a1x + b1y = c1, a2x + b2y = c2: ");
            String strB1 = JOptionPane.showInputDialog("Input b1: ");
            String strC1 = JOptionPane.showInputDialog("Input c1: ");
            String strA2 = JOptionPane.showInputDialog("Input a2: ");
            String strB2 = JOptionPane.showInputDialog("Input b2: ");
            String strC2 = JOptionPane.showInputDialog("Input c2: ");
            double a1 = Double.parseDouble(strA1);
            double b1 = Double.parseDouble(strB1);
            double c1 = Double.parseDouble(strC1);
            double a2 = Double.parseDouble(strA2);
            double b2 = Double.parseDouble(strB2);
            double c2 = Double.parseDouble(strC2);
            double result[] = linear2solver(a1, b1, c1, a2, b2, c2);

            JOptionPane.showMessageDialog(null, "The solution is: x = " + result[0] + "/n y = " + result[1], "Result", JOptionPane.INFORMATION_MESSAGE);
        }else if (type == 3) {
            String strA = JOptionPane.showInputDialog("Input a in ax2+ bx + c = 0: ");
            String strB = JOptionPane.showInputDialog("Input b: ");
            String strC = JOptionPane.showInputDialog("Input c: ");
            double a = Double.parseDouble(strA);
            double b = Double.parseDouble(strB);
            double c = Double.parseDouble(strC);
            double result = seconddegree1solver(a, b, c);
            if (result == -1) {
                JOptionPane.showMessageDialog(null, "The equation has no solution", "Result", JOptionPane.INFORMATION_MESSAGE);
            }else {
                JOptionPane.showMessageDialog(null, "The solution is: " + result, "Result", JOptionPane.INFORMATION_MESSAGE);
            }
    }
}
}
