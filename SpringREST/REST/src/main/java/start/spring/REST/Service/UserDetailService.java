package start.spring.REST.Service;

import org.springframework.stereotype.Service;
import start.spring.REST.DTO.UserResponse;
import start.spring.REST.DTO.UserRequest;

@Service
public class UserDetailService {

    public UserResponse userDetailService(UserRequest userRequest ){

        String userEmail=userRequest.email();
        String uname=userRequest.username();
        Integer userAge= userRequest.age();
        String message = "CC: " + userEmail + " ,\n" +
                 "Hello, " + uname + ". Welcome to CitCom, your confirmed age is " + userAge + ". Continue banking with us.";
        


        return new UserResponse(
            userEmail,message
        );
    }
}
