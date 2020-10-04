package com.QSJ.repository;

import com.QSJ.entity.Type;

import java.util.List;

/**
 * @Package: com.QSJ.repository
 * @ClassName: TypeRepository
 * @Author: SamSung
 * @CreateTime: 2020-10-01 19:12
 * @Description:
 */
public interface TypeRepository {
    Type findById();

    List<Type> findAll();
}
