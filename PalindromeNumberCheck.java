public class PalindromeNumberCheck {
    public static void main(String[] args) {
        int num = 1331;
        int temp = num, rev = 0;

        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }

        if (rev == num)
            System.out.println(num + " is Palindrome");
        else
            System.out.println(num + " is NOT Palindrome");
    }
}
