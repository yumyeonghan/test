package com.example.test.domain.user.submit;

import com.example.test.domain.board.use.UploadFile;
import com.example.test.domain.entity.BaseEntity;
import com.example.test.domain.user.Users;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Comment;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * 신청 리스트 보여줄 때 사용
 */

@Entity
@Getter @Setter
public class SubmitForm extends BaseEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Comment("학번")
    @Column(nullable = false)
    private String studentId;

    @Comment("학생 이름")
    @Column(nullable = false)
    private String studentName;

    @Comment("소속학과")
    @Column(nullable = false)
    private String department;

    @Comment("졸업날짜")
    @Column(nullable = false)
    private LocalDate graduationDate;

    @OneToMany(mappedBy = "submitForm", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OtherQualifications> otherQualifications = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "users_id", foreignKey = @ForeignKey(name = "fk_submit_form_to_users"))
    private Users users;

    //양방향 연관관계 편의 메소드
    public void addOtherQualifications(OtherQualifications otherQualification) {
        otherQualifications.add(otherQualification);
        otherQualification.setSubmitForm(this);
    }


}
