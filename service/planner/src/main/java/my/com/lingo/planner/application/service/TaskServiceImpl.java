package my.com.lingo.planner.application.service;

import lombok.RequiredArgsConstructor;
import my.com.lingo.planner.adaptor.in.web.dto.task.*;
import my.com.lingo.planner.application.port.in.TaskService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TaskServiceImpl implements TaskService {
    @Override
    public TaskModifyRes updateTask(long id, TaskModifyReq taskModifyReq) {
        return null;
    }

    @Override
    public TaskDeleteRes deleteTask(long id) {
        return null;
    }

    @Override
    public TaskRes getTask(long id) {
        return null;
    }

    @Override
    public TaskListRes getTaskListByTaskSetId(long taskSetId) {
        return null;
    }
}
