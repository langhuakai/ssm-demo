package com.wei.ssm.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String id;
    private String userName;
    private String sex;
    private Integer age;
    private Double weight;
}
