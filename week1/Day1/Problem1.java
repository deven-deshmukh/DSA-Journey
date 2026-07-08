package week1.Day1;
import java.util.*;

public class Problem1 {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.printf("Enter %d number",n);
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();

        }
        
        System.out.println("Enter target:");
        int x = sc.nextInt();
        
        for (int i = 0; i < a.length; i++) {
            if (a[i] < x) {
                count++;
            }
        }
        System.out.println(count + " number are less than" + x);
        sc.close();
    }
}