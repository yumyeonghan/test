package com.example.test.domain.board;

import com.example.test.domain.entity.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.hibernate.annotations.Comment;

//액셀 저장 게시판(테이블)로 뺴
@Entity
public class ExcelBoard extends BaseEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Comment("학번")
    private String studentId;
    @Comment("학생 이름")
    private String studentName;
    @Comment("교수 이름")
    private String professorName;
    @Comment("학생 졸업날짜")
    private String graduationDate;
    @Comment("단계")
    private String step;
    @Comment("상태")
    private String state;
    @Comment("기타 자격")
    private String otherQualifications;
    @Comment("캡스톤 이수")
    private String capstoneCompletion;

}
