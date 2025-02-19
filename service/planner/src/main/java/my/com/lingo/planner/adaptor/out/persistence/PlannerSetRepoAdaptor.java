package my.com.lingo.planner.adaptor.out.persistence;

import lombok.RequiredArgsConstructor;
import my.com.lingo.planner.application.port.out.persistence.PlannerSetRepoPort;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class PlannerSetRepoAdaptor implements PlannerSetRepoPort {
    private final PlannerSetRepo plannerSetRepo;
}
