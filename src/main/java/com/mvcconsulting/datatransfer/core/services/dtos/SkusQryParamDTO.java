package com.mvcconsulting.datatransfer.core.services.dtos;

public class SkusQryParamDTO {
    private String skus;

    public SkusQryParamDTO(String skus) {
        this.skus = skus;
    }

    public String getSkus() {
        return skus;
    }

    public void setSkus(String skus) {
        this.skus = skus;
    }
}
