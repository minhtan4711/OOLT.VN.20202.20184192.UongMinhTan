import javax.swing.JOptionPane;
public class Calculate2DoubleNumbers {
    public static double sum(double a, double b) {
        return a + b;
    }
    public static double difference(double a, double b) {
        return Math.abs(a - b);
    }
    public static double product(double a, double b) {
        return a * b;
    }
    public static double quotient(double a, double b) {
        return a / b;
    }

    public static void main(String args[]) {
        String strNum1, strNum2;
        String strNotifi = "The result is: ";

        String strChoice;
        int choice;
        double num1, num2, num3;

        strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        num1 = Double.parseDouble(strNum1);

        strNum2 = JOptionPane.showInputDialog(null, "Please input the second number: ", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
        num2 = Double.parseDouble(strNum2);

        strChoice = JOptionPane.showInputDialog(null, "Please input your choice: ", "Input yout choice", JOptionPane.INFORMATION_MESSAGE); 
        choice = Integer.parseInt(strChoice);

        switch (choice) {
            case 1:
                num3 = sum(num1, num2);
                strNotifi += num3;
                JOptionPane.showMessageDialog(null, strNotifi,"The result", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                num3 = difference(num1, num2);
                strNotifi += num3;
                JOptionPane.showMessageDialog(null, strNotifi,"The result", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 3:
                num3 = product(num1, num2);
                strNotifi += num3;
                JOptionPane.showMessageDialog(null, strNotifi,"The result", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 4:
                num3 = quotient(num1, num2);
                strNotifi += num3;
                JOptionPane.showMessageDialog(null, strNotifi,"The result", JOptionPane.INFORMATION_MESSAGE);
                break;
            default:
                strNotifi = "Your choice is not available!";
                JOptionPane.showMessageDialog(null, strNotifi,"The result", JOptionPane.INFORMATION_MESSAGE);
        }

        System.exit(0);

    }
}