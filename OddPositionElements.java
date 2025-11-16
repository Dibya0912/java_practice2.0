public class OddPositionElements {
    public static void main(String[] args) {
        int[] arr = {4, 9, 7, 3, 2, 8};

        for(int i = 0; i < arr.length; i += 2) {
            System.out.println("Index " + i + ": " + arr[i]);
        }
    }
}
