package my.com.lingo.planner.application.port.in;

import my.com.lingo.planner.adaptor.in.web.dto.taskSet.TaskSetDeleteRes;
import my.com.lingo.planner.adaptor.in.web.dto.taskSet.TaskSetModifyReq;
import my.com.lingo.planner.adaptor.in.web.dto.taskSet.TaskSetModifyRes;
import my.com.lingo.planner.adaptor.in.web.dto.taskSet.TaskSetRes;

public interface TaskSetService {
    TaskSetModifyRes updateTaskSet(long id, TaskSetModifyReq taskSetModifyReq);
    TaskSetDeleteRes deleteTaskSet(long id);
    TaskSetRes getTaskSet(long id);
}
