package Week0.Day6;

import java.util.*;

public class Problem2 {
    public int i = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any num:");
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println("Combination of " + n +"C"+r+ " :" + nCr(n,r));
        sc.close();
    }

    static int nCr(int n, int r) {
        if (r >= n || r <= 0 || n <= 0) {
            return 0;
        }
        int nf = f(n);
        int rf = f(r);
        int ans = (nf) / (rf * f(n - r));
        return ans;
    }

    static int f(int n) {
        if (n == 1 || n == 0) {
            return 1;

        } else {
            return n * f(n - 1);
        }
    }
}
