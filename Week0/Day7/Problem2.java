package Week0.Day7;

import java.util.*;
public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size :");
        int size = sc.nextInt();
    
        int[] a = new int[size];
        for (int i = 0; i < a.length; i++) {
            System.out.print("enter number in index " +i+" : ");
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the target :");
        int t = sc.nextInt();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == t) {
                System.out.println("Element found at index :-" + i);
                break;
            }    
        }
        
    }
    
}