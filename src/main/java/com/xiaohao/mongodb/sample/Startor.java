package com.xiaohao.mongodb.sample;

import com.xiaohao.mongodb.sample.domain.Person;
import com.xiaohao.mongodb.sample.persist.mongodb.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by xiaohao on 2015/1/20.
 */
@Component
public class Startor {

    @Autowired
    PersonRepository personRepository;

    @PostConstruct
    public void test(){
        Person p = new Person();
        p.setId(589657885L);
        p.setName("小郝");
        personRepository.save(p);
    }
}
