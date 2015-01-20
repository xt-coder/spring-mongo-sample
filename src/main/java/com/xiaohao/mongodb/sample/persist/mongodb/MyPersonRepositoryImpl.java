package com.xiaohao.mongodb.sample.persist.mongodb;

import com.xiaohao.mongodb.sample.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by xiaohao on 2015/1/20.
 */
@Repository
public class MyPersonRepositoryImpl implements MyPersonRepository {

    @Autowired
    MongoTemplate template;

    @Override
    public void savePerson(Person person) {
        template.save(person);
    }
}
