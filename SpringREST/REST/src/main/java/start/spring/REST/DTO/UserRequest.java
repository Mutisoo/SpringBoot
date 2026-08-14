package start.spring.REST.DTO;

// Maps the user input or json input to java object here to enforce abstraction
public record UserRequest(String username,String email,Integer age)
{
    
}
