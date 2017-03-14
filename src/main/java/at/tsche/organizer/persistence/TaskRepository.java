package at.tsche.organizer.persistence;

import at.tsche.organizer.model.Task;
import at.tsche.organizer.model.Tasklist;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface TaskRepository extends CrudRepository<Task, Long> {

    List<Task> findByTasklist(Tasklist tasklist);

    @Query("select t from User u join u.tasklists tl join tl.tasks t " +
            "where u.id = :userid and t.title = :title")
    List<Task> findByTitleAndUser(@Param("title") String title, @Param("userid") Long userid);

    @Query("select t from User u join u.tasklists tl join tl.tasks t " +
            "where u.id = :userid and t.targetDate = :targetDate")
    List<Task> findByTargetDateAndUser(@Param("targetDate") LocalDate targetDate, @Param("userid") Long userid);

    @Query("select t from Tasklist tl join tl.tasks t " +
            "where tl.id = :tasklistid and t.targetDate = :targetDate")
    List<Task> findByTargetDateAndTasklist(@Param("targetDate") LocalDate targetDate, @Param("tasklistid") Long tasklistid);

}
