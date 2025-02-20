package my.com.lingo.planner.application.service.mapper;

import my.com.lingo.planner.adaptor.in.web.dto.planner.*;
import my.com.lingo.planner.domain.Planner;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PlannerMapper {
    Planner toEntity(PlannerCreateReq plannerCreateReq);
    Planner toEntity(PlannerModifyReq plannerModifyReq);

    PlannerCreateRes toPlannerCreateRes(Planner planner);
    PlannerModifyRes toPlannerModifyRes(Planner planner);
    PlannerDeleteRes toPlannerDeleteRes(Planner planner);
    PlannerRes toPlannerRes(Planner planner);

    List<PlannerRes> toPlannerResList(List<Planner> plannerList);

    default PlannerListRes toPlannerListRes(List<Planner> plannerList){
        List<PlannerRes> plannerResList = toPlannerResList(plannerList);
        return new PlannerListRes(plannerResList);
    }

}
