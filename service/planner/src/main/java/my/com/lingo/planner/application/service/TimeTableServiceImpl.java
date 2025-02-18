package my.com.lingo.planner.application.service;

import my.com.lingo.planner.adaptor.in.web.dto.timeTable.*;
import my.com.lingo.planner.application.port.in.TimeTableService;
import org.springframework.stereotype.Service;

@Service
public class TimeTableServiceImpl implements TimeTableService {
    @Override
    public TimeTableCreateRes createTimeTable(TimeTableCreateReq timeTableCreateReq) {
        return null;
    }

    @Override
    public TimeTableModifyRes updateTimeTable(long id, TimeTableModifyReq timeTableModifyReq) {
        return null;
    }

    @Override
    public TimeTableDeleteRes deleteTimeTable(long id) {
        return null;
    }

    @Override
    public TimeTableRes getTimeTable(long id) {
        return null;
    }

    @Override
    public TimeTableListRes getTimeTableByTaskId(long taskId) {
        return null;
    }

    @Override
    public TimeTableListRes getTimeTableByTaskSetId(long taskSetId) {
        return null;
    }
}
