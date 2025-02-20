package my.com.lingo.planner.adaptor.out.persistence.planner;

import lombok.RequiredArgsConstructor;
import my.com.lingo.planner.adaptor.out.persistence.plannerSet.PlannerSetRepo;
import my.com.lingo.planner.application.port.out.persistence.PlannerRepoPort;
import my.com.lingo.planner.domain.Planner;
import my.com.lingo.planner.domain.PlannerSet;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class PlannerRepoAdaptor implements PlannerRepoPort {
    private final PlannerSetRepo plannerSetRepo;
    private final PlannerRepo plannerRepo;

    @Override
    public Planner getPlannerById(long id) {
        return plannerRepo.findById(id).orElseThrow(()->new RuntimeException("Planner not found"));
    }

    @Override
    public Planner save(long setId, Planner plannerReq) {
        Optional<PlannerSet> findPlannerSet = plannerSetRepo.findById(setId);
        findPlannerSet.orElseThrow(()->new RuntimeException("Planner Set not found"));
        plannerReq.updatePlannerSet(findPlannerSet.get());
        return plannerRepo.save(plannerReq);
    }

    @Override
    public Planner update(long id, Planner plannerReq) {
        Optional<Planner> findPlanner = plannerRepo.findById(id);
        findPlanner.orElseThrow(()->new RuntimeException("Planner not found"));

        findPlanner.ifPresent(planner ->{
            planner.update(plannerReq.getTitle(), plannerReq.getMemo());
        });
        return findPlanner.get();
    }

    @Override
    public Planner deleteById(long id) {
        Optional<Planner> findPlanner = plannerRepo.findById(id);
        findPlanner.orElseThrow(()->new RuntimeException("Planner not found"));
        plannerRepo.deleteById(id);
        return findPlanner.get();
    }

    @Override
    public List<Planner> getPlannerByPlannerSetId(long setId) {
        return plannerRepo.findPlannerListByPlannerSetId(setId);
    }
}
