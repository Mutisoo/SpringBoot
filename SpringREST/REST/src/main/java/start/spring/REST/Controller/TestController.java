package start.spring.REST.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;

import start.spring.REST.DTO.UserResponse;
import start.spring.REST.DTO.UserRequest;
import start.spring.REST.Service.UserDetailService;

@RestController
@RequiredArgsConstructor
public class TestController {
    // Constructor Injection Done here.
    private final UserDetailService userService;

    @PostMapping("api/v1/userData")
    // ResponseEntity returns a json http object while @requestBody converts incoming json to java objects
    public ResponseEntity<UserResponse> userData(@RequestBody UserRequest request){
        // Define a vaiable of type DTO whose value is the response of userservice whose arguement is request
        UserResponse resp = userService.userDetailService(request);
        return ResponseEntity
        .status(HttpStatus.OK)
        .body(resp);
    }
}
