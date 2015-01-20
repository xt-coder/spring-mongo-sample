package com.xiaohao.mongodb.sample.persist.mongodb;

import com.xiaohao.mongodb.sample.domain.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

/**
 * Created by xiaohao on 2015/1/20.
 */
@Repository
public class MyPersonRepositoryImpl implements MyPersonRepository {

    private final static Logger logger = LoggerFactory.getLogger(MyPersonRepositoryImpl.class);


    @Autowired
    MongoTemplate template;

    @Override
    public void savePerson(Person person) {
        template.save(person);

        List<Person> ps =template.find(new Query(Criteria.where("").is("小郝")),Person.class);

        logger.debug("名字是小郝的Person:"+ps.size());

    }
}
