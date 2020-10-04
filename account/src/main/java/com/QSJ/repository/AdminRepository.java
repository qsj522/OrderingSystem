package com.QSJ.repository;

import com.QSJ.entity.Admin;

/**
 * @Package: com.QSJ.repository
 * @ClassName: AdminRepository
 * @Author: SamSung
 * @CreateTime: 2020-10-03 10:28
 * @Description:
 */
public interface AdminRepository {
    Admin login(String username , String password);
}
