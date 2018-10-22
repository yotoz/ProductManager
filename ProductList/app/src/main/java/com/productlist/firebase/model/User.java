package com.productlist.firebase.model;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * The matched model to user collection except id field from realtime of firebase.
 * @author lico
 * @since 1.0
 * @version 2018.10.23
 */
@IgnoreExtraProperties
public class User {
    // user types
    public final static String ADMIN_TYPE = "admin";
    public final static String USER_TYPE = "user";

    private String id;
    private String password;
    private String type;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
