package Week0.Day2;

import java.util.*;

public class problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;
        while (i <= n) {
            sum = sum + i;
            i++;
        }
        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
        sc.close();
    }
}