interface SecurityUtils {
    static boolean isStrongPassword(String password) {
        if (password.length() < 8) {
            return false;
        }

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isUpperCase(ch)) {
                hasUpper = true;
            } else if (Character.isLowerCase(ch)) {
                hasLower = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            }
        }

        return hasUpper && hasLower && hasDigit;
    }
}

public class PasswordValidator {
    public static void main(String[] args) {
        String password1 = "Nanak123";
        String password2 = "weak";

        System.out.println("Password: " + password1);
        if (SecurityUtils.isStrongPassword(password1)) {
            System.out.println("Strong Password");
        } else {
            System.out.println("Weak Password");
        }

        System.out.println();

        System.out.println("Password: " + password2);
        if (SecurityUtils.isStrongPassword(password2)) {
            System.out.println("Strong Password");
        } else {
            System.out.println("Weak Password");
        }
    }
}