import java.util.Scanner;

public class FactorialUsingRecursion {
    static long factorial(int n) {
        if (n == 0)
            return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number from 0 to 20: ");
        if (!sc.hasNextInt()) {
            System.out.println("Please enter a whole number.");
        } else {
            int n = sc.nextInt();
            if (n < 0 || n > 20) {
                System.out.println("Please enter a number from 0 to 20.");
            } else {
                System.out.println("Factorial of " + n + " is: " + factorial(n));
            }
        }
        sc.close();
    }
}
