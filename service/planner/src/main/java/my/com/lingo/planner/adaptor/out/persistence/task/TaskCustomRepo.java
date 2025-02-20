package my.com.lingo.planner.adaptor.out.persistence.task;


import my.com.lingo.planner.domain.Task;

import java.util.List;

public interface TaskCustomRepo {
    List<Task> findTaskListByTaskSetId(long setId);

}
