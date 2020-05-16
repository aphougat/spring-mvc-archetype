package ${package}.entity;

import org.springframework.data.annotation.Id;

import java.util.List;

public class Cart {

    @Id
    private String _id;

    private String totalPrice;

    private String brand_id;

    private String jsessionid;

    private List<CartEntry> entries;

    public String getJsessionid() {
        return jsessionid;
    }

    public void setJsessionid(String jsessionid) {
        this.jsessionid = jsessionid;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    public List<CartEntry> getEntries() {
        return entries;
    }

    public void setEntries(List<CartEntry> entries) {
        this.entries = entries;
    }

    public String getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(String brand_id) {
        this.brand_id = brand_id;
    }
}
