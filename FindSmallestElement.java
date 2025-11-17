public class FindSmallestElement {
    public static void main(String[] args) {
        int[] arr = {12, 5, 9, 20, 3};
        int smallest = arr[0];

        for (int n : arr) {
            if (n < smallest)
                smallest = n;
        }

        System.out.println("Smallest = " + smallest);
    }
}
