package com._520it.crm.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Department {
    private Long id;
    //状态22222
    private String sn;
    //状态22222
    private String name;
    //状态2222
    private Employee manager;
    //状态2222
    private Department parent;
    //状态22222
    private Boolean state;


}