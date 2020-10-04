package com.QSJ.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Package: com.QSJ.feign
 * @ClassName: AccountFeign
 * @Author: SamSung
 * @CreateTime: 2020-10-03 11:10
 * @Description:
 */
@FeignClient(value = "account")
public interface AccountFeign {
    @GetMapping("/account/login/{username}/{password}/{type}")
    Object login(@PathVariable("username") String username , @PathVariable("password") String password , @PathVariable("type") String type);
}
