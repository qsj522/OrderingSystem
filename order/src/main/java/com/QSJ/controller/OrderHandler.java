package com.QSJ.controller;

import com.QSJ.entity.Order;
import com.QSJ.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * @Package: com.QSJ.controller
 * @ClassName: OrderHandler
 * @Author: SamSung
 * @CreateTime: 2020-09-30 19:47
 * @Description:
 */
@RestController
@RequestMapping("/order")
public class OrderHandler {

    @Autowired
    private OrderRepository orderRepository;

    @PostMapping("/save")
    public void save(@RequestBody Order order) {
        order.setDate(new Date());
        orderRepository.save(order);
    }

    @GetMapping("/findAllByUid/{index}/{limit}/{uid}")
    public List<Order> findAll(@PathVariable("index") int index, @PathVariable("limit") int limit, @PathVariable("uid") int uid) {
        return orderRepository.findAllByUid(index,limit,uid);
    }

    @GetMapping("/countByUid/{uid}")
    public int countById(@PathVariable("uid") int uid){
        return orderRepository.countByUid(uid);
    }

    @GetMapping("/findAll/{index}/{limit}")
    public List<Order> findAll(@PathVariable("index") int index ,@PathVariable("limit") int limit){
        return orderRepository.findAll(index,limit);
    }

    @GetMapping("/update/{id}")
    public void update(@PathVariable("id") long id){
        orderRepository.update(id);
    }

    @GetMapping("/count")
    public int count(){
       return orderRepository.count();
    }

}
