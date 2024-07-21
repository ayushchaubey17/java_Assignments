public class CapitalizeWords {

    public static void main(String[] args) {
        String input = "ayush kumar chaubey";
        String capitalized = capitalizeWords(input);
        System.out.println("Original: " + input);
        System.out.println("Capitalized: " + capitalized);
    }

    public static String capitalizeWords(String str) {
        StringBuilder capitalized = new StringBuilder();
        boolean capitalizeNext = true;

        for (char c : str.toCharArray()) {
            if (Character.isWhitespace(c)) {
                capitalizeNext = true;
                capitalized.append(' ');
            } else if (capitalizeNext) {
                capitalized.append(Character.toUpperCase(c));
                capitalizeNext = false;
            } else {
                capitalized.append(Character.toLowerCase(c));
            }
        }

        return capitalized.toString();
    }
}
