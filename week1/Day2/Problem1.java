package week1.Day2;

import java.util.*;

public class Problem1 {

    // Your subset logic function
    public static boolean isSubset(int a[], int b[]) {
        // Your code here

        Arrays.sort(a);
        Arrays.sort(b);
        for (int i = 0; i < b.length; i++) {
            boolean flag = false;
            for (int j = i; j < a.length; j++) {
                if (b[i] == a[j]) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                return false;
            }
        }
        return true;
    }

    }

    public static void main(String[] args) {
        // Test Case 1
        int[] a1 = { 11, 7, 1, 13, 21, 3, 7, 3 };
        int[] b1 = { 11, 3, 7, 1, 7 };

        System.out.println("Test Case 1 Result: " + isSubset(a1, b1)); // Expected: true

        // Test Case 2
        int[] a2 = { 10, 5, 2, 23, 19 };
        int[] b2 = { 19, 5, 3 };

        System.out.println("Test Case 2 Result: " + isSubset(a2, b2)); // Expected: false
    }
}