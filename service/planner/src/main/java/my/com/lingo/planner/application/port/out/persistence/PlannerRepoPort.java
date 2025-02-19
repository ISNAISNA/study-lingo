package my.com.lingo.planner.application.port.out.persistence;

import my.com.lingo.planner.domain.Planner;

import java.util.List;

public interface PlannerRepoPort {
    Planner getPlannerById(long id);
    Planner save(long plannerSetId, Planner planner);
    Planner update(long id, Planner planner);
    Planner deleteById(long id);
    List<Planner> getPlannerByPlannerSetId(long plannerSetId);
}
