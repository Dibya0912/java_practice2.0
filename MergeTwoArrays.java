public class MergeTwoArrays {
    public static void main(String[] args) {
        int[] a = {1, 3, 5};
        int[] b = {2, 4, 6};
        int[] c = new int[a.length + b.length];

        int index = 0;

        for (int n : a) c[index++] = n;
        for (int n : b) c[index++] = n;

        for (int n : c)
            System.out.print(n + " ");
    }
}
