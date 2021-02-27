import javax.swing.*;
import javax.swing.JOptionPane;
public class Solve {
    public static void LinearEquation() {
        String strNum1, strNum2;
        String strNotifi = "Your equation you have just entered is: ";
        double result;
        double a, b;
        strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        a = Double.parseDouble(strNum1);

        strNotifi += a + "x + ";

        strNum2 = JOptionPane.showInputDialog(null, "Please input the second number: ", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
        b = Double.parseDouble(strNum2);
        strNotifi += b + " = 0";
        strNotifi += ". And the result is: ";
        
        String strResult;

        if (a == 0) {
            if (b == 0) {
                strResult = "Your equation has countless solutions! \n";
                strNotifi += strResult;
                JOptionPane.showMessageDialog(null, strNotifi, "The result", JOptionPane.INFORMATION_MESSAGE);
            } else {
                strResult = "Your equation has no solution! \n";
                strNotifi += strResult; 
                JOptionPane.showMessageDialog(null, strNotifi, "The result", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            result = (double) -b / a;
            strResult = "Your equation has 1 solution is x = " + result;
            strNotifi += strResult;
            JOptionPane.showMessageDialog(null, strNotifi, "The result", JOptionPane.INFORMATION_MESSAGE);
        }

        System.exit(0);

    }
    public static void LinearSystem() {
        String strNumA11, strNumA12, strNumB1, strNumA21, strNumA22, strNumB2;
        double a11, a12, b1, a21, a22, b2;
        double result1, result2;

        strNumA11 = JOptionPane.showInputDialog(null, "Please input a11: ", "Input the number", JOptionPane.INFORMATION_MESSAGE);
        a11 = Double.parseDouble(strNumA11);

        strNumA12 = JOptionPane.showInputDialog(null, "Please input a12: ", "Input the number", JOptionPane.INFORMATION_MESSAGE);
        a12 = Double.parseDouble(strNumA12);

        strNumB1 = JOptionPane.showInputDialog(null, "Please input b1: ", "Input the number", JOptionPane.INFORMATION_MESSAGE);
        b1 = Double.parseDouble(strNumB1);

        strNumA21 = JOptionPane.showInputDialog(null, "Please input a21: ", "Input the number", JOptionPane.INFORMATION_MESSAGE);
        a21 = Double.parseDouble(strNumA21);

        strNumA22 = JOptionPane.showInputDialog(null, "Please input a22: ", "Input the number", JOptionPane.INFORMATION_MESSAGE);
        a22 = Double.parseDouble(strNumA22);

        strNumB2 = JOptionPane.showInputDialog(null, "Please input b2: ", "Input the number", JOptionPane.INFORMATION_MESSAGE);
        b2 = Double.parseDouble(strNumB2);
        
        double d, d1, d2;
        d = a11 * a22 - a21 * a12;
        d1 = b1 * a22 - b2 * a12;
        d2 = a11 * b2 - a21 * b1;

        String strNotifi = "The result is: ";
        String strResult;
        if (d != 0) {
            result1 = (double) d1 / d;
            result2 = (double) d2 / d;
            strResult = "Your system equation has a unique solution (x1,x2) = " + "(" + result1 + ", " + result2 + ").";
            strNotifi += strResult;
            JOptionPane.showMessageDialog(null, strNotifi, "The result", JOptionPane.INFORMATION_MESSAGE);
        } else {
            if (d1 == 0) {
                strResult = "Your system equation has infinitely many solutions";
                strNotifi += strResult;
                JOptionPane.showMessageDialog(null, strNotifi, "The result", JOptionPane.INFORMATION_MESSAGE);
            } else {
                strResult = "Your system equation has no solution";
                strNotifi += strResult;
                JOptionPane.showMessageDialog(null, strNotifi, "The result", JOptionPane.INFORMATION_MESSAGE);
            }   
        }
        System.exit(0);
    }

    public static void SecondDegree() {
        String strNum1, strNum2, strNum3;
        double a, b, c;
        String strNotifi = "Your equation you have just entered is: ";
        double delta, x1, x2;

        strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        a = Double.parseDouble(strNum1);

        strNotifi += a + "x**2 + ";
        
        strNum2 = JOptionPane.showInputDialog(null, "Please input the second number: ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        b = Double.parseDouble(strNum2);

        strNotifi += b + "x + ";

        strNum3 = JOptionPane.showInputDialog(null, "Please input the third number: ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        c = Double.parseDouble(strNum3);

        strNotifi += c + " = 0";

        delta = b * b - 4 * a * c;
        String strResult;

        if (delta > 0) {
            x1 = (double) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (double) ((-b - Math.sqrt(delta)) / (2*a));
            
            strResult = ". And the solution is (x1, x2) = (" + x1 + ", " + x2 + ")";
            strNotifi += strResult;
            JOptionPane.showMessageDialog(null, strNotifi,"The result", JOptionPane.INFORMATION_MESSAGE);
        } else if (delta == 0) {
            x1 = (double) (-b / (2 * a));
            x2 = x1;

            strResult = ". And the solution is x1 = x2 = " + x1;
            strNotifi += strResult;
            JOptionPane.showMessageDialog(null, strNotifi,"The result", JOptionPane.INFORMATION_MESSAGE);
        } else {
            strResult = ". No solution!";
        }
        System.exit(0);

    }


    public static void main(String args[]) {
        String[] choices = {"Linear Equation", "Linear System", "Second-degree Equation with One Varible"};

        String choice = (String) JOptionPane.showInputDialog(null, "Solve", "The choice of life time", JOptionPane.QUESTION_MESSAGE, null, choices, choices[1]);

        switch (choice) {
            case "Linear Equation":
                // System.out.println(choice);
                LinearEquation();
                break;
            case "Linear System":
                // System.out.println(choice);
                LinearSystem();
                break;
            case "Second-degree Equation with One Varible":
                // System.out.println(choice);
                SecondDegree();
                break;
            default:
                break;
        }
    }
}