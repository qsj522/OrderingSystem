package com.QSJ.repository;

import com.QSJ.entity.Order;

import java.util.List;

/**
 * @Package: com.QSJ.repository
 * @ClassName: OrderRepository
 * @Author: SamSung
 * @CreateTime: 2020-10-04 15:46
 * @Description:
 */
public interface OrderRepository {
    void save(Order order);
    List<Order> findAllByUid(int index , int limit , int uid);
    int countByUid(int uid);
    List<Order> findAll(int index , int limit);
    void update(long id);
    int count();
}
