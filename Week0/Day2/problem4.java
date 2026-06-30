package Week0.Day2;

import java.util.*;

public class problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int i = n1;
        int count = 0;
        while (i <= n2) {
            if (i % 2 == 0) {
                count++;
                System.out.println(i);
            }
            i++;
        }
        System.out.println("Count of even numbers: " + count);
        sc.close();
    }
}
