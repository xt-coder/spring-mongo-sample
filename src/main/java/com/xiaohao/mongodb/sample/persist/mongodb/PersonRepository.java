package com.xiaohao.mongodb.sample.persist.mongodb;

import com.xiaohao.mongodb.sample.domain.Person;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by xiaohao on 2015/1/20.
 */

public interface PersonRepository extends MongoRepository<Person, ObjectId> {


}
