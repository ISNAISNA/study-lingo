package my.com.lingo.planner.application.service;

import my.com.lingo.planner.adaptor.in.web.dto.plannerSet.*;
import my.com.lingo.planner.application.port.in.PlannerSetService;
import org.springframework.stereotype.Service;

@Service
public class PlannerSetServiceImpl implements PlannerSetService {
    @Override
    public PlannerSetCreateRes createPlannerSet(PlannerSetCreateReq plannerReq) {
        return null;
    }

    @Override
    public PlannerSetRes getPlannerSet(long id) {
        return null;
    }

    @Override
    public PlannerSetModifyRes updatePlannerSet(long id, PlannerSetModifyReq plannerReq) {
        return null;
    }

    @Override
    public PlannerSetDeleteRes deletePlannerSet(long id) {
        return null;
    }
}
