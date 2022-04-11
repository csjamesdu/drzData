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
        "act",
        "nsw_m",
        "nsw_r",
        "nt_m",
        "nt_r",
        "qld_m",
        "qld_r",
        "remote",
        "sa_m",
        "sa_r",
        "tas_m",
        "tas_r",
        "vic_m",
        "vic_r",
        "wa_m",
        "wa_r"
})
@Generated("jsonschema2pojo")
public class ProductZoneRates {

    @JsonProperty("sku")
    private String sku;
    @JsonProperty("act")
    private String act;
    @JsonProperty("nsw_m")
    private String nswM;
    @JsonProperty("nsw_r")
    private String nswR;
    @JsonProperty("nt_m")
    private String ntM;
    @JsonProperty("nt_r")
    private String ntR;
    @JsonProperty("qld_m")
    private String qldM;
    @JsonProperty("qld_r")
    private String qldR;
    @JsonProperty("remote")
    private String remote;
    @JsonProperty("sa_m")
    private String saM;
    @JsonProperty("sa_r")
    private String saR;
    @JsonProperty("tas_m")
    private String tasM;
    @JsonProperty("tas_r")
    private String tasR;
    @JsonProperty("vic_m")
    private String vicM;
    @JsonProperty("vic_r")
    private String vicR;
    @JsonProperty("wa_m")
    private String waM;
    @JsonProperty("wa_r")
    private String waR;
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

    @JsonProperty("act")
    public String getAct() {
        return act;
    }

    @JsonProperty("act")
    public void setAct(String act) {
        this.act = act;
    }

    @JsonProperty("nsw_m")
    public String getNswM() {
        return nswM;
    }

    @JsonProperty("nsw_m")
    public void setNswM(String nswM) {
        this.nswM = nswM;
    }

    @JsonProperty("nsw_r")
    public String getNswR() {
        return nswR;
    }

    @JsonProperty("nsw_r")
    public void setNswR(String nswR) {
        this.nswR = nswR;
    }

    @JsonProperty("nt_m")
    public String getNtM() {
        return ntM;
    }

    @JsonProperty("nt_m")
    public void setNtM(String ntM) {
        this.ntM = ntM;
    }

    @JsonProperty("nt_r")
    public String getNtR() {
        return ntR;
    }

    @JsonProperty("nt_r")
    public void setNtR(String ntR) {
        this.ntR = ntR;
    }

    @JsonProperty("qld_m")
    public String getQldM() {
        return qldM;
    }

    @JsonProperty("qld_m")
    public void setQldM(String qldM) {
        this.qldM = qldM;
    }

    @JsonProperty("qld_r")
    public String getQldR() {
        return qldR;
    }

    @JsonProperty("qld_r")
    public void setQldR(String qldR) {
        this.qldR = qldR;
    }

    @JsonProperty("remote")
    public String getRemote() {
        return remote;
    }

    @JsonProperty("remote")
    public void setRemote(String remote) {
        this.remote = remote;
    }

    @JsonProperty("sa_m")
    public String getSaM() {
        return saM;
    }

    @JsonProperty("sa_m")
    public void setSaM(String saM) {
        this.saM = saM;
    }

    @JsonProperty("sa_r")
    public String getSaR() {
        return saR;
    }

    @JsonProperty("sa_r")
    public void setSaR(String saR) {
        this.saR = saR;
    }

    @JsonProperty("tas_m")
    public String getTasM() {
        return tasM;
    }

    @JsonProperty("tas_m")
    public void setTasM(String tasM) {
        this.tasM = tasM;
    }

    @JsonProperty("tas_r")
    public String getTasR() {
        return tasR;
    }

    @JsonProperty("tas_r")
    public void setTasR(String tasR) {
        this.tasR = tasR;
    }

    @JsonProperty("vic_m")
    public String getVicM() {
        return vicM;
    }

    @JsonProperty("vic_m")
    public void setVicM(String vicM) {
        this.vicM = vicM;
    }

    @JsonProperty("vic_r")
    public String getVicR() {
        return vicR;
    }

    @JsonProperty("vic_r")
    public void setVicR(String vicR) {
        this.vicR = vicR;
    }

    @JsonProperty("wa_m")
    public String getWaM() {
        return waM;
    }

    @JsonProperty("wa_m")
    public void setWaM(String waM) {
        this.waM = waM;
    }

    @JsonProperty("wa_r")
    public String getWaR() {
        return waR;
    }

    @JsonProperty("wa_r")
    public void setWaR(String waR) {
        this.waR = waR;
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