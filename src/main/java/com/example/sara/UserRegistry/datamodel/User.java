package com.example.sara.UserRegistry.datamodel;

import lombok.Data;

@Data
public class User {

    public User(String userId, String screenName) {
        this.userId = userId;
        this.screenName = screenName;
    }

    private String userId;
    private String screenName;
}
