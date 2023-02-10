package com.example.test.domain.schedule;

import lombok.Getter;

@Getter
public enum ScheduleState {

    PROCEEDING("진행중"), END("마감");

    private String ScheduleStateToString;

    ScheduleState(String scheduleStateToString) {
        ScheduleStateToString = scheduleStateToString;
    }
}
