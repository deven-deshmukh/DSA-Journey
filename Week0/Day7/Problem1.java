package Week0.Day7;

import java.util.*;
public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter " + (i + 1) + " Number : ");
            arr[i] = sc.nextInt();
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Array at index " + i + " : " + arr[i]);
        }
        sc.close();
    }
    
}