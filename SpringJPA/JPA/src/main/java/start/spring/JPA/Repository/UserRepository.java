package start.spring.JPA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import start.spring.JPA.Models.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    // Fixed the spelling of JpaRepository
}