package my.com.lingo.planner.adaptor.in.web;

import lombok.RequiredArgsConstructor;
import my.com.lingo.planner.application.port.in.TimeTableService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/planner")
@RequiredArgsConstructor
public class TimeTableController {
    private final TimeTableService timeTableService;
}
