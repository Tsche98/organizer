package at.tsche.organizer.model;

import lombok.Data;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "tasklists")
@Data
public class Tasklist extends AbstractPersistable<Long> {

    private String name;

    @ManyToOne
    private User user;
    @OneToMany
    private List<Task> tasks;

}
