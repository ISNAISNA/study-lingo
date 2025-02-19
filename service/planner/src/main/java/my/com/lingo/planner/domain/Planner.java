package my.com.lingo.planner.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Time;
import java.time.LocalDateTime;

@Entity
@Getter
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

    public void updatePlannerSet(PlannerSet plannerSet){
        this.plannerSet = plannerSet;
    }

    public void updateTotalTime(Time totalTime){
        this.totalTime = totalTime;
    }

    public void updateAchievementRate(float achievementRate){
        this.achievementRate = achievementRate;
    }

    public void update(String title, String memo){
        if(title != null) this.title = title;
        if(memo != null) this.memo = memo;
    }
}
