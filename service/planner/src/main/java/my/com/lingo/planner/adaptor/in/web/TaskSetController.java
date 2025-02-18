package my.com.lingo.planner.adaptor.in.web;

import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import my.com.lingo.planner.adaptor.in.web.dto.taskSet.TaskSetDeleteRes;
import my.com.lingo.planner.adaptor.in.web.dto.taskSet.TaskSetModifyReq;
import my.com.lingo.planner.adaptor.in.web.dto.taskSet.TaskSetModifyRes;
import my.com.lingo.planner.adaptor.in.web.dto.taskSet.TaskSetRes;
import my.com.lingo.planner.application.port.in.TaskSetService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/planner")
@RequiredArgsConstructor
public class TaskSetController {
    private final TaskSetService taskSetService;

    @Operation(summary = "Task Set 조회")
    @GetMapping("/task-set/{id}")
    public ResponseEntity<TaskSetRes> getTaskSet(@PathVariable Long id) {
        return ResponseEntity.ok(taskSetService.getTaskSet(id));
    }

    @Operation(summary = "Task Set 수정")
    @PatchMapping("/task-set/{id}")
    public ResponseEntity<TaskSetModifyRes> updateTaskSet(@PathVariable Long id, @RequestBody TaskSetModifyReq taskSetModifyReq) {
        return ResponseEntity.ok(taskSetService.updateTaskSet(id, taskSetModifyReq));
    }

    @Operation(summary = "Task Set 삭제")
    @DeleteMapping("/task-set/{id}")
    public ResponseEntity<TaskSetDeleteRes> deleteTaskSet(@PathVariable Long id) {
        return ResponseEntity.ok(taskSetService.deleteTaskSet(id));
    }
}
