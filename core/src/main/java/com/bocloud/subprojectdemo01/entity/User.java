package com.bocloud.subprojectdemo01.entity;

import lombok.Data;
import lombok.experimental.Accessors;

//@Accessors(chain = true)
@Data

public class User {
    private Integer id;
    private String name;
    private PhoneNumber phoneNumber;
}
