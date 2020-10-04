package com.QSJ.controller;

import com.QSJ.entity.User;
import com.QSJ.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Package: com.QSJ.controller
 * @ClassName: UserHandler
 * @Author: SamSung
 * @CreateTime: 2020-10-02 9:32
 * @Description:
 */
@RestController
@RequestMapping("/user")
public class UserHandler {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/findAll/{index}/{limit}")
    public List<User> findAll(@PathVariable("index") int index ,@PathVariable("limit") int limit){
        return userRepository.findAll(index,limit);
    }

    @GetMapping("/findById/{id}")
    public User findById(@PathVariable("id") long id){
        return userRepository.findById(id);
    }

    @GetMapping("/count")
    public int count(){
        return userRepository.count();
    }

    @PostMapping("/save")
    public void  save(@RequestBody User user){
        userRepository.save(user);
    }

    @PutMapping("/update")
    public void update(@RequestBody User user){
        userRepository.update(user);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") long id){
        userRepository.deleteById(id);
    }

}
