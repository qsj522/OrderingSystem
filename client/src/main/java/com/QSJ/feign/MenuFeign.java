package com.QSJ.feign;

import com.QSJ.entity.Menu;
import com.QSJ.entity.Type;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Package: com.QSJ.feign
 * @ClassName: MenuFeign
 * @Author: SamSung
 * @CreateTime: 2020-10-01 15:23
 * @Description:
 */
@FeignClient(value = "menu")
public interface MenuFeign {

    @GetMapping("/menu/findAll/{index}/{limit}")
    List<Menu> findAll(@PathVariable("index") int index, @PathVariable("limit") int limit);

    @GetMapping("/menu/count")
    int count();

    @DeleteMapping("/menu/deleteById/{id}")
    void deleteById(@PathVariable("id") long id);

    @GetMapping("/menu/findTypes")
    List<Type> findTypes();

    @PostMapping("/menu/save")
    void save(Menu menu);

    @GetMapping("/menu/findById/{id}")
    Menu findById(@PathVariable("id") long id);

    @PutMapping("/menu/update")
    void update(Menu menu);
}
