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
    private final UserDetailService userService;
    @PostMapping("api/v1/userData")
    public ResponseEntity<UserResponse> userData(@RequestBody UserRequest request){
        UserResponse resp = userService.userDetailService(request);
        return ResponseEntity
        .status(HttpStatus.OK)
        .body(resp);
    }
}
