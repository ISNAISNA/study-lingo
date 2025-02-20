package my.com.lingo.planner.adaptor.out.persistence.task;

import lombok.RequiredArgsConstructor;
import my.com.lingo.planner.adaptor.out.persistence.taskSet.TaskSetRepo;
import my.com.lingo.planner.application.port.out.persistence.TaskRepoPort;
import my.com.lingo.planner.domain.Task;
import my.com.lingo.planner.domain.TaskSet;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class TaskRepoAdaptor implements TaskRepoPort {
    private final TaskSetRepo taskSetRepo;
    private final TaskRepo taskRepo;

    @Override
    public Task getTaskById(long id) {
        return taskRepo.findById(id).orElseThrow(()->new RuntimeException("Task not found"));
    }

    @Override
    public Task save(long setId, Task taskReq) {
        Optional<TaskSet> findTaskSet = taskSetRepo.findById(setId);
        findTaskSet.orElseThrow(()->new RuntimeException("Task set not found"));
        taskReq.updateTaskSet(findTaskSet.get());
        return taskRepo.save(taskReq);
    }

    @Override
    public List<Task> getTaskByTaskSetId(long setId) {
        return taskRepo.findTaskListByTaskSetId(setId);
    }

    @Override
    public Task deleteById(long id) {
        Optional<Task> findTask = taskRepo.findById(id);
        findTask.orElseThrow(()->new RuntimeException("Task not found"));
        taskRepo.deleteById(id);
        return findTask.get();
    }

    @Override
    public Task update(long id, Task taskReq) {
        Optional<Task> findTask = taskRepo.findById(id);
        findTask.orElseThrow(()->new RuntimeException("Task not found"));

        findTask.ifPresent(task ->{
            task.update(taskReq.isCompleted());
        });

        return findTask.get();
    }
}
