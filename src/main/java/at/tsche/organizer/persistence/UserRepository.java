package at.tsche.organizer.persistence;

import at.tsche.organizer.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername(String username);
    User findByEmail(String email);

}