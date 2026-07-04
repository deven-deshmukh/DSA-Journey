package Week0.Day6;
import java.util.*;
public class Problem4 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any num:");
        int n = sc.nextInt();
        fibo(n);
        sc.close();
    }
    
    static int fibo(int n) {
        if (n < 1) {
            return n;
        }
        System.out.println("Fibonaci :" + n);
        return fibo(n-1) + fibo(n - 2);
    }
    
}