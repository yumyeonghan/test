package com.example.test.domain.user;

public enum Sex {

    MALE("남자"), FEMALE("여자");

    private String SexToString;

    Sex(String sexToString) {
        SexToString = sexToString;
    }
}
