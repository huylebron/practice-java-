package OOP.LiteralTwo;

public class MinLengthRule implements ValidationRule {

    private final int minLength ;

    public MinLengthRule(int minLength) {
        this.minLength = minLength;
    }


    @Override
    public boolean isValid(String password) {

        return password != null && password.length() > minLength ;
    }
}