package com.xiaohao.mongodb.sample.domain;

import org.springframework.data.annotation.Id;

/**
 * Created by xiaohao on 2015/1/20.
 */
public class Person {

    @Id
    public Long id;


    public String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
