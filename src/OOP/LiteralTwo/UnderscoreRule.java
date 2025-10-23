package OOP.LiteralTwo;

public class UnderscoreRule implements ValidationRule{


    @Override
    public boolean isValid(String password) {
        return password != null && password.contains("_");
    }


}