package my.com.lingo.planner.application.service.mapper;

import my.com.lingo.planner.adaptor.in.web.dto.plannerSet.*;
import my.com.lingo.planner.domain.PlannerSet;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PlannerSetMapper {
    PlannerSet toEntity(PlannerSetCreateReq plannerSetCreateReq);
    PlannerSet toEntity(PlannerSetModifyReq plannerSetModifyReq);

    PlannerSetCreateRes toPlannerSetCreateRes(PlannerSet plannerSet);
    PlannerSetModifyRes toPlannerSetModifyRes(PlannerSet plannerSet);
    PlannerSetDeleteRes toPlannerSetDeleteRes(PlannerSet plannerSet);
    PlannerSetRes toPlannerSetRes(PlannerSet plannerSet);
}
