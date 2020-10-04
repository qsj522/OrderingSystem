package com.QSJ.controller;

import com.QSJ.repository.AdminRepository;
import com.QSJ.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Package: com.QSJ.controller
 * @ClassName: AccountHandler
 * @Author: SamSung
 * @CreateTime: 2020-10-03 10:39
 * @Description:
 */
@RestController
@RequestMapping("/account")
public class AccountHandler {

    @Autowired
    private AdminRepository adminRepository;
    @Autowired
    private UserRepository userRepository;

    @GetMapping ("/login/{username}/{password}/{type}")
    public Object login(@PathVariable("username") String username , @PathVariable("password") String password , @PathVariable("type") String type){
        Object object = null;
        switch (type){
            case "admin":
                object = adminRepository.login(username,password);
                break;
            case "user":
                object = userRepository.login(username,password);
                break;
        }
        return object;

    }

}
