package com.liub.repository;

import com.liub.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * UserRepository
 *
 * @author： liubing           @email： liubing@proudsmart.com
 * @date： 2017/7/20.  @version：${VERSION}
 */
public interface UserRepository extends JpaRepository<User, Long> {


    //扩展查询
     List<User> findByUserName(String userName);
}
