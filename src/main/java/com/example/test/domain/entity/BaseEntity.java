package com.example.test.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import org.hibernate.annotations.Comment;

import java.time.LocalDateTime;

@MappedSuperclass
public class BaseEntity {

    @Column(updatable = false)
    @Comment("등록일")
    private LocalDateTime createdDate;

    @Comment("수정일")
    private LocalDateTime lastModifiedDate;

    @Comment("수정자")
    private String modifier;

    @PrePersist
    public void prePersist() {
        LocalDateTime now = LocalDateTime.now();
        createdDate = now;
        lastModifiedDate = now;
    }

    @PreUpdate
    public void preUpdate() {
        lastModifiedDate = LocalDateTime.now();
    }
}
