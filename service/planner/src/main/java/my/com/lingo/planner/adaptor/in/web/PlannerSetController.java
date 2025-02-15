package my.com.lingo.planner.adaptor.in.web;

import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import my.com.lingo.planner.adaptor.in.web.dto.plannerSet.*;
import my.com.lingo.planner.application.port.in.PlannerSetService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/planner")
@RequiredArgsConstructor
public class PlannerSetController {
    private final PlannerSetService plannerSetService;

    @Operation(summary = "플래너 그룹 조회")
    @GetMapping("/planner-set/{id}")
    public ResponseEntity<PlannerSetRes> getPlannerSet(@PathVariable long id){
        return ResponseEntity.ok(plannerSetService.getPlannerSet(id));
    }

    @Operation(summary = "플래너 그룹 추가")
    @PostMapping("/planner-set")
    public ResponseEntity<PlannerSetCreateRes> createPlannerSet(@RequestBody PlannerSetCreateReq plannerSetCreateReq){
        return ResponseEntity.ok(plannerSetService.createPlannerSet(plannerSetCreateReq));
    }

    @Operation(summary = "플래너 그룹 수정")
    @PatchMapping("/planner-set/{id}")
    public ResponseEntity<PlannerSetModifyRes> modifyPlannerSet(@PathVariable long id, @RequestBody PlannerSetModifyReq plannerSetModifyReq){
        return ResponseEntity.ok(plannerSetService.updatePlannerSet(id, plannerSetModifyReq));
    }
    
    @Operation(summary = "플래너 그룹 삭제")
    @DeleteMapping("/planner-set/{id}")
    public ResponseEntity<PlannerSetDeleteRes> deletePlannerSet(@PathVariable long id){
        return ResponseEntity.ok(plannerSetService.deletePlannerSet(id));
    }
}
