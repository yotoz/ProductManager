package com.productlist.firebase.helper.listener;

import com.productlist.firebase.model.User;

/**
 * This is used for checking user from checkUser method.
 * @author lico
 * @since 1.0
 * @version 2018.10.23
 */
public interface OnCheckUserListener {
    void onSucceed(User user);
    void onFailed();
}
