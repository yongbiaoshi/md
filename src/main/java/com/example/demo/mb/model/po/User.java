package com.example.demo.mb.model.po;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class User {

    private String name;
    private String password;
    private Integer age;
}
