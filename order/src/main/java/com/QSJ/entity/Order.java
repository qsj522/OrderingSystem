package com.QSJ.entity;


import java.util.Date;

/**
 * @Package: com.QSJ.entity
 * @ClassName: Order
 * @Author: SamSung
 * @CreateTime: 2020-10-04 15:41
 * @Description:
 */
@lombok.Data
public class Order {
    private long id;
    private User user;
    private Menu menu;
    private Admin admin;
    private Date date;
    private int state;
}
