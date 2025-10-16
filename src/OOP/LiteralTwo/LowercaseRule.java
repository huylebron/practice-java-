package OOP.LiteralTwo;

public class LowercaseRule implements  ValidationRule{


    @Override
    public boolean isValid(String password) {
        return password != null && password.matches(".*[a-z].*");
    }
    }