public class ReverseString {

    public static void main(String[] args) {
        String inputString = "Hello in World of java";
        String reversed = reverseString(inputString);
        System.out.println("Reversed: " + reversed);
    }

    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}
