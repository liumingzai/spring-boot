package com.liub.repository;

import com.liub.domain.Liub;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * LiuRepository
 *
 * @author： liubing           @email： liubing@proudsmart.com
 * @date： 2017/8/8.  @version：${VERSION}
 */
public interface LiubRepository extends MongoRepository<Liub, Long> {

    Liub findByName(String name);

}
