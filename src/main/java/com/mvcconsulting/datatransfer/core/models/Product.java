package com.mvcconsulting.datatransfer.core.models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "sku",
        "Category",
        "RRP",
        "RrpPrice",
        "Vendor_Product",
        "brand",
        "cost",
        "currency",
        "desc",
        "discontinuedproduct",
        "eancode",
        "entity_id",
        "height",
        "in_stock",
        "length",
        "price",
        "product_status",
        "status",
        "stock_qty",
        "title",
        "website_url",
        "weight",
        "width",
        "ETA",
        "bulky_item",
        "colour",
        "discontinued",
//        "zone_rates",
        "special_price",
        "special_price_end_date",
        "gallery",
        "freeshipping"
})
@Generated("jsonschema2pojo")
public class Product {

    @JsonProperty("sku")
    private String sku;
    @JsonProperty("Category")
    private String category;
    @JsonProperty("RRP")
    private ProductRrp rrp;
    @JsonProperty("RrpPrice")
    private String rrpPrice;
    @JsonProperty("Vendor_Product")
    private Integer vendorProduct;
    @JsonProperty("brand")
    private String brand;
    @JsonProperty("cost")
    private String cost;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("desc")
    private String desc;
    @JsonProperty("discontinuedproduct")
    private String discontinuedproduct;
    @JsonProperty("eancode")
    private String eancode;
    @JsonProperty("entity_id")
    private Integer entityId;
    @JsonProperty("height")
    private String height;
    @JsonProperty("in_stock")
    private String inStock;
    @JsonProperty("length")
    private String length;
    @JsonProperty("price")
    private String price;
    @JsonProperty("product_status")
    private Integer productStatus;
    @JsonProperty("status")
    private String status;
    @JsonProperty("stock_qty")
    private String stockQty;
    @JsonProperty("title")
    private String title;
    @JsonProperty("website_url")
    private String websiteUrl;
    @JsonProperty("weight")
    private String weight;
    @JsonProperty("width")
    private String width;
    @JsonProperty("ETA")
    private String eta;
    @JsonProperty("bulky_item")
    private String bulkyItem;
    @JsonProperty("colour")
    private String colour;
    @JsonProperty("discontinued")
    private String discontinued;
//    @JsonProperty("zone_rates")
//    @JsonIgnore
//    private ProductZoneRates zoneRates;
    @JsonProperty("special_price")
    private String specialPrice;
    @JsonProperty("special_price_end_date")
    private String specialPriceEndDate;
    @JsonProperty("gallery")
    private List<String> gallery = null;
    @JsonProperty("freeshipping")
    private String freeshipping;
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

    @JsonProperty("Category")
    public String getCategory() {
        return category;
    }

    @JsonProperty("Category")
    public void setCategory(String category) {
        this.category = category;
    }

    @JsonProperty("RRP")
    public ProductRrp getRrp() {
        return rrp;
    }

    @JsonProperty("RRP")
    public void setRrp(ProductRrp rrp) {
        this.rrp = rrp;
    }

    @JsonProperty("RrpPrice")
    public String getRrpPrice() {
        return rrpPrice;
    }

    @JsonProperty("RrpPrice")
    public void setRrpPrice(String rrpPrice) {
        this.rrpPrice = rrpPrice;
    }

    @JsonProperty("Vendor_Product")
    public Integer getVendorProduct() {
        return vendorProduct;
    }

    @JsonProperty("Vendor_Product")
    public void setVendorProduct(Integer vendorProduct) {
        this.vendorProduct = vendorProduct;
    }

    @JsonProperty("brand")
    public String getBrand() {
        return brand;
    }

    @JsonProperty("brand")
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @JsonProperty("cost")
    public String getCost() {
        return cost;
    }

    @JsonProperty("cost")
    public void setCost(String cost) {
        this.cost = cost;
    }

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    @JsonProperty("discontinuedproduct")
    public String getDiscontinuedproduct() {
        return discontinuedproduct;
    }

    @JsonProperty("discontinuedproduct")
    public void setDiscontinuedproduct(String discontinuedproduct) {
        this.discontinuedproduct = discontinuedproduct;
    }

