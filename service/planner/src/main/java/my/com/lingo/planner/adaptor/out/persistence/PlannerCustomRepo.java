package my.com.lingo.planner.adaptor.out.persistence;

import my.com.lingo.planner.domain.Planner;

import java.util.List;

public interface PlannerCustomRepo {
    List<Planner> findPlannerListByPlannerSetId(long id);
}
