import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Input the height of triangle: ");
        int height = keyboard.nextInt();

        for (int i = 1; i <= height; i++) {
            for (int j = i; j <= height; j++) {
                System.out.printf("   ");
            }
            for (int j = 1; j <= (2*i - 1); j++) {
                System.out.printf(" * ");
            }
            System.out.println("\n");
        }
    }
    
}