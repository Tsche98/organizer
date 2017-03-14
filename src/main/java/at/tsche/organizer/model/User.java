package at.tsche.organizer.model;

import lombok.Data;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "users")
@Data
public class User extends AbstractPersistable<Long> {

    private String firstname;
    private String lastname;
    private LocalDate birthday;

    private String username;
    private String email;
    private String password;

    @OneToMany
    private List<Tasklist> tasklists;

}