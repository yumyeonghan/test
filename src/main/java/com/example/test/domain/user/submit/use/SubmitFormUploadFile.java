package com.example.test.domain.user.submit.use;

import com.example.test.domain.user.submit.SubmitForm;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Comment;

@Entity
@Getter
@Setter
public class SubmitFormUploadFile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Comment("유저가 업로드한 파일명")
    private String uploadFileName;
    @Comment("서버 내부에서 관리하는 파일명")
    private String storeFileName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "submitForm_id", foreignKey = @ForeignKey(name = "fk_submit_form_upload_file_to_notice_board"))
    private SubmitForm submitForm;
}
