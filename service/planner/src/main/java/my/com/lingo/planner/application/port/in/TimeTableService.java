package my.com.lingo.planner.application.port.in;

import my.com.lingo.planner.adaptor.in.web.dto.timeTable.*;

public interface TimeTableService {
    TimeTableCreateRes createTimeTable(TimeTableCreateReq timeTableCreateReq);
    TimeTableModifyRes updateTimeTable(long id, TimeTableModifyReq timeTableModifyReq);
    TimeTableDeleteRes deleteTimeTable(long id);
    TimeTableRes getTimeTable(long id);
    TimeTableListRes getTimeTableByTaskId(long taskId);
    TimeTableListRes getTimeTableByTaskSetId(long taskSetId);
}
