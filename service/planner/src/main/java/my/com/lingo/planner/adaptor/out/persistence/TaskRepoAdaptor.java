package my.com.lingo.planner.adaptor.out.persistence;

import lombok.RequiredArgsConstructor;
import my.com.lingo.planner.application.port.out.persistence.TaskRepoPort;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class TaskRepoAdaptor implements TaskRepoPort {
    private final TaskRepo taskRepo;

}
