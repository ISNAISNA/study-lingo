package my.com.lingo.planner.application.service;

import lombok.RequiredArgsConstructor;
import my.com.lingo.planner.adaptor.in.web.dto.plannerSet.*;
import my.com.lingo.planner.application.port.in.PlannerSetService;
import my.com.lingo.planner.application.port.out.persistence.PlannerSetRepoPort;
import my.com.lingo.planner.application.service.mapper.PlannerSetMapper;
import my.com.lingo.planner.domain.PlannerSet;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class PlannerSetServiceImpl implements PlannerSetService {
    private final PlannerSetRepoPort plannerSetRepoPort;
    private final PlannerSetMapper plannerSetMapper;

    @Override
    public PlannerSetCreateRes createPlannerSet(PlannerSetCreateReq plannerSetReq) {
        PlannerSet plannerSet = plannerSetMapper.toEntity(plannerSetReq);
        return plannerSetMapper.toPlannerSetCreateRes(plannerSetRepoPort.save(plannerSet));
    }

    @Override
    public PlannerSetRes getPlannerSet(long id) {
        return plannerSetMapper.toPlannerSetRes(plannerSetRepoPort.getPlannerSetById(id));
    }

    @Override
    public PlannerSetModifyRes updatePlannerSet(long id, PlannerSetModifyReq plannerSetReq) {
        PlannerSet plannerSet = plannerSetMapper.toEntity(plannerSetReq);
        return plannerSetMapper.toPlannerSetModifyRes(plannerSetRepoPort.update(id, plannerSet));
    }

    @Override
    public PlannerSetDeleteRes deletePlannerSet(long id) {
        return plannerSetMapper.toPlannerSetDeleteRes(plannerSetRepoPort.deleteById(id));
    }
}
