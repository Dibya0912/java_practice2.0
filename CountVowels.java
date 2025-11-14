public class CountVowels {
    public static void main(String[] args) {
        String s = "Hello World";
        int count = 0;

        for(char ch : s.toLowerCase().toCharArray()) {
            if("aeiou".indexOf(ch) != -1)
                count++;
        }

        System.out.println("Vowels: " + count);
    }
}
