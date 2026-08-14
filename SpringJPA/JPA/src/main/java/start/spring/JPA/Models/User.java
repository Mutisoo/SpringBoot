package start.spring.JPA.Models;

import org.jarkarta.*;
import org.lombok.*;

@Entity
@Table("user")
@Data
public class User {
    @Id
    @GeneratedValue()
    private String Id;
    @Column(name="username",nullable=false,unique=true)
    private String username;
    @Column(name="f_name",nullable=false)
    private String fname;
    @Column(name="s_name",nullable=false)
    private String sname;
    @Column(name="email",nullable=false,unique=true)
    private String email;
    @Column(name="email",nullable=false,unique=true)
    private String password;

}
