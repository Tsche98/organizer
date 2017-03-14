package at.tsche.organizer.model;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "tasks")
public class Task extends AbstractPersistable<Long> {

    private String title;
    private String description;
    private LocalDate targetDate;
    private boolean done;

    @ManyToOne
    private Tasklist tasklist;

}