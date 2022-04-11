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
        "category_id",
        "include_in_menu",
        "is_active",
        "is_anchor",
        "parent_id",
        "path",
        "title"
})
@Generated("jsonschema2pojo")
public class Category {

    @JsonProperty("category_id")
    private String categoryId;
    @JsonProperty("include_in_menu")
    private String includeInMenu;
    @JsonProperty("is_active")
    private Object isActive;
    @JsonProperty("is_anchor")
    private Object isAnchor;
    @JsonProperty("parent_id")
    private String parentId;
    @JsonProperty("path")
    private String path;
    @JsonProperty("title")
    private String title;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("category_id")
    public String getCategoryId() {
        return categoryId;
    }

    @JsonProperty("category_id")
    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    @JsonProperty("include_in_menu")
    public String getIncludeInMenu() {
        return includeInMenu;
    }

    @JsonProperty("include_in_menu")
    public void setIncludeInMenu(String includeInMenu) {
        this.includeInMenu = includeInMenu;
    }

    @JsonProperty("is_active")
    public Object getIsActive() {
        return isActive;
    }

    @JsonProperty("is_active")
    public void setIsActive(Object isActive) {
        this.isActive = isActive;
    }

    @JsonProperty("is_anchor")
    public Object getIsAnchor() {
        return isAnchor;
    }

    @JsonProperty("is_anchor")
    public void setIsAnchor(Object isAnchor) {
        this.isAnchor = isAnchor;
    }

    @JsonProperty("parent_id")
    public String getParentId() {
        return parentId;
    }

    @JsonProperty("parent_id")
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    @JsonProperty("path")
    public String getPath() {
        return path;
    }

    @JsonProperty("path")
    public void setPath(String path) {
        this.path = path;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
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