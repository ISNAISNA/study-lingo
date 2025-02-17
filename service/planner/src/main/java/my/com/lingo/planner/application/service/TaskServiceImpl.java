package my.com.lingo.planner.application.service;

import my.com.lingo.planner.adaptor.in.web.dto.task.*;
import my.com.lingo.planner.application.port.in.TaskService;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService {
    @Override
    public TaskModifyRes updateTask(TaskModifyReq taskModifyReq) {
        return null;
    }

    @Override
    public TaskDeleteRes deleteTask(TaskDeleteReq taskDeleteReq) {
        return null;
    }

    @Override
    public TaskRes getTask(long id) {
        return null;
    }
}
