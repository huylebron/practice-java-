package OOP.LiteralTwo;

public class Solution {
    public static void main(String[] args) {
        PasswordValidator validator  = new PasswordValidator.Builder()
                .withMinLength(8)
                .withUppercase()
                .withLowercase()
                .withNumber()
                .withUnderscore()
                .build();


        System.out.println("Validation 1 - 'Valid_Pass1': " + validator.validate("Valid_Pass1")); // true

    }


}