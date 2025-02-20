package my.com.lingo.planner.application.port.out.persistence;


import my.com.lingo.planner.domain.Task;

import java.util.List;

public interface TaskRepoPort {
    Task getTaskById(long id);
    Task save(long setId, Task taskReq);
    List<Task> getTaskByTaskSetId(long setId);
    Task deleteById(long id);
    Task update(long id, Task taskReq);
}
