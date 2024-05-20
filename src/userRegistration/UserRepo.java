package userRegistration;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class UserRepo {
    private List<User> userList;

    UserRepo(){
        this.userList = new ArrayList<>();
    }

    private static  final UserValidator validateUser = new UserValidator();
    private static final Scanner sc = new Scanner(System.in);




    void addUser(){
        String[] errorMessage = {"Follow this Format -- \n1. Can't Start with special character. \n2. Length can't be less than three. \n3. Can't be empty.", "Follow this Format -- \n1. Can't Start with special character or Capital letter. \n2. Can't be empty. \n3. Example: john24@mail.com", "Follow this Format -- \n1. Must contain atleast one capital letter, number and special character. \n2. Can't be empty. \n3. Length must be greater than seven. \n3. Example: JohnDoe$98", "Can't be empty"};

        String[] userFieldArr = {"Name", "Email", "Password", "Address"};

        System.out.println("****Hello User****");
        String userName = null;
        String userMail = null;
        String userPassword= null;
        String userAddress = null;

        boolean isMailAlreadyExists = false;

        for (int i = 0; i< userFieldArr.length; i++) {
            System.out.println("Please Enter your " + userFieldArr[i] + ":");
            String userInput = sc.nextLine();
            switch (userFieldArr[i]) {
                case "Name" -> {
                    userName = userInput;
                }
                case "Email" -> {
                    userMail = userInput;
                }
                case "Password" -> {
                    userPassword = userInput;
                }
                case "Address"->{
                    userAddress= userInput;
                }
            }
            while(!validateUser.userValidation(userFieldArr[i], userInput)){
                System.out.println(errorMessage[i]);
                System.out.println("Please Enter a valid " + userFieldArr[i] + " :");
                userInput = sc.nextLine();
            }

        }
        for(User user: userList){
            if(Objects.equals(user.getEmail(), userMail)){
                isMailAlreadyExists = true;
                System.out.println("This " + userMail + " id already exists.");
                break;
            }
        }
        if(!isMailAlreadyExists){
            User user = new User(userName, userMail, userPassword, userAddress);
            this.userList.add(user);
            System.out.println("You are registered with us :)");
        }
    }
    void getUser(String email){

        boolean isUserFound = false;
        if(validateUser.userValidation("Email",email)){
            for (User user : userList) {
                if (Objects.equals(user.getEmail(), email)) {
                    isUserFound = true;
                    System.out.println("****User Details****");
                    System.out.println("Name: " + user.getName());
                    System.out.println("E-Mail: " + user.getEmail());
                    System.out.println("Password: " + user.getPassword());
                    System.out.println("Address: " + user.getAddress());
                }
            }
            if(!isUserFound){
                System.out.println("There is no user with the Email Id: "+ email);
            }
        }
        else{
            System.out.println("Please enter a valid E-Mail :(");
            System.out.println("Follow this Format -- \n1. Can't Start with special character or Capital letter. \n2. Can't be empty. \n3. Example: john24@mail.com");
        }

    }

    void getAllUsers(){
        if(this.userList.size() > 1){
            for(User user: this.userList){
                System.out.println("Name: " + user.getName() + "; E-Mail: " + user.getEmail() + "; Address: " + user.getAddress() + "; Password: " + user.getPassword());
                System.out.println("---------------------");
            }
        }
        else{
            System.out.println("No Registered User");
        }
    }
}
