package at.tsche.organizer.persistence;

import at.tsche.organizer.model.Tasklist;
import at.tsche.organizer.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TasklistRepository extends CrudRepository<Tasklist, Long> {

    List<Tasklist> findByUser(User user);

}
