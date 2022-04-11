package com.mvcconsulting.datatransfer.core.models;

import java.util.HashMap;
import java.util.List;
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
        "increment_id",
        "created_at",
        "customer_email",
        "dispatch_time",
        "grand_total",
        "items",
        "payment_way",
        "remark",
        "serial_number",
        "shipment",
        "shipping_address",
        "status",
        "txn_id",
        "updated_at",
        "ordered_timestamp",
        "shipping_fee"
})
@Generated("jsonschema2pojo")
public class Order {
    @JsonProperty("increment_id")
    private String incrementId;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("customer_email")
    private String customerEmail;
    @JsonProperty("dispatch_time")
    private String dispatchTime;
    @JsonProperty("grand_total")
    private String grandTotal;
    @JsonProperty("items")
    private List<OrderItem> items = null;
    @JsonProperty("payment_way")
    private String paymentWay;
    @JsonProperty("remark")
    private Object remark;
    @JsonProperty("serial_number")
    private String serialNumber;
    @JsonProperty("shipment")
    private List<OrderShipment> shipment = null;
    @JsonProperty("shipping_address")
    private OrderShippingAddress shippingAddress;
    @JsonProperty("status")
    private String status;
    @JsonProperty("txn_id")
    private String txnId;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonProperty("ordered_timestamp")
    private Integer orderedTimestamp;
    @JsonProperty("shipping_fee")
    private String shippingFee;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("increment_id")
    public String getIncrementId() {
        return incrementId;
    }

    @JsonProperty("increment_id")
    public void setIncrementId(String incrementId) {
        this.incrementId = incrementId;
    }

    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("customer_email")
    public String getCustomerEmail() {
        return customerEmail;
    }

    @JsonProperty("customer_email")
    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    @JsonProperty("dispatch_time")
    public String getDispatchTime() {
        return dispatchTime;
    }

    @JsonProperty("dispatch_time")
    public void setDispatchTime(String dispatchTime) {
        this.dispatchTime = dispatchTime;
    }

    @JsonProperty("grand_total")
    public String getGrandTotal() {
        return grandTotal;
    }

    @JsonProperty("grand_total")
    public void setGrandTotal(String grandTotal) {
        this.grandTotal = grandTotal;
    }

    @JsonProperty("items")
    public List<OrderItem> getItems() {
        return items;
    }

    @JsonProperty("items")
    public void setItems(List<OrderItem> items) {
        this.items = items;
    }

    @JsonProperty("payment_way")
    public String getPaymentWay() {
        return paymentWay;
    }

    @JsonProperty("payment_way")
    public void setPaymentWay(String paymentWay) {
        this.paymentWay = paymentWay;
    }

    @JsonProperty("remark")
    public Object getRemark() {
        return remark;
    }

    @JsonProperty("remark")
    public void setRemark(Object remark) {
        this.remark = remark;
    }

    @JsonProperty("serial_number")
    public String getSerialNumber() {
        return serialNumber;
    }

    @JsonProperty("serial_number")
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @JsonProperty("shipment")
    public List<OrderShipment> getShipment() {
        return shipment;
    }

    @JsonProperty("shipment")
    public void setShipment(List<OrderShipment> shipment) {
        this.shipment = shipment;
    }

    @JsonProperty("shipping_address")
    public OrderShippingAddress getShippingAddress() {
        return shippingAddress;
    }

    @JsonProperty("shipping_address")
    public void setShippingAddress(OrderShippingAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("txn_id")
    public String getTxnId() {
        return txnId;
    }

    @JsonProperty("txn_id")
    public void setTxnId(String txnId) {
        this.txnId = txnId;
    }

    @JsonProperty("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("updated_at")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @JsonProperty("ordered_timestamp")
    public Integer getOrderedTimestamp() {
        return orderedTimestamp;
    }

    @JsonProperty("ordered_timestamp")
    public void setOrderedTimestamp(Integer orderedTimestamp) {
        this.orderedTimestamp = orderedTimestamp;
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
