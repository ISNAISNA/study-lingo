package my.com.lingo.planner.adaptor.in.web;

import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import my.com.lingo.planner.adaptor.in.web.dto.task.*;
import my.com.lingo.planner.application.port.in.TaskService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/planner")
@RequiredArgsConstructor
public class TaskController {
    private final TaskService taskService;

    @Operation(summary = "Task 추가")
    @PostMapping("/task-set/{setId}/tasks")
    public ResponseEntity<TaskCreateRes> createTask(@PathVariable Long setId, @RequestBody TaskCreateReq taskCreateReq) {
        return ResponseEntity.ok(taskService.createTask(setId, taskCreateReq));
    }

    @Operation(summary = "Task 전체 그룹 조회")
    @GetMapping("/task-set/{setId}/tasks")
    public ResponseEntity<TaskListRes> getTaskByTaskSetId(@PathVariable Long setId) {
        return ResponseEntity.ok(taskService.getTaskListByTaskSetId(setId));
    }

    @Operation(summary = "Task 삭제")
    @DeleteMapping("/task-set/{setId}/tasks/{id}")
    public ResponseEntity<TaskDeleteRes> deleteTask(@PathVariable Long setId, @PathVariable Long id) {
        return ResponseEntity.ok(taskService.deleteTask(id));
    }

    @Operation(summary = "Task 수정")
    @PatchMapping("/task-set/{setId}/tasks/{id}")
    public ResponseEntity<TaskModifyRes> updateTaskSet(@PathVariable Long setId, @PathVariable Long id, @RequestBody TaskModifyReq taskModifyReq) {
        return ResponseEntity.ok(taskService.updateTask(id, taskModifyReq));
    }

}
