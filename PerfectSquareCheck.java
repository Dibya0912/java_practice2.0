public class PerfectSquareCheck {
    public static void main(String[] args) {
        int n = 49;
        int root = (int) Math.sqrt(n);

        if (root * root == n)
            System.out.println(n + " is a Perfect Square");
        else
            System.out.println(n + " is NOT a Perfect Square");
    }
}
