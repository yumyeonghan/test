package com.example.test.domain;

import com.example.test.domain.board.NoticeBoard;
import com.example.test.domain.entity.BaseEntity;
import jakarta.persistence.*;
import org.hibernate.annotations.Comment;

@Entity
public class Comments extends BaseEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Comment("댓글")
    private String comment;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "noticeBoard_id", foreignKey = @ForeignKey(name = "fk_comments_to_notice_board"))
    private NoticeBoard noticeBoard;


}
