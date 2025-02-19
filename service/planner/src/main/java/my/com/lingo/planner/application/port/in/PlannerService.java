package my.com.lingo.planner.application.port.in;

import my.com.lingo.planner.adaptor.in.web.dto.planner.*;

public interface PlannerService {
    PlannerCreateRes createPlanner(long setId, PlannerCreateReq plannerCreateReq);
    PlannerModifyRes updatePlanner(long id, PlannerModifyReq plannerModifyReq);
    PlannerDeleteRes deletePlanner(long id);
    PlannerRes getPlanner(long id);
    PlannerListRes getPlanners(long setId);
}
