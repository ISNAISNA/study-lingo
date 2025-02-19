package my.com.lingo.planner.adaptor.in.web;

import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import my.com.lingo.planner.adaptor.in.web.dto.timeTable.*;
import my.com.lingo.planner.application.port.in.TimeTableService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/planner")
@RequiredArgsConstructor
public class TimeTableController {
    private final TimeTableService timeTableService;

    @Operation(summary = "타임 테이블 조회")
    @GetMapping("/time-tables/{id}")
    public ResponseEntity<TimeTableRes> getTimeTable(@PathVariable long id){
        return ResponseEntity.ok(timeTableService.getTimeTable(id));
    }

    @Operation(summary = "Task Set 타임 테이블 전체 조회")
    @GetMapping("/task-set/{taskSetId}/time-tables")
    public ResponseEntity<TimeTableListRes> getTimeTableByTaskSetId(@PathVariable long taskSetId){
        return ResponseEntity.ok(timeTableService.getTimeTableByTaskSetId(taskSetId));
    }

    @Operation(summary = "Task 타임 테이블 전체 조회")
    @GetMapping("/task-set/{taskSetId}/tasks/{taskId}/time-tables")
    public ResponseEntity<TimeTableListRes> getTimeTableByTaskId(@PathVariable long taskSetId, @PathVariable long taskId){
        return ResponseEntity.ok(timeTableService.getTimeTableByTaskId(taskId));
    }

    @Operation(summary = "타임 테이블 삭제")
    @DeleteMapping("/time-tables/{id}")
    public ResponseEntity<TimeTableDeleteRes> deleteTimeTable(@PathVariable long id){
        return ResponseEntity.ok(timeTableService.deleteTimeTable(id));
    }

    @Operation(summary = "타임 테이블 수정")
    @PatchMapping("/time-tables/{id}")
    public ResponseEntity<TimeTableModifyRes> modifyTimeTable(@PathVariable long id, @RequestBody TimeTableModifyReq timeTableModifyReq){
        return ResponseEntity.ok(timeTableService.updateTimeTable(id, timeTableModifyReq));
    }
}
