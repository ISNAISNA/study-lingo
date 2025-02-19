package my.com.lingo.planner.application.service;

import lombok.RequiredArgsConstructor;
import my.com.lingo.planner.adaptor.in.web.dto.planner.*;
import my.com.lingo.planner.application.port.in.PlannerService;
import my.com.lingo.planner.application.port.out.persistence.PlannerRepoPort;
import my.com.lingo.planner.application.service.mapper.PlannerMapper;
import my.com.lingo.planner.domain.Planner;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PlannerServiceImpl implements PlannerService {
    private final PlannerRepoPort plannerRepoPort;
    private final PlannerMapper plannerMapper;

    @Override
    public PlannerCreateRes createPlanner(long setId, PlannerCreateReq plannerCreateReq) {
        Planner planner = plannerMapper.toEntity(plannerCreateReq);
        return plannerMapper.toPlannerCreateRes(plannerRepoPort.save(setId, planner));
    }

    @Override
    public PlannerModifyRes updatePlanner(long id, PlannerModifyReq plannerModifyReq) {
        Planner planner = plannerMapper.toEntity(plannerModifyReq);
        return plannerMapper.toPlannerModifyRes(plannerRepoPort.update(id, planner));
    }

    @Override
    public PlannerDeleteRes deletePlanner(long id) {
        return plannerMapper.toPlannerDeleteRes(plannerRepoPort.deleteById(id));
    }

    @Override
    public PlannerRes getPlanner(long id) {
        return plannerMapper.toPlannerRes(plannerRepoPort.getPlannerById(id));
    }

    @Override
    public PlannerListRes getPlanners(long setId) {
        return plannerMapper.toPlannerListRes(plannerRepoPort.getPlannerByPlannerSetId(setId));
    }
}
