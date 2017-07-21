package com.liub.controller;

import com.liub.domain.Result;
import com.liub.domain.User;
import com.liub.repository.UserRepository;
import com.liub.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import util.ResultUtil;

import javax.validation.Valid;
import java.util.List;

/**
 * UserController
 *
 * @author： liubing           @email： liubing@proudsmart.com
 * @date： 2017/7/20.  @version：${VERSION}
 */
@RestController
public class UserController {

    private final static Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    @GetMapping(value = "/user")
    public List<User> getUsers(){
        logger.info("go in list method");
        return userRepository.findAll();
    }

    @PostMapping(value = "/user")
    public User addUser(@RequestParam("name") String name,@RequestParam("pass") String pass){
        System.out.println("go in add  method");
        User user = new User();
        user.setUserName(name);
        user.setUserPass(pass);
        return userRepository.save(user);
    }

    /**
     * 假如hibernate校验
     * @param user
     * @param bindingResult
     * @return
     */
    @PostMapping(value = "/userAdd")
    public User userAdd(@Valid User user , BindingResult bindingResult){

        if(bindingResult.hasFieldErrors()){
            System.out.println(bindingResult.getFieldError().getDefaultMessage());
            return null;
        }
        user.setUserName(user.getUserName());
        user.setUserPass(user.getUserPass());
        return userRepository.save(user);
    }

    /**
     * 将异常和错误信息返回给浏览器端包装在Result中
     * @param user
     * @param bindingResult
     * @return
     */
    @PostMapping(value = "/userAdd1")
    public Result<User> userAdd1(@Valid User user , BindingResult bindingResult){

        if(bindingResult.hasFieldErrors()){
            Result result = new Result();
            result.setCode(1);
            result.setMsg(bindingResult.getFieldError().getDefaultMessage());
            return result;
        }

        user.setUserName(user.getUserName());
        user.setUserPass(user.getUserPass());
        Result result = new Result();
        result.setCode(0);
        result.setMsg("success");
        result.setData(userRepository.save(user));

        return result;
    }

    /**
     * 将返回的Result放到util中处理，去掉重复代码
     * @param user
     * @param bindingResult
     * @return
     */
    @PostMapping(value = "/userAdd2")
    public Result<User> userAdd2(@Valid User user , BindingResult bindingResult){

        if(bindingResult.hasFieldErrors()){
//            return ResultUtil.error(1,bindingResult.getFieldError().getDefaultMessage());
            return null;
        }
        user.setUserName(user.getUserName());
        user.setUserPass(user.getUserPass());
        return  ResultUtil.success(userRepository.save(user));
    }



    @PostMapping(value = "/findUserById/{id}")
    public User findUserById(@PathVariable("id") long id){
        return userRepository.findOne(id);
    }

    /**
     * 笨拙的写法
     * @param id
     * @param name
     * @param pass
     * @return
     */
    @PostMapping(value = "/updateUserById/{id}")
    public User updateUserById(@PathVariable("id") long id,@RequestParam("name") String name,@RequestParam("pass") String pass){
        User user = userRepository.findOne(id);
        user.setUserName(name);
        user.setUserPass(pass);
        return userRepository.save(user);
    }

    /**
     * 简洁写法
     */
    @PutMapping(value = "findUserById/{id}")
    public User findUserById(@PathVariable("id") long id,@RequestParam("name") String name,@RequestParam("pass") String pass){
        User user = new User();
        user.setId(id);
        user.setUserName(name);
        user.setUserPass(pass);
        return userRepository.save(user);
    }

    @DeleteMapping(value = "deleteUserById/{id}")
    public void deleteUserById(@PathVariable("id") long id){
        userRepository.delete(id);
    }

    @GetMapping(value = "findByUserName/{user_name}")
    public List<User> findByUserName(@PathVariable("user_name") String user_name){
        return userService.findByUserName(user_name);
    }

    /**
     * 通过异常区区分
     * @param id
     * @throws Exception
     * 返回浏览器的是自动封装的，并非我们要返回的规则的json格式
     * {
    "timestamp": 1500603421085,
    "status": 404,
    "error": "Not Found",
    "message": "No message available",
    "path": "/findRoleByUserId/2"
    }
     */
    @GetMapping(value = "getRoleByUserId/{id}")
    public void getRoleByUserId(@PathVariable("id") long id) throws Exception{
        userService.findRoleByUserId(id);
    }
}
