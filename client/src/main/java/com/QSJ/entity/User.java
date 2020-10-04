package com.QSJ.entity;

import lombok.Data;

import java.util.Date;

/**
 * @Package: com.QSJ.entity
 * @ClassName: User
 * @Author: SamSung
 * @CreateTime: 2020-10-02 9:36
 * @Description:
 */
@Data
public class User {
    private long id;
    private String username;
    private String password;
    private String nickname;
    private String gender;
    private String telephone;
    private Date registerdate;
    private String address;

}
