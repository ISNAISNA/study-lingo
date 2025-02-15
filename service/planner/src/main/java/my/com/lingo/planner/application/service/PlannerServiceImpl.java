package my.com.lingo.planner.application.service;

import my.com.lingo.planner.adaptor.in.web.dto.planner.*;
import my.com.lingo.planner.application.port.in.PlannerService;
import org.springframework.stereotype.Service;

@Service
public class PlannerServiceImpl implements PlannerService {
    @Override
    public PlannerCreateRes createPlanner(PlannerCreateReq req) {
        return null;
    }

    @Override
    public PlannerModifyRes updatePlanner(long id, PlannerModifyReq req) {
        return null;
    }

    @Override
    public PlannerDeleteRes deletePlanner(long id) {
        return null;
    }

    @Override
    public PlannerRes getPlanner(long id) {
        return null;
    }

    @Override
    public PlannerListRes getPlanners(long groupId) {
        return null;
    }
}
