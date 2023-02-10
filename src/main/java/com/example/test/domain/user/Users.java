package com.example.test.domain.user;

import com.example.test.domain.board.use.UploadFile;
import com.example.test.domain.entity.BaseEntity;
import com.example.test.domain.user.submit.SubmitForm;
import jakarta.persistence.*;
import org.hibernate.annotations.Comment;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Users extends BaseEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //===========회원 가입============//
    @Comment("학번")
    @Column(nullable = false)
    private String studentId;

    @Comment("학생 비밀번호")
    @Column(nullable = false)
    private String studentPassword;

    @Comment("학생 이름")
    @Column(nullable = false)
    private String studentName;

    @Comment("성별")
    @Enumerated(EnumType.STRING)
    private Sex sex;

    @Comment("생일")
    @Column(nullable = false)
    private LocalDate birth;

    @Comment("이메일")
    @Column(nullable = false)
    private String email;

    @Comment("전화번호")
    @Column(nullable = false)
    private String phoneNumber;

    @Comment("신분")
    @Enumerated(EnumType.STRING)
    private Classification classification;

    @Comment("소속학과")
    @Column(nullable = false)
    private String department;

    @OneToMany(mappedBy = "users")
    private List<SubmitForm> submitForms = new ArrayList<>();

    // 양방향 연관관계 편의 메소드
    public void addForms(SubmitForm submitForm) {
        submitForms.add(submitForm);
        submitForm.setUsers(this);
    }

}
