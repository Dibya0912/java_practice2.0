public class RemoveVowels {
    public static void main(String[] args) {
        String s = "Programming is awesome";
        String result = "";

        for (char c : s.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) == -1)
                result += c;
        }

        System.out.println(result);
    }
}
