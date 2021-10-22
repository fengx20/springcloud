package com.fengx.feignservice.service;

import com.fengx.feignservice.domain.CommonResult;
import com.fengx.feignservice.domain.User;
import com.fengx.feignservice.service.impl.UserFallbackService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * @author: Fengx
 * @date: 2021-07-29
 * @description: 我们通过@FeignClient注解实现了一个Feign客户端，
 * 其中的value为user-service表示这是对user-service服务的接口调用客户端。
 * 我们可以回想下user-service中的UserController，只需将其改为接口，保留原来的SpringMvc注释即可。
 **/
@FeignClient(value = "user-service",fallback = UserFallbackService.class)
public interface UserService {
    @PostMapping("/user/create")
    CommonResult create(@RequestBody User user);

    @GetMapping("/user/{id}")
    CommonResult<User> getUser(@PathVariable Long id);

    @GetMapping("/user/getByUsername")
    CommonResult<User> getByUsername(@RequestParam String username);

    @PostMapping("/user/update")
    CommonResult update(@RequestBody User user);

    @PostMapping("/user/delete/{id}")
    CommonResult delete(@PathVariable Long id);
}
