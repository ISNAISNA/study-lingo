package my.com.lingo.planner.adaptor.out.persistence.plannerSet;

import lombok.RequiredArgsConstructor;
import my.com.lingo.planner.application.port.out.persistence.PlannerSetRepoPort;
import my.com.lingo.planner.domain.PlannerSet;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class PlannerSetRepoAdaptor implements PlannerSetRepoPort {
    private final PlannerSetRepo plannerSetRepo;

    @Override
    public PlannerSet save(PlannerSet plannerSet) {
        return plannerSetRepo.save(plannerSet);
    }

    @Override
    public PlannerSet getPlannerSetById(long id) {
        return plannerSetRepo.findById(id).orElseThrow(()->new RuntimeException("PlannerSet not found"));
    }

    @Override
    public PlannerSet update(long id, PlannerSet plannerSetReq) {
        Optional<PlannerSet> findPlannerSet = plannerSetRepo.findById(id);
        findPlannerSet.orElseThrow(()->new RuntimeException("PlannerSet not found"));

        findPlannerSet.ifPresent(plannerSet->{
            plannerSet.update(plannerSetReq.getTitle(), plannerSetReq.getDueDate());
        });

        return findPlannerSet.get();
    }

    @Override
    public PlannerSet deleteById(long id) {
        Optional<PlannerSet> findPlannerSet = plannerSetRepo.findById(id);
        findPlannerSet.orElseThrow(()->new RuntimeException("PlannerSet not found"));
        plannerSetRepo.deleteById(id);
        return findPlannerSet.get();
    }
}
