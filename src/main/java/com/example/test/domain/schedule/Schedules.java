package com.example.test.domain.schedule;

import com.example.test.domain.entity.BaseEntity;
import jakarta.persistence.*;
import org.hibernate.annotations.Comment;

import java.time.LocalDate;

@Entity
public class Schedules extends BaseEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Comment("단계")
    @Enumerated(EnumType.STRING)
    private Step step;

    @Comment("시작 일정")
    private LocalDate startDate;

    @Comment("종료 일정")
    private LocalDate endDate;

    @Enumerated(EnumType.STRING)
    private ScheduleState scheduleState;

}
