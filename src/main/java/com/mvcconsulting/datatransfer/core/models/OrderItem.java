package com.mvcconsulting.datatransfer.core.models;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "sku",
        "title",
        "price",
        "qty_ordered",
        "shipping_fee"
})
@Generated("jsonschema2pojo")
public class OrderItem {

    @JsonProperty("sku")
    private String sku;
    @JsonProperty("title")
    private String title;
    @JsonProperty("price")
    private String price;
    @JsonProperty("qty_ordered")
    private String qtyOrdered;
    @JsonProperty("shipping_fee")
    private String shippingFee;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("sku")
    public String getSku() {
        return sku;
    }

    @JsonProperty("sku")
    public void setSku(String sku) {
        this.sku = sku;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("price")
    public String getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(String price) {
        this.price = price;
    }

    @JsonProperty("qty_ordered")
    public String getQtyOrdered() {
        return qtyOrdered;
    }

    @JsonProperty("qty_ordered")
    public void setQtyOrdered(String qtyOrdered) {
        this.qtyOrdered = qtyOrdered;
    }

    @JsonProperty("shipping_fee")
    public String getShippingFee() {
        return shippingFee;
    }

    @JsonProperty("shipping_fee")
    public void setShippingFee(String shippingFee) {
        this.shippingFee = shippingFee;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}