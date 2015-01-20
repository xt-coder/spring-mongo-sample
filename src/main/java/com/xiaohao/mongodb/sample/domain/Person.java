package com.xiaohao.mongodb.sample.domain;

/**
 * Created by xiaohao on 2015/1/20.
 */
public class Person {

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
