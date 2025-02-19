package my.com.lingo.planner.adaptor.out.persistence;

import lombok.RequiredArgsConstructor;
import my.com.lingo.planner.application.port.out.persistence.TaskSetRepoPort;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class TaskSetRepoAdaptor implements TaskSetRepoPort {
    private final TaskSetRepo taskSetRepo;
}
