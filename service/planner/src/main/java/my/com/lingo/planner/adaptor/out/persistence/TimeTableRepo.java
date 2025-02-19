package my.com.lingo.planner.adaptor.out.persistence;

import my.com.lingo.planner.domain.TimeTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimeTableRepo extends JpaRepository<TimeTable, Long> {
}