    @JsonProperty("eancode")
    public String getEancode() {
        return eancode;
    }

    @JsonProperty("eancode")
    public void setEancode(String eancode) {
        this.eancode = eancode;
    }

    @JsonProperty("entity_id")
    public Integer getEntityId() {
        return entityId;
    }

    @JsonProperty("entity_id")
    public void setEntityId(Integer entityId) {
        this.entityId = entityId;
    }

    @JsonProperty("height")
    public String getHeight() {
        return height;
    }

    @JsonProperty("height")
    public void setHeight(String height) {
        this.height = height;
    }

    @JsonProperty("in_stock")
    public String getInStock() {
        return inStock;
    }

    @JsonProperty("in_stock")
    public void setInStock(String inStock) {
        this.inStock = inStock;
    }

    @JsonProperty("length")
    public String getLength() {
        return length;
    }

    @JsonProperty("length")
    public void setLength(String length) {
        this.length = length;
    }

    @JsonProperty("price")
    public String getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(String price) {
        this.price = price;
    }

    @JsonProperty("product_status")
    public Integer getProductStatus() {
        return productStatus;
    }

    @JsonProperty("product_status")
    public void setProductStatus(Integer productStatus) {
        this.productStatus = productStatus;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("stock_qty")
    public String getStockQty() {
        return stockQty;
    }

    @JsonProperty("stock_qty")
    public void setStockQty(String stockQty) {
        this.stockQty = stockQty;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("website_url")
    public String getWebsiteUrl() {
        return websiteUrl;
    }

    @JsonProperty("website_url")
    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    @JsonProperty("weight")
    public String getWeight() {
        return weight;
    }

    @JsonProperty("weight")
    public void setWeight(String weight) {
        this.weight = weight;
    }

    @JsonProperty("width")
    public String getWidth() {
        return width;
    }

    @JsonProperty("width")
    public void setWidth(String width) {
        this.width = width;
    }

    @JsonProperty("ETA")
    public String getEta() {
        return eta;
    }

    @JsonProperty("ETA")
    public void setEta(String eta) {
        this.eta = eta;
    }

    @JsonProperty("bulky_item")
    public String getBulkyItem() {
        return bulkyItem;
    }

    @JsonProperty("bulky_item")
    public void setBulkyItem(String bulkyItem) {
        this.bulkyItem = bulkyItem;
    }

    @JsonProperty("colour")
    public String getColour() {
        return colour;
    }

    @JsonProperty("colour")
    public void setColour(String colour) {
        this.colour = colour;
    }

    @JsonProperty("discontinued")
    public String getDiscontinued() {
        return discontinued;
    }

    @JsonProperty("discontinued")
    public void setDiscontinued(String discontinued) {
        this.discontinued = discontinued;
    }

//    @JsonProperty("zone_rates")
//    public ProductZoneRates getZoneRates() {
//        return zoneRates;
//    }
//
//    @JsonProperty("zone_rates")
//    public void setZoneRates(ProductZoneRates zoneRates) {
//        this.zoneRates = zoneRates;
//    }

    @JsonProperty("special_price")
    public String getSpecialPrice() {
        return specialPrice;
    }

    @JsonProperty("special_price")
    public void setSpecialPrice(String specialPrice) {
        this.specialPrice = specialPrice;
    }

    @JsonProperty("special_price_end_date")
    public String getSpecialPriceEndDate() {
        return specialPriceEndDate;
    }

    @JsonProperty("special_price_end_date")
    public void setSpecialPriceEndDate(String specialPriceEndDate) {
        this.specialPriceEndDate = specialPriceEndDate;
    }

    @JsonProperty("gallery")
    public List<String> getGallery() {
        return gallery;
    }

    @JsonProperty("gallery")
    public void setGallery(List<String> gallery) {
        this.gallery = gallery;
    }

    @JsonProperty("freeshipping")
    public String getFreeshipping() {
        return freeshipping;
    }

    @JsonProperty("freeshipping")
    public void setFreeshipping(String freeshipping) {
        this.freeshipping = freeshipping;
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