package my.com.lingo.planner.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private boolean isCompleted;

    @ManyToOne
    @JoinColumn(name = "tast_set_id")
    private TaskSet taskSet;

    public void updateTaskSet(TaskSet taskSet) {
        this.taskSet = taskSet;
    }

    public void update(boolean isCompleted){
        this.isCompleted = isCompleted;
    }
}
