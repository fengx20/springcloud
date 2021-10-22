package com.fengx.userservice.service;

import com.fengx.userservice.domain.User;

import java.util.List;

/**
 * @author: Fengx
 * @date: 2021-07-29
 * @description:
 **/
public interface UserService {

    void create(User user);

    User getUser(Long id);

    void update(User user);

    void delete(Long id);

    User getByUsername(String username);

    List<User> getUserByIds(List<Long> ids);
}
