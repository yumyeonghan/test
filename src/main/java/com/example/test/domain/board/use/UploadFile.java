package com.example.test.domain.board.use;

import com.example.test.domain.board.NoticeBoard;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Comment;

@Entity
@Getter @Setter
public class UploadFile {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Comment("고객이 업로드한 파일명")
    private String uploadFileName;
    @Comment("서버 내부에서 관리하는 파일명")
    private String storeFileName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "noticeBoard_id", foreignKey = @ForeignKey(name = "fk_upload_file_to_notice_board"))
    private NoticeBoard noticeBoard;
}
