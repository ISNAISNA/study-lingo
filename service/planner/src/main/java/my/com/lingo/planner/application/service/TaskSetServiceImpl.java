package my.com.lingo.planner.application.service;

import my.com.lingo.planner.adaptor.in.web.dto.taskSet.TaskSetDeleteRes;
import my.com.lingo.planner.adaptor.in.web.dto.taskSet.TaskSetModifyReq;
import my.com.lingo.planner.adaptor.in.web.dto.taskSet.TaskSetModifyRes;
import my.com.lingo.planner.adaptor.in.web.dto.taskSet.TaskSetRes;
import my.com.lingo.planner.application.port.in.TaskSetService;
import org.springframework.stereotype.Service;

@Service
public class TaskSetServiceImpl implements TaskSetService {
    @Override
    public TaskSetModifyRes updateTaskSet(long id, TaskSetModifyReq taskSetModifyReq) {
        return null;
    }

    @Override
    public TaskSetDeleteRes deleteTaskSet(long id) {
        return null;
    }

    @Override
    public TaskSetRes getTaskSet(long id) {
        return null;
    }
}
