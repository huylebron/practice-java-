package OOP.LiteralTwo;

public class NumberRule implements  ValidationRule {


    @Override
    public boolean isValid(String password) {
        return password != null && password.matches(".*\\\\d.*");
    }
}