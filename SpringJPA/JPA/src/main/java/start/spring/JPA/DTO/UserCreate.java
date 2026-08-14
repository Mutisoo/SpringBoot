package start.spring.JPA.DTO;

public record UserCreate
(
    String username,
    String fname,
    String sname,
    String email,
    String password
) {}
