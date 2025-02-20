package my.com.lingo.planner.application.port.in;

import my.com.lingo.planner.adaptor.in.web.dto.task.*;

public interface TaskService {
    TaskModifyRes updateTask(long id, TaskModifyReq taskModifyReq);
    TaskDeleteRes deleteTask(long id);
    TaskRes getTask(long id);
    TaskListRes getTaskListByTaskSetId(long taskSetId);
    TaskCreateRes createTask(long setId, TaskCreateReq taskCreateReq);
}
