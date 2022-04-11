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
        "result",
        "total",
        "page_no",
        "limit"
})
@Generated("jsonschema2pojo")
public class StockWrapper {

    @JsonProperty("result")
    private List<StockItem> result = null;
    @JsonProperty("total")
    private Integer total;
    @JsonProperty("page_no")
    private Integer pageNo;
    @JsonProperty("limit")
    private Integer limit;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("result")
    public List<StockItem> getResult() {
        return result;
    }

    @JsonProperty("result")
    public void setResult(List<StockItem> result) {
        this.result = result;
    }

    @JsonProperty("total")
    public Integer getTotal() {
        return total;
    }

    @JsonProperty("total")
    public void setTotal(Integer total) {
        this.total = total;
    }

    @JsonProperty("page_no")
    public Integer getPageNo() {
        return pageNo;
    }

    @JsonProperty("page_no")
    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    @JsonProperty("limit")
    public Integer getLimit() {
        return limit;
    }

    @JsonProperty("limit")
    public void setLimit(Integer limit) {
        this.limit = limit;
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