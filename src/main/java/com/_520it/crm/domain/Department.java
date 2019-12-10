package com._520it.crm.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Department {
    private Long id;
    //状态33333
    private String sn;
    //状态33333
    private String name;
    //状态33333
    private Employee manager;
    //状态33333
    private Department parent;
    //状态33333
    private Boolean state;


}