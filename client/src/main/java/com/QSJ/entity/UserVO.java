package com.QSJ.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Package: com.QSJ.entity
 * @ClassName: UserVO
 * @Author: SamSung
 * @CreateTime: 2020-10-02 11:01
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserVO {
    private int code;
    private String msg;
    private int count;
    private List<User> data;
}
