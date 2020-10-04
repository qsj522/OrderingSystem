package com.QSJ.repository;

import com.QSJ.entity.User;

import java.util.List;

/**
 * @Package: com.QSJ.repository
 * @ClassName: UserRepository
 * @Author: SamSung
 * @CreateTime: 2020-10-02 9:45
 * @Description:
 */
public interface UserRepository {

    List<User> findAll(int index, int limit);

    User findById(long id);

    void save(User user);

    void update(User user);

    void deleteById(long id);

    int count();
}