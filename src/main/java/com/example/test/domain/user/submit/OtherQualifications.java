package com.example.test.domain.user.submit;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Comment;

@Entity
@Getter
@Setter
public class OtherQualifications {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Comment("기타자격")
    private String Qualification;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name =  "submitForm_id", foreignKey = @ForeignKey(name = "fk_other_qualifications_to_submit_form"))
    private SubmitForm submitForm;

}
