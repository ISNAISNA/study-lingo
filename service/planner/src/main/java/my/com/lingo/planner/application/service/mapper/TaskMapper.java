package my.com.lingo.planner.application.service.mapper;

import my.com.lingo.planner.adaptor.in.web.dto.task.*;
import my.com.lingo.planner.domain.Task;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TaskMapper {
    Task toEntity(TaskCreateReq taskCreateReq);
    Task toEntity(TaskModifyReq taskModifyReq);

    TaskCreateRes toTaskCreateRes(Task task);
    TaskModifyRes toTaskModifyRes(Task task);
    TaskDeleteRes toTaskDeleteRes(Task task);
    TaskRes toTaskRes(Task task);

    List<TaskRes> toTaskResList(List<Task> taskList);

    default TaskListRes toTaskListRes(List<Task> taskList){
        List<TaskRes> taskResList = toTaskResList(taskList);
        return new TaskListRes(taskResList);
    }

}
