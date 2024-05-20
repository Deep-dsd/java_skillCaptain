package userRegistration;

import java.util.regex.Pattern;

public class UserValidator {
    private static boolean isValidEmail(String email){
        return Pattern.matches("^[a-z][a-zA-Z0-9_%+-]+@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}$", email);

    }
    private static boolean isValidPassword(String password){
        return Pattern.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$", password);
    }

    private static boolean isValidName(String name){
        return Pattern.matches("^[a-zA-Z ]{3,}$", name);
    }

    private static boolean isValidAddress(String address){
        return Pattern.matches("^.+$", address);
    }

    boolean userValidation(String userField, String userInput){
        boolean isValidated = false;
        switch (userField){
            case "Email"->
                isValidated = isValidEmail(userInput);
            case "Password"->
                isValidated = isValidPassword(userInput);
            case "Name"->
                isValidated = isValidName(userInput);
            case "Address"->
                isValidated = isValidAddress(userInput);
        }
        return isValidated;
    }
}
