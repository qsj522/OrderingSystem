package com.QSJ.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Package: com.QSJ.entity
 * @ClassName: OrderVO
 * @Author: SamSung
 * @CreateTime: 2020-10-04 16:56
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderVO {
    private int code;
    private String msg;
    private int count;
    private List<Order> data;
}
