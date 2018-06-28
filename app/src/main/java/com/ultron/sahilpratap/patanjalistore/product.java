package com.ultron.sahilpratap.patanjalistore;

import android.os.Parcelable;

import java.util.ArrayList;

public abstract class product {

    static ArrayList<Integer> productId = new ArrayList<Integer>();
    static ArrayList<String> productName = new ArrayList<String>();
    static ArrayList<Integer> productQuantity = new ArrayList<Integer>();
    static ArrayList<Double> productPrice = new ArrayList<Double>();

    public static ArrayList<Integer> getProductId() {
        return productId;
    }

    public static void setProductId(ArrayList<Integer> productId) {
        product.productId = productId;
    }

    public static ArrayList<String> getProductName() {
        return productName;
    }

    public static void setProductName(ArrayList<String> productName) {
        product.productName = productName;
    }

    public static ArrayList<Integer> getProductQuantity() {
        return productQuantity;
    }

    public static void setProductQuantity(ArrayList<Integer> productQuantity) {
        product.productQuantity = productQuantity;
    }

    public static ArrayList<Double> getProductPrice() {
        return productPrice;
    }

    public static void setProductPrice(ArrayList<Double> productPrice) {
        product.productPrice = productPrice;
    }

    public static void add(int id, String name, int qnty, double price){

        productId.add(id);
        productName.add(name);
        productQuantity.add(qnty);
        productPrice.add(price);

    }
}
