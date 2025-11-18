public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {3, 8, 1, 5, 9};
        int start = 0, end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        for (int n : arr)
            System.out.print(n + " ");
    }
}
