package my.com.lingo.planner.adaptor.out.persistence;

import my.com.lingo.planner.domain.PlannerSet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlannerSetRepo extends JpaRepository<PlannerSet, Long> {
}
