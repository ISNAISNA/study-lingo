package my.com.lingo.planner.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;

import java.sql.Time;

@Entity
@NoArgsConstructor
public class TaskSet {
    @Id
    public long id;

    public String category;

    private Time totalTime;
}
