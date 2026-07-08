package week1.day3;

import java.util.*;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sixe of array:");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("\n enter " + n + " number of elements:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        boolean[] v = new boolean[n];
        int count = 1;
        for (int i = 0; i < a.length; i++) {
            {
                if (!v[i]) {
                    for (int j = i + 1; j < a.length; j++) {
                        if (a[i] == a[j]) {
                            count++;
                            v[j] = true;
                        }
                    }
                }
            }
        }
        if (n/2 <= count) {
            System.out.println("n/2 of  is "+count);
        }
        sc.close();
    }
}
