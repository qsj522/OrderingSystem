package com.QSJ.controller;

import com.QSJ.entity.Menu;
import com.QSJ.entity.Order;
import com.QSJ.entity.OrderVO;
import com.QSJ.entity.User;
import com.QSJ.feign.OrderFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

/**
 * @Package: com.QSJ.controller
 * @ClassName: OrderHandler
 * @Author: SamSung
 * @CreateTime: 2020-10-04 16:19
 * @Description:
 */
@Controller
@RequestMapping("/order")
public class OrderHandler {

    @Autowired
    private OrderFeign orderFeign;

    @GetMapping("/save/{mid}")
    public String save(@PathVariable("mid") int mid, HttpSession session) {
        User user = (User) session.getAttribute("user");
        Menu menu = new Menu();
        menu.setId(mid);
        Order order = new Order();
        order.setUser(user);
        order.setMenu(menu);
        orderFeign.save(order);
        return "index";
    }

    @GetMapping("/findAllByUid")
    @ResponseBody
    public OrderVO findAllByUid(@RequestParam("page") int page, @RequestParam("limit") int limit, HttpSession session) {
        int index = (page - 1) * limit;
        User user = (User) session.getAttribute("user");
        int uid = (int) user.getId();
        return new OrderVO(0, "", orderFeign.countByUid(uid), orderFeign.findAllByUid(index, limit, uid));
    }

    @GetMapping("/findAll")
    @ResponseBody
    public OrderVO findAll(@RequestParam("page") int page, @RequestParam("limit") int limit){
        int index = (page - 1) * limit;
        OrderVO orderVO = new OrderVO(0,"",orderFeign.count(),orderFeign.findAll(index,limit));
        return orderVO;
    }

    @GetMapping("/update/{id}")
    public String update(@PathVariable("id") long id){
        orderFeign.update(id);
        return "redirect:/menu/redirect/order_handler" ;
    }
}
