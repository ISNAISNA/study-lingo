package my.com.lingo.planner.adaptor.out.persistence.planner;

import my.com.lingo.planner.domain.Planner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlannerRepo extends JpaRepository<Planner, Long>, PlannerCustomRepo {
}
