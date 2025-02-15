package my.com.lingo.planner.adaptor.in.web;

import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import my.com.lingo.planner.adaptor.in.web.dto.planner.*;
import my.com.lingo.planner.adaptor.in.web.dto.plannerSet.*;
import my.com.lingo.planner.application.port.in.PlannerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/planner")
@RequiredArgsConstructor
public class PlannerController {
    private final PlannerService plannerService;

    @Operation(summary = "플래너 조회")
    @GetMapping("/planner-set/{groupId}/planners/{id}")
    public ResponseEntity<PlannerRes> getPlannerSet(@PathVariable long id){
        return ResponseEntity.ok(plannerService.getPlanner(id));
    }

    @Operation(summary = "플래너 추가")
    @PostMapping("/planner-set/planners")
    public ResponseEntity<PlannerCreateRes> createPlannerSet(@RequestBody PlannerCreateReq plannerCreateReq){
        return ResponseEntity.ok(plannerService.createPlanner(plannerCreateReq));
    }

    @Operation(summary = "플래너 수정")
    @PatchMapping("/planner-set/{groupId}/planners/{id}")
    public ResponseEntity<PlannerModifyRes> modifyPlannerSet(@PathVariable long id, @RequestBody PlannerModifyReq plannerModifyReq){
        return ResponseEntity.ok(plannerService.updatePlanner(id, plannerModifyReq));
    }
    
    @Operation(summary = "플래너 삭제")
    @DeleteMapping("/planner-set/{groupId}/planners/{id}")
    public ResponseEntity<PlannerDeleteRes> deletePlannerSet(@PathVariable long id){
        return ResponseEntity.ok(plannerService.deletePlanner(id));
    }

    @Operation(summary = "플래너 전체 조회")
    @GetMapping("/planner-set/{groupId}/planners")
    public ResponseEntity<PlannerListRes> getAllPlanner(@PathVariable long groupId){
        return ResponseEntity.ok(plannerService.getPlanners(groupId));
    }
}
