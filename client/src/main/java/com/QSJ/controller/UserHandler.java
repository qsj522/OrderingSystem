package com.QSJ.controller;

import com.QSJ.entity.User;
import com.QSJ.entity.UserVO;
import com.QSJ.feign.UserFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;


/**
 * @Package: com.QSJ.controller
 * @ClassName: UserHandler
 * @Author: SamSung
 * @CreateTime: 2020-10-02 10:27
 * @Description:
 */
@Controller
@RequestMapping("/user")
public class UserHandler {
    @Autowired
    private UserFeign userFeign;

    @GetMapping("/findAll")
    @ResponseBody
    public UserVO findAll(@RequestParam("page") int page, @RequestParam("limit") int limit){
        int index = (page - 1)*limit;
        return new UserVO(0,"",userFeign.count(),userFeign.findAll(index, limit));
    }


    @GetMapping("/count")
    public int count(){
        return userFeign.count();
    }

    @PostMapping("/save")
    public String  save(User user){
        user.setRegisterdate(new Date());
        userFeign.save(user);
        return "redirect:/menu/redirect/user_manage";
    }

    @GetMapping("/deleteById/{id}")
    public String deleteById(@PathVariable("id") long id){
        userFeign.deleteById(id);
        return "redirect:/menu/redirect/user_manage";
    }


}
