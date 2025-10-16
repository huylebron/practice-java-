package OOP.LiteralTwo;

public class UppercaseRule implements  ValidationRule{




    @Override
    public boolean isValid(String password) {
         return password != null && password.matches(".*[A-z].*");

    }
}