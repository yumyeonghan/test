package com.example.test.domain.user;

public enum Classification {

    UNDERGRADUATE_STUDENT("학부생"), POSTGRADUATE_STUDENT("대학원생"), PROFESSOR("교수");

    private String classificationToString;

    Classification(String classificationToString) {
        this.classificationToString = classificationToString;
    }
}
