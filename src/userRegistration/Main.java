package userRegistration;

public class Main {
    public static void main(String[] args){
        UserRepo userRepository = new UserRepo();
        userRepository.addUser();
        userRepository.addUser();
        userRepository.addUser();

//        userRepository.getUser("deep@mail.com");
        userRepository.getAllUsers();

    }
}
