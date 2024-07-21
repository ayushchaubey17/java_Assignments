public class CountVowel {

    public static void main(String[] args) {
        String input = "Hello java";
        int vowelCount = countVowels(input);
        System.out.println("Number of vowels in \"" + input + "\": " + vowelCount);
    }

    public static int countVowels(String str) {
        int count = 0;
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < str.length(); i++) {
            if (vowels.contains(String.valueOf(str.charAt(i)))) {
                count++;
            }
        }

        return count;
    }
}
