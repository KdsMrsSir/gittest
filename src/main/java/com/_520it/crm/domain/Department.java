package com._520it.crm.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Department {
    private Long id;
    //状态33333 -b1分支  合并
    private String sn;
    //状态33333 -b1分支 合并
    private String name;
    //状态33333 -b1分支 合并
    private Employee manager;
    //状态33333 -b1分支 合并
    private Department parent;
    //状态33333 -b1分支
    private Boolean state;


}