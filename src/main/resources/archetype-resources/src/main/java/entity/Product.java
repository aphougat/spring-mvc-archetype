package ${package}.entity;

import org.springframework.data.annotation.Id;

public class Product {

    @Id
    private String _id;

    private String product_name;

    private String product_url;

    private String product_ean;

    private String product_purchasable;

    private String product_sale_price;

    private String product_mrp_price;

    private String product_category;

    private String product_availability;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_url() {
        return product_url;
    }

    public void setProduct_url(String product_url) {
        this.product_url = product_url;
    }

    public String getProduct_ean() {
        return product_ean;
    }

    public void setProduct_ean(String product_ean) {
        this.product_ean = product_ean;
    }

    public String getProduct_purchasable() {
        return product_purchasable;
    }

    public void setProduct_purchasable(String product_purchasable) {
        this.product_purchasable = product_purchasable;
    }

    public String getProduct_sale_price() {
        return product_sale_price;
    }

    public void setProduct_sale_price(String product_sale_price) {
        this.product_sale_price = product_sale_price;
    }

    public String getProduct_mrp_price() {
        return product_mrp_price;
    }

    public void setProduct_mrp_price(String product_mrp_price) {
        this.product_mrp_price = product_mrp_price;
    }

    public String getProduct_category() {
        return product_category;
    }

    public void setProduct_category(String product_category) {
        this.product_category = product_category;
    }

    public String getProduct_availability() {
        return product_availability;
    }

    public void setProduct_availability(String product_availability) {
        this.product_availability = product_availability;
    }
}
