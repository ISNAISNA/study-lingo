package my.com.lingo.planner.adaptor.out.persistence;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import my.com.lingo.planner.domain.Planner;
import my.com.lingo.planner.domain.QPlanner;

import java.util.List;

@RequiredArgsConstructor
public class PlannerCustomRepoImpl implements PlannerCustomRepo {
    private final JPAQueryFactory queryFactory;
    private final QPlanner planner = QPlanner.planner;

    @Override
    public List<Planner> findPlannerListByPlannerSetId(long id) {
        return queryFactory
                .selectFrom(planner)
                .where(planner.plannerSet.id.eq(id))
                .fetch();
    }
}
