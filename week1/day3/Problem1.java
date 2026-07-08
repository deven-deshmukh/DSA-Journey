package week1.day3;
import java.util.*;
public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sixe of array:");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("\n enter "+n+" number of elements:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        boolean[] v = new boolean[a.length];
        for (int i = 0; i < a.length; i++) {
            int count = 1;
            {
                if (!v[i]) {
                    for (int j = i + 1; j < a.length; j++) {
                        if (a[i] == a[j]) {
                            count++;
                            v[j] = true;
                        }
                    }
                    System.out.println("count of " + a[i] + " is :" + count);
                }
            }
        }
        sc.close();
   }
}
