package my.com.lingo.planner.adaptor.in.web;

import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import my.com.lingo.planner.adaptor.in.web.dto.task.TaskDeleteRes;
import my.com.lingo.planner.adaptor.in.web.dto.task.TaskListRes;
import my.com.lingo.planner.adaptor.in.web.dto.task.TaskModifyReq;
import my.com.lingo.planner.adaptor.in.web.dto.task.TaskModifyRes;
import my.com.lingo.planner.adaptor.in.web.dto.taskSet.TaskSetRes;
import my.com.lingo.planner.application.port.in.TaskService;
import my.com.lingo.planner.application.service.TaskSetServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/planner")
@RequiredArgsConstructor
public class TaskController {
    private final TaskService taskService;

    @Operation(summary = "Task 전체 그룹 조회")
    @GetMapping("/task-set/{taskSetId}/tasks")
    public ResponseEntity<TaskListRes> getTaskByTaskSetId(@PathVariable Long taskSetId) {
        return ResponseEntity.ok(taskService.getTaskListByTaskSetId(taskSetId));
    }

    @Operation(summary = "Task 삭제")
    @DeleteMapping("/task-set/{taskSetId}/tasks/{id}")
    public ResponseEntity<TaskDeleteRes> deleteTask(@PathVariable Long taskSetId, @PathVariable Long id) {
        return ResponseEntity.ok(taskService.deleteTask(id));
    }

    @Operation(summary = "Task 수정")
    @PatchMapping("/task-set/{taskSetId}/tasks/{id}")
    public ResponseEntity<TaskModifyRes> updateTaskSet(@PathVariable Long taskSetId, @PathVariable Long id, @RequestBody TaskModifyReq taskModifyReq) {
        return ResponseEntity.ok(taskService.updateTask(id, taskModifyReq));
    }

}
