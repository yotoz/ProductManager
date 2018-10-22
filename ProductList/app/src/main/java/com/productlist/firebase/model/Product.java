package com.productlist.firebase.model;

/**
 * The matched model to product collection except name field from realtime of firebase.
 * @author lico
 * @since 1.0
 * @version 2018.10.23
 */
public class Product {
    // public constants
    public final static String EXIST_YES = "yes";
    public final static String EXIST_NO = "no";
    public final static String EXIST_DEFAULT_VALUE = EXIST_NO;

    private String name;
    private String explanation;
    private String image;
    private String exist;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getExist() {
        return exist;
    }

    public void setExist(String exist) {
        this.exist = exist;
    }
}
