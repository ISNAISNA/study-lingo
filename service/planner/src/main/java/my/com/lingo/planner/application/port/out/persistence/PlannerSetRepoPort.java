package my.com.lingo.planner.application.port.out.persistence;

import my.com.lingo.planner.domain.PlannerSet;

public interface PlannerSetRepoPort {
    PlannerSet save(PlannerSet plannerSet);
    PlannerSet getPlannerSetById(long id);
    PlannerSet update(long id, PlannerSet plannerSet);
    PlannerSet deleteById(long id);
}
