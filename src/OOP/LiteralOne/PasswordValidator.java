package OOP.LiteralOne;

import java.util.Scanner;

public class PasswordValidator {

    /**
     * Xác thực mật khẩu bằng cách duyệt qua từng ký tự, không sử dụng Regex.
     *
     * @param password Chuỗi mật khẩu cần kiểm tra.
     * @return true nếu mật khẩu hợp lệ, false nếu không.
     */

     public boolean isValid ( String password) {
         if ( password == null ) {
             return false ;
         }
         if ( password.length() <=8) {
             return false;
         }

         // using contain() for checking symbol " _ "
         if(!password.contains("_")){
             return false;
         }
         boolean hasUppercase = false ;
         boolean hasLowercase = false ;
         boolean hasDigit = false  ;

         for ( char c : password.toCharArray()) {
             if (Character.isUpperCase(c)) {
                 hasUppercase = true ;
             }

             else if ( Character.isLowerCase(c)){
                 hasLowercase = true;
             }
             else if ( Character.isDigit(c)){
                 hasDigit = true;
             }
             if ( hasUppercase && hasLowercase && hasDigit ) {
                 break;
             }



         }

         return hasUppercase && hasLowercase && hasDigit ;

     }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        PasswordValidator validator = new PasswordValidator();
        System.out.printf("gggggggg");
        String userIput = scanner.nextLine();
        boolean isValid  = validator.isValid(userIput) ;

        if(isValid) {
            System.out.println("=== true ");

        }
        else {
            System.out.println("flase ");
        }

        scanner.close();

    }


}