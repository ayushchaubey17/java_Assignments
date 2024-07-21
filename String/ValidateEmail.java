public class ValidateEmail {

    public static void main(String[] args) {
        String email = "ayushchaubey@gmail.com";
        boolean isValid = isValidEmail(email);
        System.out.println("Is \"" + email + "\" a valid email address? " + isValid);
    }

    public static boolean isValidEmail(String email) {
        if (email == null || email.isEmpty()) {
            return false;
        }

        // Check for presence of '@'
        int atIndex = email.indexOf('@');
        if (atIndex == -1 || atIndex == 0 || atIndex == email.length() - 1) {
            return false;
        }


        String domain = email.substring(atIndex + 1);
        int dotIndex = domain.indexOf('.');
        if (dotIndex == -1 || dotIndex == 0 || dotIndex == domain.length() - 1) {
            return false;
        }

        return true;
    }
}
