package Week0.Day7;

import java.util.*;
public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array :-");
        int size = sc.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter num at index" + i + " :");
            a[i] = sc.nextInt();
        }
        
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.println("EVEN "+a[i]+", at index"+i);
            } else {
                System.out.println("ODD "+a[i]+", at index"+i);
                
            }
        }
    }
}
