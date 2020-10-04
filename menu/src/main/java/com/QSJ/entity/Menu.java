package com.QSJ.entity;

import lombok.Data;

/**
 * @Package: com.QSJ.entity
 * @ClassName: Menu
 * @Author: SamSung
 * @CreateTime: 2020-09-30 20:36
 * @Description:
 */
@Data
public class Menu {
    private long id;
    private String name;
    private double price;
    private String flavor;
    private Type type;
}
