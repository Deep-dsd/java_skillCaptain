package userRegistration;

public class User {
    private String name;
    private String email;
    private String password;
    private String address;

    User(String name, String email, String password, String address){
        this.name  = name;
        this.email = email;
        this.password = password;
        this.address = address;
    }

    void setName(String name){
        this.name = name;
    }

    void setEmail(String email){this.email  = email;
    }
    void setPassword(String password){
        this.password  = password;
    }
    void setAddress(String address){
        this.address = address;
    }

    String getName(){
        return this.name;
    }

    String getEmail(){
        return this.email;
    }
    String getPassword(){
        return this.password;
    }
    String getAddress(){
        return this.address;
    }
}
