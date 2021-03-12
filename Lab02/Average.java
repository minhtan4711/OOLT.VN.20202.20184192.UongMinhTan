import java.util.Scanner;
import java.util.Arrays;
public class Average
{
    public static void main(String[] args) 
    {
        int n, sum = 0;
        float average;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        n = s.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n ; i++)
        {
            System.out.println("Enter element " + i);
            a[i] = s.nextInt();
            sum = sum + a[i];
        }
        Arrays.sort(a);
        System.out.println("Sorted array : " + Arrays.toString(a));
        System.out.println("Sum: " + sum);
        average = (float)sum / n;
        System.out.println("Average: " + average);
    }
}