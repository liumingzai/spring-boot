package com.liub.service;

import com.liub.Exception.UserException;
import com.liub.domain.User;
import com.liub.enums.ResultEnum;
import com.liub.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * UserService
 *
 * @author： liubing           @email： liubing@proudsmart.com
 * @date： 2017/7/20.  @version：${VERSION}
 */
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> findByUserName(String username){
        return userRepository.findByUserName(username);
    }


    public void findRoleByUserId(long id) throws Exception{
        User user = userRepository.findOne(id);
        if("admin".equals(user.getUserName())){
            throw  new UserException(ResultEnum.ADMIN);
        }else  if("root".equals(user.getUserName())){
            throw  new UserException(ResultEnum.SUPER_ADMIN);
        }else{
            throw  new UserException(ResultEnum.USER);
        }
    }


    /**
     * 用于测试的方法
     */
    public User findOne(long id){
      return  userRepository.findOne(id);
    }
}
