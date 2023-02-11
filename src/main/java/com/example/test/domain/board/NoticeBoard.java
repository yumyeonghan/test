package com.example.test.domain.board;

import com.example.test.domain.Comments;
import com.example.test.domain.board.use.NoticeBoardUploadFile;
import com.example.test.domain.entity.BaseEntity;
import com.example.test.domain.user.Admins;
import jakarta.persistence.*;
import org.hibernate.annotations.Comment;

import java.util.ArrayList;
import java.util.List;

@Entity
public class NoticeBoard extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Comment("공지사항 제목")
    @Column(nullable = false)
    private String title;

    @Comment("공지사항 본문")
    @Column(nullable = false)
    private String text;

    @Comment("고정 여부")
    private boolean fixed;

    @Comment("조회수")
    private Integer views;

    @OneToMany(mappedBy = "noticeBoard", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Comments> comments = new ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "admins_id", foreignKey = @ForeignKey(name = "fk_notice_board_to_admin"))
    private Admins admins;

    @OneToMany(mappedBy = "noticeBoard", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<NoticeBoardUploadFile> uploadFiles = new ArrayList<>();

    // 양방향 연관관계 편의 메소드
    public void addUploadFile(NoticeBoardUploadFile uploadFile) {
        uploadFiles.add(uploadFile);
        uploadFile.setNoticeBoard(this);
    }

}
