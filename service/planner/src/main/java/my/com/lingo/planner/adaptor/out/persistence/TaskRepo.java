package my.com.lingo.planner.adaptor.out.persistence;

import my.com.lingo.planner.domain.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepo extends JpaRepository<Task, Long> {
}
