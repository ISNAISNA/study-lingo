package my.com.lingo.planner.adaptor.out.persistence.task;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import my.com.lingo.planner.domain.QTask;
import my.com.lingo.planner.domain.Task;

import java.util.List;

@RequiredArgsConstructor
public class TaskCustomRepoImpl implements TaskCustomRepo{
    private final JPAQueryFactory queryFactory;
    private final QTask task = QTask.task;

    @Override
    public List<Task> findTaskListByTaskSetId(long setId) {
        return queryFactory
                .selectFrom(task)
                .where(task.taskSet.id.eq(setId))
                .fetch();
    }
}
