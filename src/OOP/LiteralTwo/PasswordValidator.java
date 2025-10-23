package OOP.LiteralTwo;

import java.util.ArrayList;
import java.util.List;

public class PasswordValidator   {

    private final List<ValidationRule>  rules ;


    public PasswordValidator(List<ValidationRule> rules) {
        this.rules = rules;
    }

    public boolean validate ( String password ) {
        for ( ValidationRule rule : rules ) {
            if ( !rule.isValid(password)) {
                return false;
            }
    }

        return true  ;



    }

    public static  class Builder  {
        private  final List<ValidationRule> rules = new ArrayList<>() ;

        public Builder withMinLength ( int length )  {
            rules.add(new MinLengthRule(length));
            return this ;
        }
         public Builder withUppercase () {
            rules.add(new UppercaseRule());
            return  this ;

         }
         public Builder withLowercase () {
            rules.add(new LowercaseRule());
            return this;
         }
        public Builder withNumber() {
            rules.add(new NumberRule());
            return this;
        }
        public Builder withUnderscore() {
            rules.add(new UnderscoreRule());
            return this;
        }
        public PasswordValidator build() {
            return new PasswordValidator(rules);
        }


    }






}