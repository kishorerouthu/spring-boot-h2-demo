package com.howtodoinjava.demo.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "PRODUCT_DETAILS")
public class ProductDetails implements Serializable {

    private static final long serialVersionUID=-23423423423l;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "product_id")
    private int productId;

    @Column(name = "variant_id")
    private int variantId;

    @Column(name = "seller_id")
    private int seller;

    @Column(name = "variant_value")
    private String variantValue;

    @Column(name = "sku")
    private String sku;

    @Column(name = "price")
    private double price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getVariantId() {
        return variantId;
    }

    public void setVariantId(int variantId) {
        this.variantId = variantId;
    }

    public String getVariantValue() {
        return variantValue;
    }

    public void setVariantValue(String variantValue) {
        this.variantValue = variantValue;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSeller() {
        return seller;
    }

    public void setSeller(int seller) {
        this.seller = seller;
    }

    @Override
    public String toString() {
        return "ProductDetails{" +
                "id=" + id +
                ", productId=" + productId +
                ", variantId=" + variantId +
                ", sku='" + sku + '\'' +
                ", price=" + price +
                '}';
    }
}
