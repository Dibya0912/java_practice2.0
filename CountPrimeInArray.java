public class CountPrimeInArray {

    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= n / 2; i++)
            if (n % i == 0) return false;
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 7, 11, 15};
        int count = 0;

        for (int n : arr)
            if (isPrime(n)) count++;

        System.out.println("Prime count = " + count);
    }
}
