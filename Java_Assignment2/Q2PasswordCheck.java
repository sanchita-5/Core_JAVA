class PasswordValidator {
    int CheckPassword(char str[], int n) {
        if (n < 4 || Character.isDigit(str[0])) return 0;
        boolean digit = false, upper = false;

        for (char c : str) {
            if (Character.isDigit(c)) digit = true;
            if (Character.isUpperCase(c)) upper = true;
            if (c == ' ' || c == '/') return 0;
        }

        return (digit && upper) ? 1 : 0;
    }
}

public class Q2PasswordCheck {
    public static void main(String[] args) {
        PasswordValidator validator = new PasswordValidator();
        String password = "aA1_67";
        System.out.println("Valid Password: " + validator.CheckPassword(password.toCharArray(), password.length()));
    }
}

