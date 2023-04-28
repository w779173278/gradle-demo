package com.bocloud.subprojectdemo01.entity;

public class PhoneNumber {
    private Integer id;
    private PhoneNumberType type;

    enum PhoneNumberType {
        PUBLIC, PRIMARY
    }
}
