package com._520it.crm.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Department {
    private Long id;
    //状态
    private String sn;
    //状态
    private String name;
    //状态
    private Employee manager;
    //状态
    private Department parent;
    //状态
    private Boolean state;


}