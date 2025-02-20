package my.com.lingo.planner.adaptor.out.persistence.taskSet;

import my.com.lingo.planner.domain.TaskSet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskSetRepo extends JpaRepository<TaskSet, Long> {
}
