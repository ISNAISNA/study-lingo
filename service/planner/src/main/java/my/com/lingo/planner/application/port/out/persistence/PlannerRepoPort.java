package my.com.lingo.planner.application.port.out.persistence;

import my.com.lingo.planner.domain.Planner;

import java.util.List;

public interface PlannerRepoPort {
    Planner getPlannerById(long id);
    Planner save(long setId, Planner plannerReq);
    Planner update(long id, Planner plannerReq);
    Planner deleteById(long id);
    List<Planner> getPlannerByPlannerSetId(long setId);
}
