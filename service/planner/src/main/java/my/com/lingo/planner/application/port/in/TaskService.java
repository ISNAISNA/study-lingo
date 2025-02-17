package my.com.lingo.planner.application.port.in;

import my.com.lingo.planner.adaptor.in.web.dto.task.*;

public interface TaskService {
    TaskModifyRes updateTask(TaskModifyReq taskModifyReq);
    TaskDeleteRes deleteTask(TaskDeleteReq taskDeleteReq);
    TaskRes getTask(long id);
}
