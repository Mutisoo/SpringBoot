package start.spring.JPA.Service;

import main.java.start.spring.JPA.Repository.UserRepository;
import start.spring.JPA.Models.User;
import start.spring.JPA.DTO.UserResponse;

@Service
@Data
public class UserService {
    public final UserRepository userRepo;
    public UserResponse createUser(UserCreate userObj)
    {
        User user=new User();

        user.setUsername(userObj.username());
        user.setFname(userObj.fname());
        user.setSname(userObj.sname());
        user.setEmail(userObj.email());
        user.setPassword(userObj.password());

        User example = user.getUsername(userObj);

        String  customMessage="Welcome "+example+". You're part of the family now.Karibu";
        String uname=userObj.username();
        return new UserResponse(uname,customMessage);
    }
}
