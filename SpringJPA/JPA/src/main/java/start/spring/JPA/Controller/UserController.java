package start.spring.JPA.Controller;

import main.java.start.spring.JPA.Service.UserService;
import start.spring.JPA.Service;
import start.spring.JPA.DTO.UserResponse;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("api/v1/createUser")
    // public ResposeEntity<UserResponse> userCreation(@RequestBody UserCreate create){
    //     if (create==null){
    // The loop wont return a vlue because the userResp obj is empty./cleared.
    //     }
    //     else{
    //         UserResponse userResp = userService.createUser(create);
    //     }
    //     return ResponseEntity
    //             .status(HttpStatus.OK)
    //             .body(userResp);
    // }
    public ResponseEntity<UserResponse> createNewUser(@RequestBody UserCreate create) {
        UserResponse userResp = userService.createUser(create);
        
        return ResponseEntity
                .status(HttpStatus.CREATED) 
                .body(userResp);
    }
    
}
