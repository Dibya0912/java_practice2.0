public class CountWords {
    public static void main(String[] args) {
        String s = "Java is fun to learn";
        int count = 1;

        for (char c : s.toCharArray()) {
            if (c == ' ')
                count++;
        }

        System.out.println("Total words: " + count);
    }
}
