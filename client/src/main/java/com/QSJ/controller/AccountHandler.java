package com.QSJ.controller;

import com.QSJ.entity.Admin;
import com.QSJ.entity.User;
import com.QSJ.feign.AccountFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.LinkedHashMap;

/**
 * @Package: com.QSJ.controller
 * @ClassName: AccountHandler
 * @Author: SamSung
 * @CreateTime: 2020-10-03 11:09
 * @Description:
 */
@Controller
@RequestMapping("/account")
public class AccountHandler {
    @Autowired
    private AccountFeign accountFeign;

    @PostMapping("/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, @RequestParam("type") String type, HttpSession session) {
        Object object = accountFeign.login(username, password, type);
        LinkedHashMap hashMap = (LinkedHashMap)object;
        int id = 0;
        String result = null;
        if (object == null) {
            result = "login";
            return result;
        }
        switch (type) {
            case "user":
                User user = new User();
                id = (int) hashMap.get("id");
                String nickname = (String) hashMap.get("nickname");
                user.setId(id);
                user.setNickname(nickname);
                session.setAttribute("user",user);
                result = "index";
                break;
            case "admin":
                Admin admin = new Admin();
                 id = (int) hashMap.get("id");
                String username2 = (String) hashMap.get("username");
                admin.setId(id);
                admin.setUsername(username2);
                session.setAttribute("admin",admin);
                result = "main";
                break;
        }
        return result;
    }

    @GetMapping("/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:/login.html";
    }
}
