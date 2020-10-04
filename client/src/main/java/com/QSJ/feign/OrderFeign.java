package com.QSJ.feign;

import com.QSJ.entity.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * @Package: com.QSJ.feign
 * @ClassName: OrderFeign
 * @Author: SamSung
 * @CreateTime: 2020-10-04 16:23
 * @Description:
 */
@FeignClient(value = "order")
public interface OrderFeign {
    @PostMapping("/order/save")
    void save(Order order);

    @GetMapping("/order/findAllByUid/{index}/{limit}/{uid}")
    List<Order> findAllByUid(@PathVariable("index") int index ,@PathVariable("limit") int limit , @PathVariable("uid") int uid);

    @GetMapping("/order/countByUid/{uid}")
    int countByUid(@PathVariable("uid") int uid);

    @GetMapping("/order/findAll/{index}/{limit}")
    List<Order> findAll(@PathVariable("index") int index ,@PathVariable("limit") int limit);

    @GetMapping("/order/count")
    int count();

    @GetMapping("/order/update/{id}")
    void update(@PathVariable("id") long id);
}
