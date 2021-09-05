package com.venus.bean;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@Data
@ToString
public class User implements Serializable {

    private int id;
    private String username;
    private String password;
    private String token;
    private String phone;
    private String idCard;
    private List  likes;
}
