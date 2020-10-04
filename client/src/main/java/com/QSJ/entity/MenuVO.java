package com.QSJ.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Package: com.QSJ.entity
 * @ClassName: MenuVO
 * @Author: SamSung
 * @CreateTime: 2020-10-01 17:04
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MenuVO {
    private int code;
    private String msg;
    private int count;
    private List<Menu> data;
}
