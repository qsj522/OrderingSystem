package com.QSJ.repository;

import com.QSJ.entity.User;

/**
 * @Package: com.QSJ.repository
 * @ClassName: UserRepository
 * @Author: SamSung
 * @CreateTime: 2020-10-03 10:28
 * @Description:
 */
public interface UserRepository {
    User login(String username , String password);
}
