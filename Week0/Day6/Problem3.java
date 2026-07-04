package Week0.Day6;

import java.util.Scanner;

public class Problem3 {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Problem3 p = new Problem3();
        int r = p.random(1, 100);
        System.out.println("I've picked a number between 1 and 100. Guess what it is!");

        p.gussNo(r);
    }
    public void gussNo(int r) {
        int n; 
        do {
            System.out.print("Enter your guess: ");
            n = sc.nextInt();
            check(n, r);
        } while (n != r);

        sc.close(); 
    }

    public int random(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    public void check(int n, int r) {
        if (n == r) {
            System.out.println("You get the right answer!");
        } else if (n > r) {
            System.out.println("Too high");
        } else {
            System.out.println("Too Low");
        }
    }
}
