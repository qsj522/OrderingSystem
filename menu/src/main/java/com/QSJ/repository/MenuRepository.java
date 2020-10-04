package com.QSJ.repository;

import com.QSJ.entity.Menu;

import java.util.List;

/**
 * @Package: com.QSJ.repository
 * @ClassName: MenuRepository
 * @Author: SamSung
 * @CreateTime: 2020-09-30 20:38
 * @Description:
 */
public interface MenuRepository {
    List<Menu> findAll(int index, int limit);

    Menu findById(long id);

    void save(Menu menu);

    void update(Menu menu);

    void deleteById(long id);

    int count();
}
