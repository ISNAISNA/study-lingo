package my.com.lingo.planner.application.port.in;

import my.com.lingo.planner.adaptor.in.web.dto.planner.*;

public interface PlannerService {
    PlannerCreateRes createPlanner(PlannerCreateReq req);
    PlannerModifyRes updatePlanner(long id, PlannerModifyReq req);
    PlannerDeleteRes deletePlanner(long id);
    PlannerRes getPlanner(long id);
    PlannerListRes getPlanners(long groupId);
}
