package my.com.lingo.planner.application.service;

import lombok.RequiredArgsConstructor;
import my.com.lingo.planner.adaptor.in.web.dto.task.*;
import my.com.lingo.planner.application.port.in.TaskService;
import my.com.lingo.planner.application.port.out.persistence.TaskRepoPort;
import my.com.lingo.planner.application.service.mapper.TaskMapper;
import my.com.lingo.planner.domain.Task;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class TaskServiceImpl implements TaskService {
    private final TaskRepoPort taskRepoPort;
    private final TaskMapper taskMapper;

    @Override
    public TaskModifyRes updateTask(long id, TaskModifyReq taskModifyReq) {
        Task task = taskMapper.toEntity(taskModifyReq);
        return taskMapper.toTaskModifyRes(taskRepoPort.update(id, task));
    }

    @Override
    public TaskDeleteRes deleteTask(long id) {
        return taskMapper.toTaskDeleteRes(taskRepoPort.deleteById(id));
    }

    @Override
    public TaskRes getTask(long id) {
        return taskMapper.toTaskRes(taskRepoPort.getTaskById(id));
    }

    @Override
    public TaskListRes getTaskListByTaskSetId(long taskSetId) {
        return taskMapper.toTaskListRes(taskRepoPort.getTaskByTaskSetId(taskSetId));
    }

    @Override
    public TaskCreateRes createTask(long setId, TaskCreateReq taskCreateReq) {
        Task task = taskMapper.toEntity(taskCreateReq);
        return taskMapper.toTaskCreateRes(taskRepoPort.save(setId, task));
    }
}
