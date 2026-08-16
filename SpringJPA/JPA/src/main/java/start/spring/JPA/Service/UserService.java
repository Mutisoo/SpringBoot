package start.spring.JPA.Service;

import main.java.start.spring.JPA.Repository.UserRepository;
import start.spring.JPA.Models.User;
import start.spring.JPA.DTO.UserResponse;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepo;

    public UserResponse createUser(UserCreate userObj)
    {
        User user=new User();

        user.setUsername(userObj.username());
        user.setFname(userObj.fname());
        user.setSname(userObj.sname());
        user.setEmail(userObj.email());
        user.setPassword(userObj.password());

        userRepo.save(user);
        String uname=user.getUsername();
        String  customMessage="Welcome "+example+". You're part of the family now.Karibu";
        
        return new UserResponse(uname,customMessage);
    }
}
