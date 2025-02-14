package my.com.lingo.planner.domain;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.sql.Time;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
public class Planner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Time totalTime;
    private String memo;

    @ManyToOne
    private PlannerSet plannerSet;

    private float achievementRate;
    private String title;
}
