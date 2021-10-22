package com.fengx.feignservice.service.impl;

import com.fengx.feignservice.domain.CommonResult;
import com.fengx.feignservice.domain.User;
import com.fengx.feignservice.service.UserService;
import org.springframework.stereotype.Component;

/**
 * @author: Fengx
 * @date: 2021-07-29
 * @description:
 **/
@Component
public class UserFallbackService {

//    @Override
//    public CommonResult create(User user) {
//        User defaultUser = new User(-1L, "defaultUser", "123456");
//        return new CommonResult<>(defaultUser);
//    }
//
//    @Override
//    public CommonResult<User> getUser(Long id) {
//        User defaultUser = new User(-1L, "defaultUser", "123456");
//        return new CommonResult<>(defaultUser);
//    }
//
//    @Override
//    public CommonResult<User> getByUsername(String username) {
//        User defaultUser = new User(-1L, "defaultUser", "123456");
//        return new CommonResult<>(defaultUser);
//    }
//
//    @Override
//    public CommonResult update(User user) {
//        return new CommonResult("调用失败，服务被降级",500);
//    }
//
//    @Override
//    public CommonResult delete(Long id) {
//        return new CommonResult("调用失败，服务被降级",500);
//    }
}
