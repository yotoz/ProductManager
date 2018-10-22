package com.productlist.firebase.helper.listener;

/**
 * This is used when addProduct method adds a product into database.
 * @author lico
 * @since 1.0
 * @version 2018.10.23
 */
public interface OnAddProductListener {
    void onUpload();
    void onExist();
}
