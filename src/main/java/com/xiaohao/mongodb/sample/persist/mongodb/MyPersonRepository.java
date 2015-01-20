package com.xiaohao.mongodb.sample.persist.mongodb;

import com.xiaohao.mongodb.sample.domain.Person;

/**
 * Created by xiaohao on 2015/1/20.
 */
public interface MyPersonRepository {

    public void savePerson(Person person);

}
