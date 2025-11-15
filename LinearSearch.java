public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3, 8, 2, 10, 6};
        int key = 10;
        boolean found = false;

        for(int num : arr) {
            if(num == key) {
                found = true;
                break;
            }
        }

        if(found)
            System.out.println(key + " found in array");
        else
            System.out.println(key + " not found");
    }
}
