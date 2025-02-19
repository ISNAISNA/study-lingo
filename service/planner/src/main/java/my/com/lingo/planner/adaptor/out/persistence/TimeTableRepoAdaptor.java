package my.com.lingo.planner.adaptor.out.persistence;

import lombok.RequiredArgsConstructor;
import my.com.lingo.planner.application.port.out.persistence.TimeTableRepoPort;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class TimeTableRepoAdaptor implements TimeTableRepoPort {
    private final TimeTableRepo timeTableRepo;
}
