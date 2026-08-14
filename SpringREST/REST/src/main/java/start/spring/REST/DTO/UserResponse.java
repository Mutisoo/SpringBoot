package start.spring.REST.DTO;


// Maps the response to this DTO for abstraction
public record UserResponse(
    String email,
    String message){}
