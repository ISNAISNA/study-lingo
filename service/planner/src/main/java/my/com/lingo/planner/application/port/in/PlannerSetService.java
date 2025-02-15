package my.com.lingo.planner.application.port.in;

import my.com.lingo.planner.adaptor.in.web.dto.plannerSet.*;

public interface PlannerSetService {
    PlannerSetCreateRes createPlannerSet(PlannerSetCreateReq plannerReq);
    PlannerSetRes getPlannerSet(long id);
    PlannerSetModifyRes updatePlannerSet(long id, PlannerSetModifyReq plannerReq);
    PlannerSetDeleteRes deletePlannerSet(long id);
}

