package Week0.Day2;

import java.util.*;

public class problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int original = n;
        int reverse = 0;
        while (n != 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n /= 10;
        }
        if (original == reverse) {
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is non palindrome.");
        }
        System.out.println("Reverse of the number is: " + reverse);
        sc.close();
    }
}
