package com.QSJ.feign;

import com.QSJ.entity.Menu;
import com.QSJ.entity.Type;
import com.QSJ.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * @Package: com.QSJ.feign
 * @ClassName: UserFeign
 * @Author: SamSung
 * @CreateTime: 2020-10-02 10:21
 * @Description:
 */
@FeignClient(value = "user")
public interface UserFeign {

    @GetMapping("/user/findAll/{index}/{limit}")
    List<User> findAll(@PathVariable("index") int index, @PathVariable("limit") int limit);

    @GetMapping("/user/count")
    int count();

    @DeleteMapping("/user/deleteById/{id}")
    void deleteById(@PathVariable("id") long id);

    @GetMapping("/user/findTypes")
    List<Type> findTypes();

    @PostMapping("/user/save")
    void save(User user);

    @GetMapping("/user/findById/{id}")
    User findById(@PathVariable("id") long id);

    @PutMapping("/user/update")
    void update(User user);
}
