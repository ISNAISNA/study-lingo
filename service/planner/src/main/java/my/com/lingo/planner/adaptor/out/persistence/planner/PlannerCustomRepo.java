package my.com.lingo.planner.adaptor.out.persistence.planner;

import my.com.lingo.planner.domain.Planner;

import java.util.List;

public interface PlannerCustomRepo {
    List<Planner> findPlannerListByPlannerSetId(long id);
}
