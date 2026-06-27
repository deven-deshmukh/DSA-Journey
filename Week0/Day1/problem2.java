package Week0.Day1;

/*write a program to implement a simple login system. 
The program should prompt the user to enter a username and password, 
and then check if the entered credentials match a predefined username and password. 
If the credentials are correct, the program should output "Login successful!", 
otherwise it should output "Invalid username or password." */
import java.util.*;

public class problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username: ");
        String username = sc.next();
        System.out.println("Enter password: ");
        String password = sc.next();
        if (username.equals("admin") && password.equals("password")) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid username or password.");
        }
        sc.close();
    }
}
