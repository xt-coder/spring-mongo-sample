package com.xiaohao.mongodb.sample;

import com.mongodb.gridfs.GridFSDBFile;
import com.mongodb.gridfs.GridFSFile;
import com.xiaohao.mongodb.sample.domain.Person;
import com.xiaohao.mongodb.sample.persist.mongodb.MyPersonRepository;
import com.xiaohao.mongodb.sample.persist.mongodb.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.gridfs.GridFsTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

import java.util.List;

import static org.springframework.data.mongodb.core.query.Query.query;
import static org.springframework.data.mongodb.gridfs.GridFsCriteria.whereFilename;

/**
 * Created by xiaohao on 2015/1/20.
 */
@Component
public class Startor {

    @Autowired
    PersonRepository personRepository;

    @Autowired
    MyPersonRepository myPersonRepository;

    @Autowired
    GridFsTemplate gridFsTemplate;

    @PostConstruct
    public void test(){
        Person p = new Person();
        p.setId(58965788500L);
        p.setName("小郝");
        myPersonRepository.savePerson(p);
        personRepository.save(p);

        System.out.println();
        System.out.println();
        System.out.println("=====================");

        GridFSFile gridFSFile =gridFsTemplate.store(this.getClass().getClassLoader().getResourceAsStream("log4j.properties"), "testtt.txt");


        System.out.println();
        System.out.println();
        System.out.println("=====================");
        System.out.println(gridFSFile.getFilename());

        System.out.println();
        System.out.println();
        System.out.println("=====================");

        List<GridFSDBFile> result =gridFsTemplate.find(query(whereFilename().is("test.txt")));

        for(GridFSDBFile gff:result){
            System.out.println(gff.getUploadDate());
        }

    }
}
