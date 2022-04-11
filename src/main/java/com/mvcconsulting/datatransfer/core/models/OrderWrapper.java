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
        "status",
        "code",
        "data",
        "total",
        "total_pages",
        "current_page",
        "page_size"
})
@Generated("jsonschema2pojo")
public class OrderWrapper {

    @JsonProperty("status")
    private Integer status;
    @JsonProperty("code")
    private Integer code;
    @JsonProperty("data")
    private List<Order> data = null;
    @JsonProperty("total")
    private Integer total;
    @JsonProperty("total_pages")
    private Integer totalPages;
    @JsonProperty("current_page")
    private Integer currentPage;
    @JsonProperty("page_size")
    private Integer pageSize;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("status")
    public Integer getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(Integer status) {
        this.status = status;
    }

    @JsonProperty("code")
    public Integer getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(Integer code) {
        this.code = code;
    }

    @JsonProperty("data")
    public List<Order> getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(List<Order> data) {
        this.data = data;
    }

    @JsonProperty("total")
    public Integer getTotal() {
        return total;
    }

    @JsonProperty("total")
    public void setTotal(Integer total) {
        this.total = total;
    }

    @JsonProperty("total_pages")
    public Integer getTotalPages() {
        return totalPages;
    }

    @JsonProperty("total_pages")
    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    @JsonProperty("current_page")
    public Integer getCurrentPage() {
        return currentPage;
    }

    @JsonProperty("current_page")
    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    @JsonProperty("page_size")
    public Integer getPageSize() {
        return pageSize;
    }

    @JsonProperty("page_size")
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
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