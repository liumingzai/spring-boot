package com.liub.controller;

import com.liub.domain.Liub;
import com.liub.domain.Result;
import com.liub.repository.LiubRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * LiubController
 *
 * @author： liubing           @email： liubing@proudsmart.com
 * @date： 2017/8/8.  @version：${VERSION}
 */

@RestController
public class LiubController {

    private final static Logger logger = LoggerFactory.getLogger(LiubController.class);


    @Autowired
    private LiubRepository liubRepository;

    @Autowired
    private MongoTemplate mongoTemplate;

    @GetMapping("save")
    public Result<Liub> addLiub(){
        Result result = new Result();

        Liub liub = new Liub();
        liub.setName("徐娟");
        liub.setAge(25.0);
        liub.setAddress("河南洛阳");
        liub.setSex("female");
        result.setMsg("");
        result.setCode(200);
        result.setData( liubRepository.save(liub));
        return result;
    }



    @GetMapping("findAll")
    public List<Liub> findAll(){
      return  liubRepository.findAll();
    }

    @GetMapping("finddByName")
    public Liub findByName(@RequestParam("name") String name){
      return   liubRepository.findByName(name);
    }

    @GetMapping("findAllByTemplate")
    public List<Liub> findAllByTemplate(){
        return mongoTemplate.findAll(Liub.class);
    }

}
